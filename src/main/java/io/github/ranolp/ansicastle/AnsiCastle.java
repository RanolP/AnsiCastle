package io.github.ranolp.ansicastle;

import java.util.Arrays;

public class AnsiCastle {
    static final String PREFIX = "\u001b[";
    static final String SUFFIX = "m";

    public static StyledText fgBright(Color color, Object... texts) {
        return new StyledText.Foreground(Arrays.asList(texts), color, true);
    }

    public static StyledText bgBright(Color color, Object... texts) {
        return new StyledText.Background(Arrays.asList(texts), color, true);
    }

    public static StyledText fg(Color color, Object... texts) {
        return new StyledText.Foreground(Arrays.asList(texts), color, false);
    }

    public static StyledText bg(Color color, Object... texts) {
        return new StyledText.Background(Arrays.asList(texts), color, false);
    }

    public static StyledText fgBlack(Object... texts) {
        return fg(Color.BLACK, texts);
    }

    public static StyledText fgRed(Object... texts) {
        return fg(Color.RED, texts);
    }

    public static StyledText fgGreen(Object... texts) {
        return fg(Color.GREEN, texts);
    }

    public static StyledText fgYellow(Object... texts) {
        return fg(Color.YELLOW, texts);
    }

    public static StyledText fgBlue(Object... texts) {
        return fg(Color.BLUE, texts);
    }

    public static StyledText fgMagenta(Object... texts) {
        return fg(Color.MAGENTA, texts);
    }

    public static StyledText fgCyan(Object... texts) {
        return fg(Color.CYAN, texts);
    }

    public static StyledText fgWhite(Object... texts) {
        return fg(Color.WHITE, texts);
    }

    public static StyledText fgDefault(Object... texts) {
        return fg(Color.DEFAULT, texts);
    }

    public static StyledText fgBrightRed(Object... texts) {
        return fgBright(Color.RED, texts);
    }

    public static StyledText fgBrightGreen(Object... texts) {
        return fgBright(Color.GREEN, texts);
    }

    public static StyledText fgBrightYellow(Object... texts) {
        return fgBright(Color.YELLOW, texts);
    }

    public static StyledText fgBrightBlack(Object... texts) {
        return fgBright(Color.BLACK, texts);
    }

    public static StyledText fgBrightBlue(Object... texts) {
        return fgBright(Color.BLUE, texts);
    }

    public static StyledText fgBrightMagenta(Object... texts) {
        return fgBright(Color.MAGENTA, texts);
    }

    public static StyledText fgBrightCyan(Object... texts) {
        return fgBright(Color.CYAN, texts);
    }

    public static StyledText fgBrightWhite(Object... texts) {
        return fgBright(Color.WHITE, texts);
    }


    public static StyledText bgBlack(Object... texts) {
        return bg(Color.BLACK, texts);
    }

    public static StyledText bgRed(Object... texts) {
        return bg(Color.RED, texts);
    }

    public static StyledText bgGreen(Object... texts) {
        return bg(Color.GREEN, texts);
    }

    public static StyledText bgYellow(Object... texts) {
        return bg(Color.YELLOW, texts);
    }

    public static StyledText bgBlue(Object... texts) {
        return bg(Color.BLUE, texts);
    }

    public static StyledText bgMagenta(Object... texts) {
        return bg(Color.MAGENTA, texts);
    }

    public static StyledText bgCyan(Object... texts) {
        return bg(Color.CYAN, texts);
    }

    public static StyledText bgWhite(Object... texts) {
        return bg(Color.WHITE, texts);
    }

    public static StyledText bgDefault(Object... texts) {
        return bg(Color.DEFAULT, texts);
    }

    public static StyledText bgBrightBlack(Object... texts) {
        return bgBright(Color.BLACK, texts);
    }

    public static StyledText bgBrightRed(Object... texts) {
        return bgBright(Color.RED, texts);
    }

    public static StyledText bgBrightGreen(Object... texts) {
        return bgBright(Color.GREEN, texts);
    }

    public static StyledText bgBrightYellow(Object... texts) {
        return bgBright(Color.YELLOW, texts);
    }

    public static StyledText bgBrightBlue(Object... texts) {
        return bgBright(Color.BLUE, texts);
    }

    public static StyledText bgBrightMagenta(Object... texts) {
        return bgBright(Color.MAGENTA, texts);
    }

    public static StyledText bgBrightCyan(Object... texts) {
        return bgBright(Color.CYAN, texts);
    }

    public static StyledText bgBrightWhite(Object... texts) {
        return bgBright(Color.WHITE, texts);
    }

    public static StyledText attribute(Attribute attribute, Object... texts) {
        return new StyledText.Attributed(attribute, Arrays.asList(texts));
    }

    public static StyledText bold(Object... texts) {
        return attribute(Attribute.BOLD, texts);
    }

    public static StyledText italic(Object... texts) {
        return attribute(Attribute.ITALIC, texts);
    }

    public static StyledText underline(Object... texts) {
        return attribute(Attribute.UNDERLINE, texts);
    }

    public static StyledText reversed(Object... texts) {
        return attribute(Attribute.REVERSED, texts);
    }

    public static String cursor(int row, int column) {
        return EscapeSequence.CURSOR.render(row, column);
    }

    public static String cursorToColumn(int column) {
        return EscapeSequence.CURSOR_TO_COLUMN.render(column);
    }

    public static String cursorUp(int y) {
        if (y < 0) {
            throw new IllegalArgumentException("y must be bigger than 0 but " + y + " received");
        }
        return EscapeSequence.CURSOR_UP.render(y);
    }

    public static String cursorDown(int y) {
        if (y < 0) {
            throw new IllegalArgumentException("y must be bigger than 0 but " + y + " received");
        }
        return EscapeSequence.CURSOR_DOWN.render(y);
    }

    public static String cursorRight(int x) {
        if (x < 0) {
            throw new IllegalArgumentException("x must be bigger than 0 but " + x + " received");
        }
        return EscapeSequence.CURSOR_RIGHT.render(x);
    }

    public static String cursorLeft(int x) {
        if (x < 0) {
            throw new IllegalArgumentException("x must be bigger than 0 but " + x + " received");
        }
        return EscapeSequence.CURSOR_LEFT.render(x);
    }

    public static String cursorNextLine(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be bigger than 0 but " + n + " received");
        }
        return EscapeSequence.CURSOR_NEXT_LINE.render(n);
    }

    public static String cursorPreviousLine(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be bigger than 0 but " + n + " received");
        }
        return EscapeSequence.CURSOR_PREVIOUS_LINE.render(n);
    }

    public static String eraseScreenForward() {
        return EscapeSequence.ERASE_SCREEN.render(0);
    }

    public static String eraseScreenBackward() {
        return EscapeSequence.ERASE_SCREEN.render(1);
    }

    public static String eraseScreen() {
        return EscapeSequence.ERASE_SCREEN.render(2);
    }

    public static String eraseLineForward() {
        return EscapeSequence.ERASE_LINE.render(0);
    }

    public static String eraseLineBackward() {
        return EscapeSequence.ERASE_LINE.render(1);
    }

    public static String eraseLine() {
        return EscapeSequence.ERASE_LINE.render(2);
    }

    public static String scrollUp(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be bigger than 0 but " + n + " received");
        }
        return EscapeSequence.SCROLL_UP.render(n);
    }

    public static String scrollDown(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be bigger than 0 but " + n + " received");
        }
        return EscapeSequence.SCROLL_DOWN.render(n);
    }

    public static String saveCursorPosition() {
        return EscapeSequence.SAVE_CURSOR_POSITION.render();
    }

    public static String restoreCursorPosition() {
        return EscapeSequence.RESTORE_CURSOR_POSITION.render();
    }

    public static void println(Object... objects) {
        StringBuilder builder = new StringBuilder();
        for (Object object : objects) {
            builder.append(object.toString());
        }
        System.out.println(builder.toString());
    }
}
