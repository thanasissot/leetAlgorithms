package NeetCode150_old.Medium;

import java.util.HashSet;
import java.util.Set;

public class _36 {
    // keep in mind this passed on the first try on leetcode and is faster than 60+ of other implementation
    // but still uses 3 hashsets (can be refined to 2)
    public boolean isValidSudoku(char[][] board) {
        Set<Character> setRow = new HashSet<>();
        Set<Character> setCol = new HashSet<>();
        char item;
        for (int i = 0; i < 9; i++){
            // rows
            for (int j = 0; j < 9; j++) {
                item = board[i][j];
                if (item == '.') continue;
                if (setRow.contains(item)) return false;
                else setRow.add(item);
            }
            setRow.clear();
            // columns
            for (int j = 0; j < 9; j++){
                item = board[j][i];
                if (item == '.') continue;
                if (setCol.contains(item)) return false;
                else setCol.add(item);
            }
            setCol.clear();
        }

        Set<Character> setCube = new HashSet<>();
        int start = 0; int end = 0;
        for (int b = 0; b < 3; b++){
            for (int a = 0; a < 3; a++){
                for (int i = 0; i < 3; i++) {
                    // column - 3 cells
                    for (int j = 0; j < 3; j++){
                        // row - 3 cells
                        char x = board[start + i][j + end];
                        if (x == '.') continue;
                        else if (setCube.contains(x)) return false;
                        else setCube.add(x);
                    }
                }
                // clear the set
                setCube.clear();
                // increment end
                end += 3;
            }
            // increment start
            start += 3;
            // reset end
            end = 0;
        }
        return true;

    }

    // neetcodes solution which is pretty, pretty smart
    public boolean isValidSudoku1(char[][] board) {
        HashSet<String> h1 = new HashSet<String>();

        for(int i=0; i < 9; i++){
            for(int j=0; j< 9; j++){
                if(board[i][j] != '.'){

                    //Check whether HashSet contains duplicate elements in row and column
                    if(h1.contains("row" + i + board[i][j]) || h1.contains("col" + j + board[i][j]) ){
                        return false;
                    }
                    h1.add("row" + i + board[i][j]);
                    h1.add("col" + j + board[i][j]);


                    //Check whether Box contains duplicate elements in it
                    if(h1.contains("box"+ (i/3) + (j/3) + board[i][j])){
                        return false;
                    }
                    h1.add("box"+ (i/3) + (j/3) + board[i][j]);
                }
            }
        }


        return true;
    }
}
