package pieces;

import org.junit.jupiter.api.*;
import pieces.Color;
import pieces.Pawn;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PawnTest {

    @Test
    @DisplayName("흰색과 검정색 폰이 생성되어야 한다")
     void createPawn() {
        Pawn pawn = new Pawn(Color.WHITE);
        assertThat(pawn.getColor()).isEqualTo(Color.WHITE);
        Pawn pawn2 = new Pawn(Color.BLACK);
        assertThat(pawn2.getColor()).isEqualTo(Color.BLACK);
    }

    @Test
    @DisplayName("흰색 폰이 생성되어야 한다")
     void createBasicPawn(){
        Pawn pawn = new Pawn();
        assertThat(Color.WHITE).isEqualTo(pawn.getColor());
    }
}
