import net.sanhee.chess.*;
import net.sanhee.pieces.Pawn;
import net.sanhee.pieces.UnitColor;
import org.junit.jupiter.api.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BoardTest {

    Board board;
    int totalPawnCnt;

    @BeforeEach
    void boardTestInit(){
        board = new Board();
        totalPawnCnt = 0;
    }

    @Test
    @DisplayName("[테스트] 체스 판에 Pawn 추가 및 유효성 검사")
    void createPawn() {
        Pawn whitePawn = spawnPawn(UnitColor.WHITE);
        Pawn blackPawn  = spawnPawn(UnitColor.BLACK);

        //m 실제 스폰된 폰의 개수와 add 개수가 맞는지 검사하는 메소드
        pawnSizeCheck();

        //m 입력 idx에 pawn이 스폰되있는지 검사하는 메소드
        pawnLocationCheck(whitePawn,0);
        pawnLocationCheck(blackPawn,1);
    }

    Pawn spawnPawn(UnitColor color) {
        Pawn pawn = new Pawn(color);
        board.add(pawn);
        totalPawnCnt++;

        return pawn;
    }

    void pawnSizeCheck() {
        assertThat(board.size()).isEqualTo(totalPawnCnt);
    }

    void pawnLocationCheck(Pawn pawn, int idx){
        assertThat(board.findPawn(idx)).isEqualTo(pawn);
    }

}