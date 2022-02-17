package Recursion;

import java.util.ArrayList;

public class SubSequence {
    public static void main(String[] args) {
        String str="abc";
        printSUBSEQ("",str);
        ArrayList<String> list= printSUBSEQreturn("",str);
        System.out.println(list);
        ArrayList<String> list2= printSUBSEQasciiReturn("",str);
        System.out.println(list2);
    }
    static void printSUBSEQ(String p,String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        printSUBSEQ(p+ch,up.substring(1));;
        printSUBSEQ(p,up.substring(1));
    }
    static ArrayList<String> printSUBSEQreturn(String p, String up)
    {
        if(up.isEmpty())
        {
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> left=printSUBSEQreturn(p+ch,up.substring(1));;
        ArrayList<String> right=printSUBSEQreturn(p,up.substring(1));

        left.addAll(right);
        return left;
    }

    //now including ascii values
    static ArrayList<String> printSUBSEQasciiReturn(String p, String up)
    {
        if(up.isEmpty())
        {
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> left=printSUBSEQasciiReturn(p+ch,up.substring(1));;
        ArrayList<String> right=printSUBSEQasciiReturn(p,up.substring(1));
        ArrayList<String> third=printSUBSEQasciiReturn(p+(ch+0),up.substring(1));

        left.addAll(right);
        left.addAll(third);
        return left;
    }

}
