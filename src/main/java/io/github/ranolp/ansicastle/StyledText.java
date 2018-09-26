package io.github.ranolp.ansicastle;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class StyledText {
    private List<Object> texts;

    StyledText(List<Object> texts) {
        this.texts = new ArrayList<>(texts);
    }

    public String render() {
        return render(new RenderContext());
    }

    abstract void beforeRender(RenderContext context);

    private String render(RenderContext parentContext) {
        StringBuilder builder = new StringBuilder();
        RenderContext context = parentContext.copy();
        beforeRender(context);
        boolean resetRequired = false;
        if (!context.attributes.isEmpty()) {
            resetRequired = true;
            for (Attribute attribute : context.attributes) {
                builder.append(attribute);
            }
        }

        if (context.foreground != null) {
            builder.append(
                    context.foregroundBright ? context.foreground.brightForeground() : context.foreground.foreground());
            resetRequired = true;
        }

        if (context.background != null) {
            builder.append(
                    context.backgroundBright ? context.background.brightBackground() : context.background.background());
            resetRequired = true;
        }

        for (Object object : texts) {
            if (object instanceof StyledText) {
                StyledText casted = ((StyledText) object);
                builder.append(casted.render(context));
            } else {
                builder.append(object);
            }
        }

        if (resetRequired) {
            builder.append(Attribute.RESET);
        }

        return builder.toString();
    }

    @Override
    public String toString() {
        return render();
    }

    static class Foreground extends StyledText {
        private final Color foreground;
        private final boolean bright;

        public Foreground(List<Object> texts, Color foreground, boolean bright) {
            super(texts);
            this.foreground = foreground;
            this.bright = bright;
        }

        @Override
        protected void beforeRender(RenderContext context) {
            context.foreground = foreground;
            context.foregroundBright = bright;
        }
    }

    static class Background extends StyledText {
        private final Color background;
        private final boolean bright;

        public Background(List<Object> texts, Color background, boolean bright) {
            super(texts);
            this.background = background;
            this.bright = bright;
        }

        @Override
        protected void beforeRender(RenderContext context) {
            context.background = background;
            context.backgroundBright = bright;
        }
    }

    static class Attributed extends StyledText {
        private final Attribute attribute;

        public Attributed(Attribute attribute, List<Object> texts) {
            super(texts);
            this.attribute = attribute;
        }

        @Override
        protected void beforeRender(RenderContext context) {
            context.attributes.add(attribute);
        }
    }

    private class RenderContext {
        Color foreground = null;
        boolean foregroundBright = false;
        Color background = null;
        boolean backgroundBright = false;
        private Set<Attribute> attributes = new HashSet<>();

        public RenderContext copy() {
            RenderContext result = new RenderContext();
            result.attributes.addAll(attributes);
            result.foreground = this.foreground;
            result.foregroundBright = this.foregroundBright;
            result.background = this.background;
            result.backgroundBright = this.backgroundBright;
            return result;
        }
    }
}
