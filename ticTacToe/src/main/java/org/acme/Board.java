package org.acme;

import java.util.Random;
import java.util.Scanner;

// Board class to manage the state of the Tic-Tac-Toe board
public class Board {
    private char[][] board;
    private final int SIZE = 3;

    public Board() {
        board = new char[SIZE][SIZE];
        initializeBoard();
    }

    // Initialize the board with empty spaces
    private void initializeBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = ' ';
            }
        }
    }

    // Display the current board state
    public void displayBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(board[i][j]);
                if (j < SIZE - 1) System.out.print(" | ");
            }
            System.out.println();
            if (i < SIZE - 1) System.out.println("---------");
        }
    }

    // Check if a move is valid (the position must be empty)
    public boolean isValidMove(int row, int col) {
        return row >= 0 && row < SIZE && col >= 0 && col < SIZE && board[row][col] == ' ';
    }

    // Place a mark ('X' or 'O') on the board
    public void placeMark(int row, int col, char mark) {
        board[row][col] = mark;
    }

    // Check if there is a winner
    public boolean checkWin(char mark) {
        // Check rows, columns, and diagonals
        for (int i = 0; i < SIZE; i++) {
            if (board[i][0] == mark && board[i][1] == mark && board[i][2] == mark) return true; // Row
            if (board[0][i] == mark && board[1][i] == mark && board[2][i] == mark) return true; // Column
        }
        // Check diagonals
        if (board[0][0] == mark && board[1][1] == mark && board[2][2] == mark) return true;
        if (board[0][2] == mark && board[1][1] == mark && board[2][0] == mark) return true;

        return false;
    }

    // Check if the board is full (i.e., it's a draw)
    public boolean isFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j] == ' ') return false;
            }
        }
        return true;
    }
}