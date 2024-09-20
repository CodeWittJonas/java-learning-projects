package org.acme;

import java.util.Scanner;

public class HumanPlayer extends Player {
    private Scanner scanner;

    public HumanPlayer(char mark) {
        super(mark);
        scanner = new Scanner(System.in);
    }

    @Override
    public void makeMove(Board board) {
        int row, col;
        do {
            System.out.println("Enter your move (row and column: 1 1 for top-left): ");
            row = scanner.nextInt() - 1; // Convert to zero-based index
            col = scanner.nextInt() - 1;
        } while (!board.isValidMove(row, col));
        board.placeMark(row, col, mark);
    }
}
