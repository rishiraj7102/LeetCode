package backtracking;
//obstacles marked as false
public class Maze3 {

    public static void main(String[] args) {
        boolean [][] maze={
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
        pathwithrestrictions("",maze,0,0);
    }
    static void pathwithrestrictions(String p,boolean [][]maze,int r,int c)
    {

        if(r== maze.length-1 && c==maze[0].length-1)
        {
            System.out.println(p);
            return;
        }
        if(!maze[r][c])
        {
            return;
        }

        if(r<maze.length-1)
        {
            pathwithrestrictions(p+"D",maze,r+1,c);
        }
        if(c<maze[0].length-1)
        {
            pathwithrestrictions(p+"R",maze,r,c+1);
        }
//        if(r<maze.length-1 && c<maze[0].length-1)
//        {
//            pathwithrestrictions(p+"Diag",maze,r+1,c+1);
//        }
    }
}
