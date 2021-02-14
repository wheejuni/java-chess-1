package net.honux.chess;

import net.honux.pieces.Pawn;
import org.junit.jupiter.api.*;

import static org.assertj.core.api.Assertions.*;

class BoardTest {

    private Board board;

    @BeforeEach
    void setup() {
        this.board = new Board();
    }

    @Test
    @DisplayName("보드에 있는 폰을 정상적으로 찾을 수 있어야 한다.")
    void findPawnOnTheBoard() {
        Pawn firstPawn = new Pawn();
        addThePawnProperly(firstPawn, 0);

        Pawn secondPawn = new Pawn();
        addThePawnProperly(secondPawn, 1);
    }

    @Test
    @DisplayName("보드에 폰이 존재하지 않을 때, 폰을 찾으려고 시도하면 에러가 발생해야 한다.")
    void findPawnNotOnTheBoard() {
        assertThatThrownBy(() -> board.findPawn(0))
                .isInstanceOf(ArrayIndexOutOfBoundsException.class)
                .hasMessageContaining("Index number 0 is out of range!");
    }

    @Test
    @DisplayName("음수 인덱스로 폰을 찾으려고 할 때, 에러가 발생해야 한다.")
    void findPawnWithNegativeIndex() {
        assertThatThrownBy(() -> board.findPawn(-1))
                .isInstanceOf(ArrayIndexOutOfBoundsException.class)
                .hasMessageContaining("Index number -1 is out of range!");
    }

    private void addThePawnProperly(Pawn newPawn, int newPawnIdx) {
        int sizeBeforeAddThePawn = board.size();
        board.add(newPawn);
        assertThat(sizeBeforeAddThePawn + 1).isEqualTo(board.size());
        assertThat(newPawn).isEqualTo(board.findPawn(newPawnIdx));
    }
}
