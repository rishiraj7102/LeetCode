package backtracking;

public class SudokuSolver {
    public static void main(String[] args) {
        int[][] board = new int[][]{
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };

        if (solve(board)) {
            display(board);
        } else {
            System.out.println("Cannot solve");
        }
    }
    static boolean solve(int [][] board)
    {
        int n=board.length;
        int row=-1;
        int col=-1;
        boolean isempty=true;
        for(int i=0;i<n;i++)
        {
            for (int j=0;j<n;j++)
            {
                if(board[i][j]==0)
                {
                    isempty=false;
                    row=i;
                    col=j;
                    break;
                }
            }
            if(!isempty)
            {
                break;
            }
        }
        if (isempty){
            return true;
        }

        for(int num=1;num<=9;num++)
        {
            if(isSafe(board,row,col,num))
            {
                board[row][col]=num;
                if(solve(board))
                {
                    return true;
                }
                else {
                    board[row][col]=0;
                }

            }
        }
        return false;
    }
    static boolean isSafe(int [][] board, int r,int c, int num)
    {
        for (int[] ints : board) {
            if (ints[c] == num) {
                return false;
            }
        }
        for(int i=0;i<board[0].length;i++)
        {
            if(board[r][i]==num)
            {
                return false;
            }
        }
        int sqrt=(int)Math.sqrt(board.length);
        int rstart=r-(r%sqrt);
        int cstart=c-(c%sqrt);
        for(int i=rstart;i<rstart+sqrt;i++)
        {
            for(int j= cstart;j<cstart+sqrt;j++)
            {
                if(board[i][j]==num)
                {
                    return false;
                }
            }
        }
        return  true;
    }
     static void display(int [][] board) {
        for (int i=0;i< board.length;i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
