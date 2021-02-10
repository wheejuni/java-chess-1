package net.sanhee.pieces;

public enum UnitColor{
    BLACK("black"), WHITE("white");

    private final String color;

    UnitColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}