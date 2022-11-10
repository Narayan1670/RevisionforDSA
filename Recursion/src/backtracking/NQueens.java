package backtracking;

import java.util.ArrayList;
import java.util.List;

public class NQueens {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
//        queens(board, 0);
        System.out.println(queens(board, 0));
//        List<List<String>> ans = solveNQueens(4);
//        System.out.println(ans);

    }
    static int queens(boolean[][] board, int row) {
        if(row == board.length) {
            display(board);
            System.out.println();
            return 1;
        }
        int count = 0;
        //placing the queen and checking for every row and column
        for (int col = 0; col < board.length; col++) {
            if(isSafe(board, row, col)) {
                board[row][col] = true;
                count += queens(board,row + 1);
                board[row][col] = false;
            }

        }
        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        //check vertical row
        for(int i = 0; i < row; i++){
            if(board[i][col]) {
                return false;
            }
        }
        // diagonal left
        int maxLeft = Math.min(row, col);
        for (int i = 0; i <= maxLeft; i++) {
            if(board[row-i][col-i]) {
                return false;
            }
        }

        // diagonal right
        int maxRight = Math.min(row, board.length - col - 1);
        for (int i = 0; i <= maxRight; i++) {
            if(board[row-i][col+i]) {
                return false;
            }
        }
        return true;

    }

    private static void display(boolean[][] board) {
        for(boolean[] row : board) {
            for(boolean element : row) {
                if(element) {
                    System.out.print("Q ");
                }
                else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }
    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();

        char[][] arr = new char[n][n];
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                arr[i][j] = '.';

        queenTry(ans,arr,0);
        return ans;
    }
    private static void queenTry(List<List<String>> ans, char[][] arr, int row)
    {
        if(row == arr.length)
        {
            List<String> val = new ArrayList<>();
            for (char[] chars : arr) val.add(new String(chars));
                ans.add(val);
            return;
        }
        for(int col=0;col<arr.length;col++)
        {
            if(validatePosition(arr,row,col))
            {
                arr[row][col] = 'Q';
                queenTry(ans,arr,row+1);
                arr[row][col] = '.';
            }
        }
    }

    private static boolean validatePosition(char[][] arr,int row,int col)
    {
        //checks validity in every row for a single column

        for(int i=0;i<row;i++)
        {
            if(arr[i][col] == 'Q')
                return false;
        }
        //checks for every 45 degree angle
        int maxLeft = Math.min(row, col);
        for (int i = 0; i <= maxLeft; i++) {
            if(arr[row-i][col-i] == 'Q') {
                return false;
            }
        }
//        for(int i=row-1,j=col+1;i>=0 && j<arr.length;i--,j++)
//        {
//            if(arr[i][j] == 'Q')
//                return false;
//        }
        //checks for every 135 degree angle
        int maxRight = Math.min(row, arr.length - col - 1);
        for (int i = 0; i <= maxRight; i++) {
            if(arr[row-i][col+i] == 'Q') {
                return false;
            }
        }
//        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--)
//        {
//            if(arr[i][j] == 'Q')
//                return false;
//        }
        return true;
    }

}
