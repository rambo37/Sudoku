package sudoku.board;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SudokuBoardTest {

    @Test
    public void testUnsolvableSize9GameCreation() {
        // Two 1's in the same row
        String unsolvable = """
                *,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,
                1,*,*,*,*,*,*,1,*,
                *,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,
                """;

        // Two 1's in the same column
        String unsolvable2 = """
                1,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,
                1,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,
                """;

        // Two 1's in the same box
        String unsolvable3 = """
                *,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,1,*,*,
                *,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,1,
                *,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,
                """;

        assertThrows(IllegalStateException.class, () -> new SudokuBoard(9, unsolvable));
        assertThrows(IllegalStateException.class, () -> new SudokuBoard(9, unsolvable2));
        assertThrows(IllegalStateException.class, () -> new SudokuBoard(9, unsolvable3));
    }

    @Test
    public void testUnsolvableSize16GameCreation() {
        // Two 1's in the same row
        String unsolvable = """
                *,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,
                *,*,1,*,*,*,*,*,*,1,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,
                """;

        // Two 1's in the same column
        String unsolvable2 = """
                *,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,*,*,*,1,*,*,*,
                *,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,*,*,*,1,*,*,*,
                """;

        // Two 1's in the same box
        String unsolvable3 = """
                *,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,1,*,*,*,*,*,*,*,*,*,
                *,*,*,*,1,*,*,*,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,
                """;

        assertThrows(IllegalStateException.class, () -> new SudokuBoard(16, unsolvable));
        assertThrows(IllegalStateException.class, () -> new SudokuBoard(16, unsolvable2));
        assertThrows(IllegalStateException.class, () -> new SudokuBoard(16, unsolvable3));
    }

    @Test
    public void testEasilySolvableGameCreation() {
        String easy = """
                2,3,*,9,1,5,*,*,*
                *,*,*,2,*,*,5,4,*
                6,*,7,*,*,*,*,*,*
                *,*,1,*,*,*,*,*,9
                8,9,*,5,*,3,*,1,7
                5,*,*,*,*,*,6,*,*
                *,*,*,*,*,*,9,*,5
                *,1,6,*,*,7,*,*,*
                *,*,*,3,2,9,*,*,1
                """;

        SudokuBoard board = new SudokuBoard(9, easy);
        assertTrue(board.solved());
        assertTrue(board.verifySolution());

        String easyBig = """
                16,8,14,3,12,13,4,6,7,5,15,2,10,11,9,1
                7,13,12,5,11,9,2,3,10,4,8,1,15,16,14,6
                1,10,9,4,16,15,14,8,3,12,11,6,2,7,13,5
                11,15,2,6,10,7,5,1,13,16,9,14,8,4,12,3
                2,12,1,14,7,6,8,15,9,11,10,3,16,13,5,4
                3,5,11,16,1,10,12,13,14,8,4,7,6,9,15,2
                15,7,13,9,2,4,16,14,1,6,5,12,3,8,11,10
                10,6,4,8,5,3,11,9,2,15,13,16,1,14,7,12
                13,14,10,2,4,5,3,16,15,7,6,9,12,1,8,11
                12,11,5,1,8,2,6,7,4,13,14,10,9,15,3,16
                9,3,6,7,13,12,15,10,11,1,16,8,5,2,4,14
                8,4,16,15,14,1,9,11,12,3,2,5,7,6,10,13
                4,2,7,10,15,16,13,12,6,9,3,11,14,5,1,8
                14,1,15,13,9,8,10,5,16,2,12,4,11,3,6,7
                6,16,8,12,3,11,1,4,5,14,7,15,13,10,2,9
                5,9,3,11,6,14,7,2,8,10,1,13,*,*,*,*
                """;

        SudokuBoard bigBoard = new SudokuBoard(16, easyBig);
        assertTrue(bigBoard.solved());
        assertTrue(bigBoard.verifySolution());

    }

    @Test
    public void testNotEasilySolvableGameCreation() {
        String game = """
                *,1,4,*,6,*,3,*,*
                6,2,*,*,*,4,*,*,9
                *,8,*,*,5,*,6,*,*
                *,6,*,2,*,*,*,*,3
                *,7,*,*,1,*,*,5,*
                5,*,*,*,*,9,*,6,*
                *,*,6,*,2,*,*,3,*
                1,*,*,5,*,*,*,9,2
                *,*,7,*,9,*,4,1,*
                """;

        SudokuBoard board = new SudokuBoard(9, game);
        assertFalse(board.solved());

        String bigGame = """
                *,*,*,*,*,*,*,*,7,*,*,*,*,*,*,*
                7,*,*,*,11,*,*,*,*,*,*,*,*,*,*,*
                1,*,*,*,16,*,14,*,3,*,11,*,2,*,*,*
                *,*,2,*,*,*,5,*,*,*,*,*,*,*,*,*
                2,*,*,*,*,*,*,*,*,*,*,*,16,*,*,*
                *,*,11,*,1,*,12,*,14,*,*,*,*,*,*,*
                15,*,*,*,*,*,16,*,*,*,*,*,*,*,*,*
                *,*,*,*,5,*,*,*,2,*,*,*,*,*,7,*
                *,*,*,*,4,*,*,*,*,*,*,*,*,*,8,*
                *,*,*,*,8,*,6,*,*,*,14,*,*,*,3,*
                *,*,*,*,13,*,15,*,11,*,16,*,5,*,4,*
                *,*,16,*,*,*,9,*,12,*,*,*,*,*,*,*
                *,*,*,*,*,*,13,*,6,*,*,*,*,*,*,*
                14,*,*,*,*,*,10,*,*,*,12,*,11,*,*,*
                *,*,*,*,3,*,*,*,5,*,*,*,*,*,*,*
                *,*,*,*,*,*,*,*,*,*,1,*,*,*,16,*
                 """;

        SudokuBoard bigBoard = new SudokuBoard(16, bigGame);
        assertFalse(bigBoard.solved());
    }


    @Test
    public void testClone() {
        String game = """
                *,1,4,*,6,*,3,*,*
                6,2,*,*,*,4,*,*,9
                *,8,*,*,5,*,6,*,*
                *,6,*,2,*,*,*,*,3
                *,7,*,*,1,*,*,5,*
                5,*,*,*,*,9,*,6,*
                *,*,6,*,2,*,*,3,*
                1,*,*,5,*,*,*,9,2
                *,*,7,*,9,*,4,1,*
                """;

        SudokuBoard board = new SudokuBoard(9, game);
        SudokuBoard board2 = board.clone();
        assertNotSame(board, board2);
        assertEquals(board.toString(), board2.toString());

        String bigGame = """
                *,*,*,*,*,*,*,*,7,*,*,*,*,*,*,*
                7,*,*,*,11,*,*,*,*,*,*,*,*,*,*,*
                1,*,*,*,16,*,14,*,3,*,11,*,2,*,*,*
                *,*,2,*,*,*,5,*,*,*,*,*,*,*,*,*
                2,*,*,*,*,*,*,*,*,*,*,*,16,*,*,*
                *,*,11,*,1,*,12,*,14,*,*,*,*,*,*,*
                15,*,*,*,*,*,16,*,*,*,*,*,*,*,*,*
                *,*,*,*,5,*,*,*,2,*,*,*,*,*,7,*
                *,*,*,*,4,*,*,*,*,*,*,*,*,*,8,*
                *,*,*,*,8,*,6,*,*,*,14,*,*,*,3,*
                *,*,*,*,13,*,15,*,11,*,16,*,5,*,4,*
                *,*,16,*,*,*,9,*,12,*,*,*,*,*,*,*
                *,*,*,*,*,*,13,*,6,*,*,*,*,*,*,*
                14,*,*,*,*,*,10,*,*,*,12,*,11,*,*,*
                *,*,*,*,3,*,*,*,5,*,*,*,*,*,*,*
                *,*,*,*,*,*,*,*,*,*,1,*,*,*,16,*
                 """;

        SudokuBoard bigBoard = new SudokuBoard(16, bigGame);
        SudokuBoard bigBoard2 = bigBoard.clone();
        assertNotSame(bigBoard, bigBoard2);
        assertEquals(bigBoard.toString(), bigBoard2.toString());
    }

    @Test
    public void testCompareTo() {
        String game = """
                1,2,3,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,
                """;

        String game2 = """
                1,2,3,*,*,*,*,*,*,
                4,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,
                """;

        SudokuBoard board = new SudokuBoard(9, game);
        SudokuBoard board2 = new SudokuBoard(9, game2);

        // Board2 should have a lower heuristic value as it has more filled squares and thus is
        // closer to being a solution
        assertTrue(board.compareTo(board2) > 0);
        assertTrue(board2.compareTo(board) < 0);

        String game3 = """
                1,2,3,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,4,*,
                """;

        SudokuBoard board3 = new SudokuBoard(9, game3);

        // Board3 should have a lower heuristic value as board2 and board3 have the same number of
        // filled squares, but board3 has fewer total candidates remaining
        assertTrue(board3.compareTo(board2) < 0);
        assertTrue(board2.compareTo(board3) > 0);
    }

    @Test
    public void testCompareToSize16Board() {
        String game = """
                1,2,3,4,*,*,*,*,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,
                """;

        String game2 = """
                1,2,3,4,*,*,*,*,*,*,*,*,*,*,*,*,
                5,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,
                """;

        SudokuBoard board = new SudokuBoard(16, game);
        SudokuBoard board2 = new SudokuBoard(16, game2);

        // Board2 should have a lower heuristic value as it has more filled squares and thus is
        // closer to being a solution
        assertTrue(board.compareTo(board2) > 0);
        assertTrue(board2.compareTo(board) < 0);

        String game3 = """
                1,2,3,4,*,*,*,*,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,
                *,*,*,*,*,*,*,*,*,*,*,*,*,5,*,*,
                """;

        SudokuBoard board3 = new SudokuBoard(16 , game3);

        // Board3 should have a lower heuristic value as board2 and board3 have the same number of
        // filled squares, but board3 has fewer total candidates remaining
        assertTrue(board3.compareTo(board2) < 0);
        assertTrue(board2.compareTo(board3) > 0);
    }

    @Test
    public void testSuccessors() {
        String game = """
                *,1,4,*,6,*,3,*,*
                6,2,*,*,*,4,*,*,9
                *,8,*,*,5,*,6,*,*
                *,6,*,2,*,*,*,*,3
                *,7,*,*,1,*,*,5,*
                5,*,*,*,*,9,*,6,*
                *,*,6,*,2,*,*,3,*
                1,*,*,5,*,*,*,9,2
                *,*,7,*,9,*,4,1,*
                """;

        SudokuBoard board = new SudokuBoard(9, game);
        List<SudokuBoard> successors = board.getSuccessors();
        assertFalse(successors.isEmpty());

        // the successors should all be closer to being a solution
        for (SudokuBoard successor : successors) {
            assertTrue(board.compareTo(successor) > 0);
        }


        String bigGame = """
                *,*,*,*,*,*,*,*,7,*,*,*,*,*,*,*
                7,*,*,*,11,*,*,*,*,*,*,*,*,*,*,*
                1,*,*,*,16,*,14,*,3,*,11,*,2,*,*,*
                *,*,2,*,*,*,5,*,*,*,*,*,*,*,*,*
                2,*,*,*,*,*,*,*,*,*,*,*,16,*,*,*
                *,*,11,*,1,*,12,*,14,*,*,*,*,*,*,*
                15,*,*,*,*,*,16,*,*,*,*,*,*,*,*,*
                *,*,*,*,5,*,*,*,2,*,*,*,*,*,7,*
                *,*,*,*,4,*,*,*,*,*,*,*,*,*,8,*
                *,*,*,*,8,*,6,*,*,*,14,*,*,*,3,*
                *,*,*,*,13,*,15,*,11,*,16,*,5,*,4,*
                *,*,16,*,*,*,9,*,12,*,*,*,*,*,*,*
                *,*,*,*,*,*,13,*,6,*,*,*,*,*,*,*
                14,*,*,*,*,*,10,*,*,*,12,*,11,*,*,*
                *,*,*,*,3,*,*,*,5,*,*,*,*,*,*,*
                *,*,*,*,*,*,*,*,*,*,1,*,*,*,16,*
                 """;

        SudokuBoard bigBoard = new SudokuBoard(16, bigGame);
        successors = bigBoard.getSuccessors();
        assertFalse(successors.isEmpty());

        // the successors should all be closer to being a solution
        for (SudokuBoard successor : successors) {
            assertTrue(bigBoard.compareTo(successor) > 0);
        }
    }

    @Test
    public void testVerifySolution() {
        String game = """
                *,1,4,*,6,*,3,*,*
                6,2,*,*,*,4,*,*,9
                *,8,*,*,5,*,6,*,*
                *,6,*,2,*,*,*,*,3
                *,7,*,*,1,*,*,5,*
                5,*,*,*,*,9,*,6,*
                *,*,6,*,2,*,*,3,*
                1,*,*,5,*,*,*,9,2
                *,*,7,*,9,*,4,1,*
                """;
        SudokuBoard board = new SudokuBoard(9, game);
        assertThrows(IllegalStateException.class, board::verifySolution);


        String solved = """
                 2,3,4,9,1,5,7,8,6
                 1,8,9,2,7,6,5,4,3
                 6,5,7,4,3,8,1,9,2
                 4,6,1,7,8,2,3,5,9
                 8,9,2,5,6,3,4,1,7
                 5,7,3,1,9,4,6,2,8
                 3,2,8,6,4,1,9,7,5
                 9,1,6,8,5,7,2,3,4
                 7,4,5,3,2,9,8,6,1
                """;
        SudokuBoard solvedBoard = new SudokuBoard(9, solved);
        assertTrue(solvedBoard.solved());
        assertTrue(solvedBoard.verifySolution());


        String solvedBig = """
                16,8,14,3,12,13,4,6,7,5,15,2,10,11,9,1
                7,13,12,5,11,9,2,3,10,4,8,1,15,16,14,6
                1,10,9,4,16,15,14,8,3,12,11,6,2,7,13,5
                11,15,2,6,10,7,5,1,13,16,9,14,8,4,12,3
                2,12,1,14,7,6,8,15,9,11,10,3,16,13,5,4
                3,5,11,16,1,10,12,13,14,8,4,7,6,9,15,2
                15,7,13,9,2,4,16,14,1,6,5,12,3,8,11,10
                10,6,4,8,5,3,11,9,2,15,13,16,1,14,7,12
                13,14,10,2,4,5,3,16,15,7,6,9,12,1,8,11
                12,11,5,1,8,2,6,7,4,13,14,10,9,15,3,16
                9,3,6,7,13,12,15,10,11,1,16,8,5,2,4,14
                8,4,16,15,14,1,9,11,12,3,2,5,7,6,10,13
                4,2,7,10,15,16,13,12,6,9,3,11,14,5,1,8
                14,1,15,13,9,8,10,5,16,2,12,4,11,3,6,7
                6,16,8,12,3,11,1,4,5,14,7,15,13,10,2,9
                5,9,3,11,6,14,7,2,8,10,1,13,4,12,16,15
                """;
        SudokuBoard solvedBigBoard = new SudokuBoard(16, solvedBig);
        assertTrue(solvedBigBoard.solved());
        assertTrue(solvedBigBoard.verifySolution());
    }
}
