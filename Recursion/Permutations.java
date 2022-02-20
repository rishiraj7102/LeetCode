package Recursion;

import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
//        permute("","abc");
//        ArrayList<String> ans=permuteReturn("","abc");
//        System.out.println(ans);
        System.out.println(permutationCount("","abc"));
    }
    static void permute(String p,String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++)
        {
            String left=p.substring(0,i);
            String right = p.substring(i,p.length());

            permute(left+ch+right,up.substring(1));
        }
    }

    static ArrayList<String> permuteReturn(String p, String up)
    {
        if(up.isEmpty())
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
//            System.out.println(p);
            return list;
        }
        ArrayList<String> main=new ArrayList<>();
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++)
        {
            String left=p.substring(0,i);
            String right = p.substring(i,p.length());

             ArrayList<String> ans= permuteReturn(left+ch+right,up.substring(1));
             main.addAll(ans);
        }
        return main;
    }
    static int  permutationCount(String p,String up)
    {
        if(up.isEmpty())
        {
            return 1;
        }
        char ch=up.charAt(0);
        int count = 0;
        for(int i=0;i<=p.length();i++)
        {
            String left=p.substring(0,i);
            String right = p.substring(i,p.length());

            count +=permutationCount(left+ch+right,up.substring(1));
        }
        return count;
    }
}
