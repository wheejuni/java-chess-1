package chess.domain.board;

import chess.domain.board.position.Position;
import chess.domain.pieces.Piece;

import java.util.Map;

public class Board {
    private final Map<Position, Piece> squares;

    Board(Map<Position, Piece> squares) {
        this.squares = squares;
    }

    public Piece getPiece(Position position) {
        return squares.get(position);
    }
}
