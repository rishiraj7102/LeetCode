package backtracking;

public class NQueens {
    public static void main(String[] args) {
        int n=5;
        boolean[][] board =new boolean[n][n];
        System.out.println(solve(board,0));
    }
    static int solve(boolean[][] board, int row)
    {
        if(row==board.length)
        {
            display(board);
            System.out.println();
            return 1;
        }
        int count =0;
        for(int col=0;col<board[0].length;col++)
        {
            if(isSafe(board,row,col))
            {
                board[row][col]=true;
                count+=solve(board,row+1);
                board[row][col]=false;
            }
        }
        return count;
    }

    private static boolean isSafe(boolean [][] board,int row,int col) {
        for(int i=0;i<row;i++)      //for all rows above
        {
            if(board[i][col])
            {
                return false;
            }
        }
        int minleft=Math.min(row,col);      //left diagonal
        for(int i=1;i<=minleft;i++)
        {
            if(board[row-i][col-i])
            {
                return false;
            }
        }
        int minright=Math.min(row,board.length-col-1);      //right diagonal
        for (int i = 1; i <=minright ; i++) {
            if(board[row-i][col+i])
            {
                return false;
            }
        }
        return true;
    }

    private static void display(boolean[][] board) {
        for (boolean[] booleans : board) {
            for (int j = 0; j < board[0].length; j++) {
                if (booleans[j]) {
                    System.out.print("Q ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

}
