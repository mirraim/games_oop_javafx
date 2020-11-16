package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] != 0) {
                if (isHorisontal(board, i) || isVertical(board, i)) {
                    rsl = true;
                    break;
                }
            }
        }
        return rsl;
    }

    public static boolean isVertical(int[][] board, int column) {
        boolean rsl = true;
        for (int i = 0; i < board.length; i++) {
            if (board[column][i] == 0){
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    public static boolean isHorisontal(int[][] board, int row) {
        boolean rsl = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][row] == 0){
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
