package io.github.ranolp;

import io.github.ranolp.ansicastle.StyledText;

import java.util.StringJoiner;

import static io.github.ranolp.ansicastle.AnsiCastle.*;

public class AnsiCastleExample {
    private static void print(StyledText... texts) {
        StringJoiner joiner = new StringJoiner(" ");
        for (StyledText text : texts) {
            joiner.add(text.render());
        }

        System.out.println(joiner.toString());
    }

    public static void main(String[] args) {
        print(bold("bold"), italic("italic"), underline("underline"), reversed("reversed"));

        print(
                fgBlack("fgBlack"), fgBlue("fgBlue"), fgCyan("fgCyan"), fgGreen("fgGreen"), fgMagenta("fgMagenta"),
                fgRed("fgRed"), fgWhite("fgWhite"), fgYellow("fgYellow")
        );

        print(
                fgBrightBlack("fgBrightBlack"), fgBrightBlue("fgBrightBlue"), fgBrightCyan("fgBrightCyan"),
                fgBrightGreen("fgBrightGreen"), fgBrightMagenta("fgBrightMagenta"), fgBrightRed("fgBrightRed"),
                fgBrightWhite("fgBrightWhite"), fgBrightYellow("fgBrightYellow")
        );

        print(
                bgBlack("bgBlack"), bgBlue("bgBlue"), bgCyan("bgCyan"), bgGreen("bgGreen"), bgMagenta("bgMagenta"),
                bgRed("bgRed"), bgWhite("bgWhite"), bgYellow("bgYellow")
        );

        print(
                bgBrightBlack("bgBrightBlack"), bgBrightBlue("bgBrightBlue"), bgBrightCyan("bgBrightCyan"),
                bgBrightGreen("bgBrightGreen"), bgBrightMagenta("bgBrightMagenta"), bgBrightRed("bgBrightRed"),
                bgBrightWhite("bgBrightWhite"), bgBrightYellow("bgBrightYellow")
        );

        print(bgGreen(fgRed("fgRed & bgGreen")));
    }
}
