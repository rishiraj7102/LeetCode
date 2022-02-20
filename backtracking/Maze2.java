package backtracking;

import java.util.ArrayList;

//no obstacles
//left right and diagonal movement allowed
public class Maze2 {
    public static void main(String[] args) {
        System.out.println(stepscount(3,3));
        printpath("",3,3);
        System.out.println(returnpaths("",3,3));
    }
    static int  stepscount(int r,int c)
    {
        if(r==1||c==1)
        {
            return 1;
        }
        int left=0,right=0,diagonal=0;
        if(r>1)
        {
             left=stepscount(r-1,c);
        }
        if(c>1)
        {
             right=stepscount(r,c-1);
        }
        if(r>1 && c>1)
        {
             diagonal=stepscount(r-1,c-1);
        }



        return left+right+diagonal;
    }
    static void printpath(String p,int r , int c)
    {
        if(r==1 && c==1)
        {
            System.out.println(p);
            return;
        }
        if(r>1)
        {
           printpath(p+"D ",r-1,c);
        }
        if(c>1)
        {
            printpath(p+"R ",r,c-1);
        }
        if(r>1 && c>1)
        {
            printpath(p+"Diag ",r-1,c-1);
        }
    }
    static ArrayList<String> returnpaths(String p, int r , int c)
    {
        if(r==1 && c==1)
        {
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> outer=new ArrayList<>();
        ArrayList<String> left=new ArrayList<>();
        ArrayList<String> right=new ArrayList<>();
        ArrayList<String> diagonal=new ArrayList<>();
        if(r>1)
        {
            left=returnpaths(p+"D ",r-1,c);
        }
        if(c>1)
        {
           right= returnpaths(p+"R ",r,c-1);
        }
        if(r>1 && c>1)
        {
            diagonal=returnpaths(p+"Diag ",r-1,c-1);
        }
        outer.addAll(left);
        outer.addAll(right);
        outer.addAll(diagonal);
        return outer;
    }
}
