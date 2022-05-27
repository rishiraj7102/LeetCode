package Recursion;

public class ReverseString {
    public static void main(String[] args) {
        char [] s={'h','e','l','l','o'};
        reverseString(s);
        System.out.println(s);
    }
    static void reverseString(char[] s) {
        helper(s,0,s.length-1);
    }
    static void helper(char[] s ,int st,int e)
    {
        if(st>e)
        {
            return;
        }
        char temp=s[st];
        s[st]=s[e];
        s[e]=temp;
        helper(s,st+1,e-1);
    }
}
