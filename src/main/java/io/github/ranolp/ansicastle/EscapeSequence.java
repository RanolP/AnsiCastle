package io.github.ranolp.ansicastle;

import java.util.Objects;
import java.util.StringJoiner;

public enum EscapeSequence {
    CURSOR('H'),
    CURSOR_TO_COLUMN('G'),
    CURSOR_UP('A'),
    CURSOR_DOWN('B'),
    CURSOR_RIGHT('C'),
    CURSOR_LEFT('D'),
    CURSOR_NEXT_LINE('E'),
    CURSOR_PREVIOUS_LINE('F'),
    ERASE_SCREEN('J'),
    ERASE_LINE('K'),
    SCROLL_UP('S'),
    MODIFY_RENDER('m'),
    SCROLL_DOWN('T'),
    SAVE_CURSOR_POSITION('s'),
    RESTORE_CURSOR_POSITION('u');

    final char command;

    EscapeSequence(char command) {
        this.command = command;
    }

    public String render(Object... args) {
        StringJoiner joiner = new StringJoiner(";");
        for (Object arg : args) {
            if (arg != null) {
                joiner.add(Objects.toString(arg));
            }
        }
        return AnsiCastle.PREFIX + joiner.toString() + command;
    }
}
