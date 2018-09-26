package io.github.ranolp.ansicastle;

public enum Color {
    BLACK(0),
    RED(1),
    GREEN(2),
    YELLOW(3),
    BLUE(4),
    MAGENTA(5),
    CYAN(6),
    WHITE(7),
    DEFAULT(9);
    private int id;

    Color(int id) {
        this.id = id;
    }

    public String foreground() {
        return EscapeSequence.MODIFY_RENDER.render(id + 30);
    }

    public String brightForeground() {
        return EscapeSequence.MODIFY_RENDER.render(id + 30, 1);
    }

    public String background() {
        return EscapeSequence.MODIFY_RENDER.render(id + 40);
    }

    public String brightBackground() {
        return EscapeSequence.MODIFY_RENDER.render(id + 40, 1);
    }
}
