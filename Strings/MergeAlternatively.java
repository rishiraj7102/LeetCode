package Strings;

public class MergeAlternatively {
    public static void main(String[] args) {

    }
    static String mergeAlternately(String word1, String word2) {
        String ans="";
        int p1=0;
        int p2=0;
        int checker=0;
        while (p1<word1.length() && p2<word2.length())
        {
            if(checker%2==0)
            {
                ans=ans+word1.charAt(p1);
                checker++;
                p1++;
            }
            else {
                ans=ans+word2.charAt(p2);
                checker++;
                p2++;
            }
        }
        while (p1<word1.length())
        {
            ans=ans+word1.charAt(p1++);
        }
        while (p2<word2.length())
        {
            ans=ans+word2.charAt(p2++);
        }
        return ans;
    }
}
