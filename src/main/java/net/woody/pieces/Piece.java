package net.woody.pieces;

import net.woody.chess.Representation;

import java.util.Objects;

public class Piece {
    public static final int BLACK_PIECES_RANK = 0;
    public static final int BLACK_PAWN_RANK = 1;
    public static final int WHITE_PAWN_RANK = 6;
    public static final int WHITE_PIECES_RANK = 7;

    private Color color;
    private char representation;

    private Piece(Color color, char representation) {
        this.color = color;
        this.representation = color.getRepresentation(representation);
    }

    public Color getColor() {
        return color;
    }

    public char getRepresentation() {
        return representation;
    }

    public boolean isWhite() {
        return color == Color.WHITE;
    }

    public boolean isBlack() {
        return color == Color.BLACK;
    }

    public static Piece createBlackPawn() {
        return new Piece(Color.BLACK, Representation.PAWN.value());
    }

    public static Piece createWhitePawn() {
        return new Piece(Color.WHITE, Representation.PAWN.value());
    }

    public static Piece createBlackKnight() {
        return new Piece(Color.BLACK, Representation.KNIGHT.value());
    }

    public static Piece createWhiteKnight() {
        return new Piece(Color.WHITE, Representation.KNIGHT.value());
    }

    public static Piece createBlackRook() {
        return new Piece(Color.BLACK, Representation.ROOK.value());
    }

    public static Piece createWhiteRook() {
        return new Piece(Color.WHITE, Representation.ROOK.value());
    }

    public static Piece createBlackBishop() {
        return new Piece(Color.BLACK, Representation.BISHOP.value());
    }

    public static Piece createWhiteBishop() {
        return new Piece(Color.WHITE, Representation.BISHOP.value());
    }

    public static Piece createBlackQueen() {
        return new Piece(Color.BLACK, Representation.QUEEN.value());
    }

    public static Piece createWhiteQueen() {
        return new Piece(Color.WHITE, Representation.QUEEN.value());
    }

    public static Piece createBlackKing() {
        return new Piece(Color.BLACK, Representation.KING.value());
    }

    public static Piece createWhiteKing() {
        return new Piece(Color.WHITE, Representation.KING.value());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Piece piece = (Piece) o;
        return representation == piece.representation && color == piece.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, representation);
    }
}
