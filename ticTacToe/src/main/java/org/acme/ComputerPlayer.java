package org.acme;

import java.util.Random;

public class ComputerPlayer extends Player {

    public ComputerPlayer(char mark) {
        super(mark);
    }

    @Override
    public void makeMove(Board board) {
        Random random = new Random();
        int row, col;
        do {
            row = random.nextInt(3); // Random row from 0 to 2
            col = random.nextInt(3); // Random column from 0 to 2
        } while (!board.isValidMove(row, col));
        System.out.println("Computer chose: " + (row + 1) + " " + (col + 1));
        board.placeMark(row, col, mark);
    }
}
