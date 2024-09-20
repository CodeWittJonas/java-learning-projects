package org.acme;

public class ComputerPlayer extends Player {
    private final MoveStrategy moveStrategy;

    public ComputerPlayer(char mark, MoveStrategy moveStrategy) {
        super(mark);
        this.moveStrategy = moveStrategy;
    }

    @Override
    public void makeMove(Board board) {
        int[] move = moveStrategy.getMove(board);
        int row = move[0];
        int col = move[1];
        System.out.println("Computer chose: " + (row + 1) + " " + (col + 1));
        board.placeMark(row, col, mark);
    }
}
