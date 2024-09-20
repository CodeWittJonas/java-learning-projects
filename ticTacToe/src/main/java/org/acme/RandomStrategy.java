package org.acme;

import java.util.Random;

// RandomStrategy: Picks a random valid move on the board
public class RandomStrategy implements MoveStrategy {
    private Random random;

    public RandomStrategy() {
        random = new Random();
    }

    @Override
    public int[] getMove(Board board) {
        int row, col;
        do {
            row = random.nextInt(3); // Random row from 0 to 2
            col = random.nextInt(3); // Random column from 0 to 2
        } while (!board.isValidMove(row, col));
        return new int[]{row, col};
    }
}

