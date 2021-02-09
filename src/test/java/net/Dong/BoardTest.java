package net.Dong;
import org.junit.jupiter.api.Test;
//import org.junit.;
import static org.junit.jupiter.api.Assertions.*;
import net.Dong.*;
import net.Dong.Pawn.*;
import net.Dong.Pawn.Color.*;




class BoardTest {
    @Test
    public void create() throws Exception {
        Board board = new Board();

        Pawn white = new Pawn(Color.WHITE);
        board.add(white);
        assertEquals(1, board.size());
        assertEquals(Color.WHITE, board.findPawn(0));

        Pawn black = new Pawn(Color.BALCK);
        board.add(black);
        assertEquals(2, board.size());
        assertEquals(Color.BALCK, board.findPawn(1));
    }
}