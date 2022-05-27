package Strings;
//https://leetcode.com/problems/reverse-words-in-a-string-iii/
public class ReverseWords {
    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }
    static String reverseWords(String s) {
        String ans="";
        String[] words=s.split(" ");
        String[] reversed=new String[words.length];
        int index=0;
        for(String word:words)
        {
            ans="";
            int end=word.length()-1;
            while (end>=0)
            {
                ans=ans+word.charAt(end);
                end--;
            }
            reversed[index++]=ans;

        }
        ans="";
        for(int i=0;i<reversed.length;i++)
        {
            if(i== reversed.length-1)
            {
                ans=ans+reversed[i];
            }
            else ans=ans+reversed[i]+" ";
        }
        return ans;
    }
}
