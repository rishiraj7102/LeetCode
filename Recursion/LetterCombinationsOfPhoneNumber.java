package Recursion;

import java.util.ArrayList;
import java.util.SplittableRandom;

public class LetterCombinationsOfPhoneNumber {
    public static void main(String[] args) {
//        combinations("","12");
        ArrayList<String> ans= combinationsReturn("","12");
        System.out.println(ans);
    }
    static void combinations(String p,String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        int digit=up.charAt(0)-'0';
        for(int i=3*(digit-1);i<(3*digit);i++)
        {
            char ch=(char) ('a'+i);
            combinations(p+ch,up.substring(1));
        }

    }
    static  ArrayList<String> combinationsReturn(String p,String up)
    {
        if(up.isEmpty())
        {
            ArrayList<String> ans=new ArrayList<>();
            ans.add(p);
            return ans;
        }
        ArrayList<String> outer=new ArrayList<>();
        int digit=up.charAt(0)-'0';
        for(int i=3*(digit-1);i<(3*digit);i++)
        {
            char ch=(char) ('a'+i);
            ArrayList<String> inner=combinationsReturn(p+ch,up.substring(1));
            outer.addAll(inner);
        }
        return outer;
    }

}
