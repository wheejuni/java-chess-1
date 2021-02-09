package net.honux.chess;

public class Pawn {

    private Color color;

    public Pawn() {
        this(Color.white);
    }

    public Pawn(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
