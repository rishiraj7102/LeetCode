package backtracking;

import java.util.ArrayList;

//no obstacles
//only left and right movement allowed
public class Maze {
    public static void main(String[] args) {
        System.out.println(stepscount(3,3));
        printpath("",3,3);
        System.out.println(Returnpath("",3,3));
    }
    static int stepscount(int r,int c)
    {
        if(r==1 || c==1)
        {
            return 1;
        }
        int left=stepscount(r-1,c);
        int right=stepscount(r,c-1);
        return left+right;
    }
    static void printpath(String p,int r,int c)
    {
        if(r==1 && c==1)
        {
            System.out.println(p);
            return;
        }
        if(r>1)
        {
             printpath(p+"D",r-1,c);
        }
        if(c>1)
        {
             printpath(p+"R",r,c-1);
        }
    }
    static ArrayList<String> Returnpath(String p,int r,int c)
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
        if(r>1)
        {
            left=Returnpath(p+"D",r-1,c);
        }
        if(c>1)
        {
           right=Returnpath(p+"R",r,c-1);
        }

        outer.addAll(left);
        outer.addAll(right);
        return outer;
    }
}
