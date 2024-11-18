package nl.tudelft.jpacman.board;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for the Board class.
 */
public class BoardTest {

    /**
     * Tests creating a basic board with a single square.
     */
    @Test
    public void createBoardTest() {
        BasicSquare[][] bs = new BasicSquare[1][1];
        bs[0][0] = new BasicSquare();

        Board b = new Board(bs);

        // Check that the board's invariant holds
        assertThat(b.invariant()).isTrue();

        // Verify the square at (0, 0) also satisfies its invariant
        assertThat(b.squareAt(0, 0).invariant()).isTrue();
    }
}
