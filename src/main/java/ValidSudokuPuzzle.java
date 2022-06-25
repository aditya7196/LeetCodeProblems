package main.java;

import java.util.*;

//https://leetcode.com/problems/valid-sudoku/
public class ValidSudokuPuzzle {

    public static boolean isValidSudoku(char[][] board) {
        Set<String> known = new HashSet<>();
        for(int i=0; i<9; ++i){
            for(int j=0; j<9; ++j){
                char num = board[i][j];
                if(num!='.'){
                    if(!known.add(num + "in row" + i) ||
                    !known.add(num + "in column" + j)||
                    !known.add(num + "in block" + i/3 + "-" + j/3)){
                        return false;
                    }
                }
            }
        }
    return true;
    }

  public static void main(String[] args) {
        char[][] board =
                {
                 {'5','3','.','.','7','.','.','.','.'}
                ,{'6','.','.','1','9','8','.','.','.'}
                ,{'.','9','8','.','.','.','.','6','.'}
                ,{'8','.','.','.','6','.','.','.','3'}
                ,{'4','.','.','8','.','3','.','.','1'}
                ,{'7','.','.','.','2','.','.','.','6'}
                ,{'.','6','.','.','.','.','2','8','.'}
                ,{'.','.','.','4','1','9','.','.','5'}
                ,{'.','.','.','.','8','.','.','7','9'}};
        boolean isValid = isValidSudoku(board);
    System.out.println(isValid);
  }
}
