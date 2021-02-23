package pieces;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PieceTest {

    @Test
    @DisplayName("흑폰 백폰이 제대로 생성되는지 확인")
    void createPawnPiece(){
        verifyPiece(Piece.createWhitePawn(),Piece.WHITE_COLOR, Piece.WHITE_PAWN_REPRESENTATION);
        verifyPiece(Piece.createBlackPawn(),Piece.BLACK_COLOR, Piece.BLACK_PAWN_REPRESENTATION);
    }

    @Test
    @DisplayName("흑나이트 백나이트가 제대로 생성되는지 확인")
    void createKnightPiece(){
        verifyPiece(Piece.createWhiteKnight(),Piece.WHITE_COLOR, Piece.WHITE_KNIGHT_REPRESENTATION);
        verifyPiece(Piece.createBlackKnight(),Piece.BLACK_COLOR, Piece.BLACK_KNIGHT_REPRESENTATION);
    }

    @Test
    @DisplayName("흑룩 백룩이 제대로 생성되는지 확인")
    void createRookPiece(){
        verifyPiece(Piece.createWhiteRook(),Piece.WHITE_COLOR, Piece.WHITE_ROOK_REPRESENTATION);
        verifyPiece(Piece.createBlackRook(),Piece.BLACK_COLOR, Piece.BLACK_ROOK_REPRESENTATION);
    }

    @Test
    @DisplayName("흑비숍 백비숏이 제대로 생성되는지 확인")
    void createBishopPiece(){
        verifyPiece(Piece.createWhiteBishop(),Piece.WHITE_COLOR, Piece.WHITE_BISHOP_REPRESENTATION);
        verifyPiece(Piece.createBlackBishop(),Piece.BLACK_COLOR, Piece.BLACK_BISHOP_REPRESENTATION);
    }

    @Test
    @DisplayName("흑퀸 백퀸이 제대로 생성되는지 확인")
    void createQueenPiece(){
        verifyPiece(Piece.createWhiteQueen(),Piece.WHITE_COLOR, Piece.WHITE_QUEEN_REPRESENTATION);
        verifyPiece(Piece.createBlackQueen(),Piece.BLACK_COLOR, Piece.BLACK_QUEEN_REPRESENTATION);
    }

    @Test
    @DisplayName("흑킹 백킹이 제대로 생성되는지 확인")
    void createKingPiece() {
        verifyPiece(Piece.createWhiteKing(),Piece.WHITE_COLOR, Piece.WHITE_KING_REPRESENTATION);
        verifyPiece(Piece.createBlackKing(),Piece.BLACK_COLOR, Piece.BLACK_KING_REPRESENTATION);
    }

    void verifyPiece(final Piece piece,final String color, final char representation) {
        assertAll(
                () -> assertThat(piece.getColor()).isEqualTo(color),
                () -> assertThat(piece.getRepresentation()).isEqualTo(representation)
        );
    }
}
