package backtracking;

import java.util.ArrayList;
import java.util.Arrays;

// all directinons allowed
public class Maze4 {
    public static void main(String[] args) {
        boolean[][] maze={
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        paths("",maze,0,0);
        int [][]paths=new int[maze.length][maze[0].length];
        pathsFinder("",maze,0,0,paths,1);
    }
    static void paths(String p, boolean [][] maze,int r,int c)
    {

        if(r==maze.length-1 && c==maze[0].length-1)
        {
            System.out.println(p);
            return;
        }
        if(!maze[r][c])
        {
            return;
        }
        maze[r][c]=false;
        if(r<maze.length-1)
        {
            paths(p+"D",maze,r+1,c);
        }
        if(c<maze[0].length-1)
        {
            paths(p+"R",maze,r,c+1);
        }
        if(r>0)
        {
            paths(p+"U",maze,r-1,c);
        }
        if (c>0)
        {
            paths(p+"L",maze,r,c-1);
        }
        maze[r][c]=true;
    }
    static void pathsFinder(String p, boolean [][] maze,int r,int c, int [][] pathmatrix,int steps)
    {

        if(r==maze.length-1 && c==maze[0].length-1)
        {
            pathmatrix[r][c]=steps;
            for(int [] i :pathmatrix) {
                System.out.println(Arrays.toString(i));
            }
            System.out.println();
            return;
        }
        if(!maze[r][c])
        {
            return;
        }
        maze[r][c]=false;
        pathmatrix[r][c]=steps;
        if(r<maze.length-1)
        {

            pathsFinder(p+"D",maze,r+1,c,pathmatrix,steps+1);
        }
        if(c<maze[0].length-1)
        {

            pathsFinder(p+"R",maze,r,c+1,pathmatrix,steps+1);
        }
        if(r>0)
        {

            pathsFinder(p+"U",maze,r-1,c,pathmatrix,steps+1);
        }
        if (c>0)
        {

            pathsFinder(p+"L",maze,r,c-1,pathmatrix,steps+1);
        }
        maze[r][c]=true;
        pathmatrix[r][c]=0;
    }
}
