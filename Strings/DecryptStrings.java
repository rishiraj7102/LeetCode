package Strings;
//https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/
public class DecryptStrings {
    public static void main(String[] args) {
        System.out.println(freqAlphabets("1326#"));
    }
    static String freqAlphabets(String s) {
        String ans="";
        String alphabets="abcdefghijklmnopqrstuvwxyz";
        for(int i=0;i<s.length();i++)
        {

            if(i<=s.length()-3 && s.charAt(i+2)=='#')
            {
                int num=Integer.parseInt(s.substring(i,i+2));
//                System.out.println(num);
                i+=2;
                ans+=alphabets.charAt(num-1);
            }
            else {
                int num=Integer.parseInt(String.valueOf(s.charAt(i)));
//                System.out.println(num);
                ans+=alphabets.charAt(num-1);
            }
        }
        return ans;
    }
}
