package org.acme;

public class Game {
    private Board board;
    private Player playerX;
    private Player playerO;

    public Game() {
        board = new Board();
        playerX = new HumanPlayer('X');

        MoveStrategy moveStrategy = new RandomStrategy();
        playerO = new ComputerPlayer('O', moveStrategy);
    }

    public void play() {
        Player currentPlayer = playerX;
        board.displayBoard();
        while (true) {
            System.out.println("Player " + currentPlayer.getMark() + "'s turn");
            currentPlayer.makeMove(board);
            board.displayBoard();

            if (board.checkWin(currentPlayer.getMark())) {
                System.out.println("Player " + currentPlayer.getMark() + " wins!");
                break;
            } else if (board.isFull()) {
                System.out.println("It's a draw!");
                break;
            }
            currentPlayer = (currentPlayer == playerX) ? playerO : playerX;
        }
    }
}