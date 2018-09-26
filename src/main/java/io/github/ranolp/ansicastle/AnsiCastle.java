package io.github.ranolp.ansicastle;

import java.util.Arrays;

/**
 * Utility class which is easy to use ansi escape characters
 */
public class AnsiCastle {
    /**
     * Internal value to make ansi escape codes
     */
    static final String PREFIX = "\u001b[";

    /**
     * Return styled text that applied bright foreground color
     *
     * @param color
     *         color to apply foreground (bright)
     * @param texts
     *         text to apply style
     * @return styled text
     */
    public static StyledText fgBright(Color color, Object... texts) {
        return new StyledText.Foreground(Arrays.asList(texts), color, true);
    }

    /**
     * Return styled text that applied bright background color
     *
     * @param color
     *         color to apply background (bright)
     * @param texts
     *         text to apply style
     * @return styled text
     */
    public static StyledText bgBright(Color color, Object... texts) {
        return new StyledText.Background(Arrays.asList(texts), color, true);
    }

    /**
     * Return styled text that applied foreground color
     *
     * @param color
     *         color to apply foreground
     * @param texts
     *         text to apply style
     * @return styled text
     */
    public static StyledText fg(Color color, Object... texts) {
        return new StyledText.Foreground(Arrays.asList(texts), color, false);
    }

    /**
     * Return styled text that applied background color
     *
     * @param color
     *         color to apply background
     * @param texts
     *         text to apply style
     * @return styled text
     */
    public static StyledText bg(Color color, Object... texts) {
        return new StyledText.Background(Arrays.asList(texts), color, false);
    }


    /**
     * Return styled text that applied black foreground color
     *
     * @param texts
     *         text to apply style
     * @return styled text
     */
    public static StyledText fgBlack(Object... texts) {
        return fg(Color.BLACK, texts);
    }

    /**
     * Return styled text that applied red foreground color
     *
     * @param texts
     *         text to apply style
     * @return styled text
     */
    public static StyledText fgRed(Object... texts) {
        return fg(Color.RED, texts);
    }

    /**
     * Return styled text that applied green foreground color
     *
     * @param texts
     *         text to apply style
     * @return styled text
     */
    public static StyledText fgGreen(Object... texts) {
        return fg(Color.GREEN, texts);
    }

    /**
     * Return styled text that applied yellow foreground color
     *
     * @param texts
     *         text to apply style
     * @return styled text
     */
    public static StyledText fgYellow(Object... texts) {
        return fg(Color.YELLOW, texts);
    }

    /**
     * Return styled text that applied blue foreground color
     *
     * @param texts
     *         text to apply style
     * @return styled text
     */
    public static StyledText fgBlue(Object... texts) {
        return fg(Color.BLUE, texts);
    }

    /**
     * Return styled text that applied magenta foreground color
     *
     * @param texts
     *         text to apply style
     * @return styled text
     */
    public static StyledText fgMagenta(Object... texts) {
        return fg(Color.MAGENTA, texts);
    }

    /**
     * Return styled text that applied cyan foreground color
     *
     * @param texts
     *         text to apply style
     * @return styled text
     */
    public static StyledText fgCyan(Object... texts) {
        return fg(Color.CYAN, texts);
    }

    /**
     * Return styled text that applied white foreground color
     *
     * @param texts
     *         text to apply style
     * @return styled text
     */
    public static StyledText fgWhite(Object... texts) {
        return fg(Color.WHITE, texts);
    }

    /**
     * Return styled text that applied default foreground color
     *
     * @param texts
     *         text to apply style
     * @return styled text
     */
    public static StyledText fgDefault(Object... texts) {
        return fg(Color.DEFAULT, texts);
    }

    /**
     * Return styled text that applied black foreground color (bright)
     *
     * @param texts
     *         text to apply style
     * @return styled text
     */
    public static StyledText fgBrightBlack(Object... texts) {
        return fgBright(Color.BLACK, texts);
    }

    /**
     * Return styled text that applied red foreground color (bright)
     *
     * @param texts
     *         text to apply style
     * @return styled text
     */
    public static StyledText fgBrightRed(Object... texts) {
        return fgBright(Color.RED, texts);
    }

    /**
     * Return styled text that applied green foreground color (bright)
     *
     * @param texts
     *         text to apply style
     * @return styled text
     */
    public static StyledText fgBrightGreen(Object... texts) {
        return fgBright(Color.GREEN, texts);
    }

    /**
     * Return styled text that applied yellow foreground color (bright)
     *
     * @param texts
     *         text to apply style
     * @return styled text
     */
    public static StyledText fgBrightYellow(Object... texts) {
        return fgBright(Color.YELLOW, texts);
    }

    /**
     * Return styled text that applied blue foreground color (bright)
     *
     * @param texts
     *         text to apply style
     * @return styled text
     */
    public static StyledText fgBrightBlue(Object... texts) {
        return fgBright(Color.BLUE, texts);
    }

    /**
     * Return styled text that applied magenta foreground color (bright)
     *
     * @param texts
     *         text to apply style
     * @return styled text
     */
    public static StyledText fgBrightMagenta(Object... texts) {
        return fgBright(Color.MAGENTA, texts);
    }

    /**
     * Return styled text that applied cyan foreground color (bright)
     *
     * @param texts
     *         text to apply style
     * @return styled text
     */
    public static StyledText fgBrightCyan(Object... texts) {
        return fgBright(Color.CYAN, texts);
    }

    /**
     * Return styled text that applied white foreground color (bright)
     *
     * @param texts
     *         text to apply style
     * @return styled text
     */
    public static StyledText fgBrightWhite(Object... texts) {
        return fgBright(Color.WHITE, texts);
    }

    /**
     * Return styled text that applied black background color
     *
     * @param texts
     *         text to apply style
     * @return styled text
     */
    public static StyledText bgBlack(Object... texts) {
        return bg(Color.BLACK, texts);
    }

    /**
     * Return styled text that applied red background color
     *
     * @param texts
     *         text to apply style
     * @return styled text
     */
    public static StyledText bgRed(Object... texts) {
        return bg(Color.RED, texts);
    }

    /**
     * Return styled text that applied green background color
     *
     * @param texts
     *         text to apply style
     * @return styled text
     */
    public static StyledText bgGreen(Object... texts) {
        return bg(Color.GREEN, texts);
    }

    /**
     * Return styled text that applied yellow background color
     *
     * @param texts
     *         text to apply style
     * @return styled text
     */
    public static StyledText bgYellow(Object... texts) {
        return bg(Color.YELLOW, texts);
    }

    /**
     * Return styled text that applied blue background color
     *
     * @param texts
     *         text to apply style
     * @return styled text
     */
    public static StyledText bgBlue(Object... texts) {
        return bg(Color.BLUE, texts);
    }

    /**
     * Return styled text that applied magenta background color
     *
     * @param texts
     *         text to apply style
     * @return styled text
     */
    public static StyledText bgMagenta(Object... texts) {
        return bg(Color.MAGENTA, texts);
    }

    /**
     * Return styled text that applied cyan background color
     *
     * @param texts
     *         text to apply style
     * @return styled text
     */
    public static StyledText bgCyan(Object... texts) {
        return bg(Color.CYAN, texts);
    }

    /**
     * Return styled text that applied white background color
     *
     * @param texts
     *         text to apply style
     * @return styled text
     */
    public static StyledText bgWhite(Object... texts) {
        return bg(Color.WHITE, texts);
    }

    /**
     * Return styled text that applied default background color
     *
     * @param texts
     *         text to apply style
     * @return styled text
     */
    public static StyledText bgDefault(Object... texts) {
        return bg(Color.DEFAULT, texts);
    }

    /**
     * Return styled text that applied black background color (bright)
     *
     * @param texts
     *         text to apply style
     * @return styled text
     */
    public static StyledText bgBrightBlack(Object... texts) {
        return bgBright(Color.BLACK, texts);
    }

    /**
     * Return styled text that applied red background color (bright)
     *
     * @param texts
     *         text to apply style
     * @return styled text
     */
    public static StyledText bgBrightRed(Object... texts) {
        return bgBright(Color.RED, texts);
    }

    /**
     * Return styled text that applied green background color (bright)
     *
     * @param texts
     *         text to apply style
     * @return styled text
     */
    public static StyledText bgBrightGreen(Object... texts) {
        return bgBright(Color.GREEN, texts);
    }

    /**
     * Return styled text that applied yellow background color (bright)
     *
     * @param texts
     *         text to apply style
     * @return styled text
     */
    public static StyledText bgBrightYellow(Object... texts) {
        return bgBright(Color.YELLOW, texts);
    }

    /**
     * Return styled text that applied blue background color (bright)
     *
     * @param texts
     *         text to apply style
     * @return styled text
     */
    public static StyledText bgBrightBlue(Object... texts) {
        return bgBright(Color.BLUE, texts);
    }

    /**
     * Return styled text that applied magenta background color (bright)
     *
     * @param texts
     *         text to apply style
     * @return styled text
     */
    public static StyledText bgBrightMagenta(Object... texts) {
        return bgBright(Color.MAGENTA, texts);
    }

    /**
     * Return styled text that applied cyan background color (bright)
     *
     * @param texts
     *         text to apply style
     * @return styled text
     */
    public static StyledText bgBrightCyan(Object... texts) {
        return bgBright(Color.CYAN, texts);
    }

    /**
     * Return styled text that applied white background color (bright)
     *
     * @param texts
     *         text to apply style
     * @return styled text
     */
    public static StyledText bgBrightWhite(Object... texts) {
        return bgBright(Color.WHITE, texts);
    }

    /**
     * Return styled text that applied some attribute
     *
     * @param attribute
     *         attribute to apply
     * @param texts
     *         text to apply style
     * @return styled text
     */
    public static StyledText attribute(Attribute attribute, Object... texts) {
        return new StyledText.Attributed(attribute, Arrays.asList(texts));
    }

    /**
     * Return styled text that applied attribute bold
     *
     * @param texts
     *         text to apply style
     * @return styled text
     */
    public static StyledText bold(Object... texts) {
        return attribute(Attribute.BOLD, texts);
    }

    /**
     * Return styled text that applied attribute italic
     *
     * @param texts
     *         text to apply style
     * @return styled text
     */
    public static StyledText italic(Object... texts) {
        return attribute(Attribute.ITALIC, texts);
    }

    /**
     * Return styled text that applied attribute underline
     *
     * @param texts
     *         text to apply style
     * @return styled text
     */
    public static StyledText underline(Object... texts) {
        return attribute(Attribute.UNDERLINE, texts);
    }

    /**
     * Return styled text that applied attribute reversed
     *
     * @param texts
     *         text to apply style
     * @return styled text
     */
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
