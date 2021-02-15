package mj.chess.pieces;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class PawnTest {

    @Test
    @DisplayName("기본 생성자로 흰색 폰 생성")
    public void create_pawn() {
        verifyColorOfPawn(new Pawn(), ColorOfPiece.WHITE);
    }

    @Test
    @DisplayName("흰색 폰 생성")
    public void create_pawn_check_color_white() {
        verifyColorOfPawn(new Pawn(ColorOfPiece.WHITE), ColorOfPiece.WHITE);
    }

    @Test
    @DisplayName("검은색 폰 생성")
    public void create_pawn_check_color_balck() {
        verifyColorOfPawn(new Pawn(ColorOfPiece.BLACK), ColorOfPiece.BLACK);
    }

    public void verifyColorOfPawn(Pawn pawn, ColorOfPiece color) {
        assertThat(pawn.getColor()).isEqualTo(color);
    }
}
