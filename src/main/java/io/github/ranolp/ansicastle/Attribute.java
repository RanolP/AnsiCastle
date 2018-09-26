package io.github.ranolp.ansicastle;

public enum Attribute {
    RESET(0),
    BOLD(1),
    ITALIC(3),
    UNDERLINE(4),
    REVERSED(7);

    private final int id;

    Attribute(int id) {
        this.id = id;
    }

    public String render() {
        return AnsiCastle.PREFIX + id + AnsiCastle.SUFFIX;
    }

    @Override
    public String toString() {
        return render();
    }
}
