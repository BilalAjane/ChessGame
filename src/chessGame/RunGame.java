package chessGame;

public class RunGame {

    public static void main(String[] args) {

        Board board = new Board();

        System.out.println(board.toString());

        boxes[0][0] = new Position(0, 0, new Rook("White"));
        boxes[0][1] = new Position(0, 1, new Knight("White"));
        boxes[0][2] = new Position(0, 2, new Bishop("White"));
        boxes[0][3] = new Position(0, 3, new Queen("White"));
        boxes[0][4] = new Position(0, 4, new King("White"));
        boxes[0][5] = new Position(0, 5, new Bishop("White"));
        boxes[0][6] = new Position(0, 6, new Knight("White"));
        boxes[0][7] = new Position(0, 7, new Rook("White"));

        boxes[1][0] = new Position(1, 0, new Pawn("White"));
        boxes[1][1] = new Position(1, 1, new Pawn("White"));
        boxes[1][2] = new Position(1, 2, new Pawn("White"));
        boxes[1][3] = new Position(1, 3, new Pawn("White"));
        boxes[1][4] = new Position(1, 4, new Pawn("White"));
        boxes[1][5] = new Position(1, 5, new Pawn("White"));
        boxes[1][6] = new Position(1, 6, new Pawn("White"));
        boxes[1][7] = new Position(1, 7, new Pawn("White"));

        // initialize black pieces
        boxes[7][0] = new Position(7, 0, new Rook("Black"));
        boxes[7][1] = new Position(7, 1, new Knight("Black"));
        boxes[7][2] = new Position(7, 2, new Bishop("Black"));
        boxes[7][3] = new Position(7, 3, new Queen("Black"));
        boxes[7][4] = new Position(7, 4, new King("Black"));
        boxes[7][5] = new Position(7, 5, new Bishop("Black"));
        boxes[7][6] = new Position(7, 6, new Knight("Black"));
        boxes[7][7] = new Position(7, 7, new Rook("Black"));

        boxes[6][0] = new Position(6, 0, new Pawn("Black"));
        boxes[6][1] = new Position(6, 1, new Pawn("Black"));
        boxes[6][2] = new Position(6, 2, new Pawn("Black"));
        boxes[6][3] = new Position(6, 3, new Pawn("Black"));
        boxes[6][4] = new Position(6, 4, new Pawn("Black"));
        boxes[6][5] = new Position(6, 5, new Pawn("Black"));
        boxes[6][6] = new Position(6, 6, new Pawn("Black"));
        boxes[6][7] = new Position(6, 7, new Pawn("Black"));

        // initialize remaining boxes without any piece
        for (int i = 2; i < 6; i++) {
            for (int j = 0; j < 8; j++) {
                boxes[i][j] = new Position(i, j, null);

    }
}
