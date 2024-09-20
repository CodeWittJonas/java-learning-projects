package org.acme;

public abstract class Player {
    protected char mark;

    public Player(char mark) {
        this.mark = mark;
    }

    public char getMark() {
        return mark;
    }

    // Abstract method for making a move, implemented by subclasses
    public abstract void makeMove(Board board);
}
