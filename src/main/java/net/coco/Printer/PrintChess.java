package net.coco.Printer;

public class PrintChess {
    private static final String BLANK = "********\n";

    public static void printBoard(String blackPawns, String whitePawns) {
        StringBuilder boardPrint = new StringBuilder();
        boardPrint.append(BLANK)
                .append(blackPawns + "\n")
                .append(BLANK)
                .append(BLANK)
                .append(BLANK)
                .append(BLANK)
                .append(whitePawns + "\n")
                .append(BLANK);

        System.out.println(boardPrint);
    }
}
