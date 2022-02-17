package Recursion;

public class SkipCharacter {
    public static void main(String[] args) {
        String str="baccad";
        String ans="";
        System.out.println(skip(str,"" ,0));
        System.out.println(skip2(str));
    }
    static String skip(String str, String ans,int a)   // a to iterate str
    {
        if(str.length()==a)
        {
            return ans.toString();
        }
        if(str.charAt(a)!='a')
        {
            ans=ans+str.charAt(a);
        }
        return skip(str,ans,++a);

    }
    static String skip2(String str)  //without taking a extra string
    {

        if(str.length()==0)
        {
            return "";
        }
        char ch=str.charAt(0);
        if(str.charAt(0)=='a')
        {
            return skip2(str.substring(1));
        }
        else
            return ch+skip2(str.substring(1));
    }
}
