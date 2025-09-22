package game2048logic;

import game2048rendering.Side;
import static game2048logic.MatrixUtils.rotateLeft;
import static game2048logic.MatrixUtils.rotateRight;

/**
 * @author  Josh Hug
 */
public class GameLogic {
    /** Moves the given tile up as far as possible, subject to the minR constraint.
     *
     * @param board the current state of the board
     * @param r     the row number of the tile to move up
     * @param c -   the column number of the tile to move up
     * @param minR  the minimum row number that the tile can land in, e.g.
     *              if minR is 2, the moving tile should move no higher than row 2.
     * @return      if there is a merge, returns the 1 + the row number where the merge occurred.
     *              if no merge occurs, then return 0.
     */
    public static int moveTileUpAsFarAsPossible(int[][] board, int r, int c, int minR) {
        int originalValue = board[r][c];
        if (originalValue == 0) {
            return 0;
        }

        int currentRow = r;
        int targetRow = r - 1;

        // Find the furthest empty spot or a tile to merge with
        while (targetRow >= minR) {
            if (board[targetRow][c] == 0) {
                currentRow = targetRow;
            } else if (board[targetRow][c] == originalValue) {
                // Found a tile to merge with
                board[targetRow][c] *= 2;
                board[r][c] = 0;
                return targetRow + 1;
            } else {
                // Blocked by a different tile
                break;
            }
            targetRow -= 1;
        }

        // Move to the final empty spot if it's different from the original
        if (currentRow != r) {
            board[currentRow][c] = originalValue;
            board[r][c] = 0;
        }

        return 0; // No merge occurred
    }

    /**
     * Modifies the board to simulate the process of tilting column c
     * upwards.
     *
     * @param board     the current state of the board
     * @param c         the column to tilt up.
     */
    public static void tiltColumn(int[][] board, int c) {
        // TODO: fill this in in task 5
        int minR = 0;
        for (int r = 1; r < board.length; r++) {
            int mergeRow = moveTileUpAsFarAsPossible(board, r, c, minR);
            if (mergeRow > 0) {
                minR = mergeRow;
            }
        }
        return;
    }

    /**
     * Modifies the board to simulate tilting all columns upwards.
     *
     * @param board     the current state of the board.
     */
    public static void tiltUp(int[][] board) {
        // TODO: fill this in in task 6
        for (int c = 0; c < board.length; c++) {
            tiltColumn(board, c);
        }
        return;
    }

    /**
     * Modifies the board to simulate tilting the entire board to
     * the given side.
     *
     * @param board the current state of the board
     * @param side  the direction to tilt
     */
    public static void tilt(int[][] board, Side side) {
        // TODO: fill this in in task 7
        if (side == Side.EAST) {
            return;
        } else if (side == Side.WEST) {
            return;
        } else if (side == Side.SOUTH) {
            return;
        } else {
            return;
        }
    }
}
