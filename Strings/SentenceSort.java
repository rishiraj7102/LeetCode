package Strings;

import java.net.Inet4Address;

public class SentenceSort {
    public static void main(String[] args) {
        System.out.println(sortSentence("is2 sentence4 This1 a3"));
    }
    static  String sortSentence(String s) {
        char [] letters=s.toCharArray();
        int start=0;
        String ans="";
        int spaces=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
                spaces++;
            }
        }
        int words=spaces+1;
        String [] word= new String[words];
        for(int i=0;i<letters.length;i++)
        {
            if(Character.isDigit(letters[i]))
            {
                ans=s.substring(start,i);
                start=i+2;
                int index=Integer.parseInt(String.valueOf(letters[i]));
                word[index-1]=ans;
            }
        }
        String finalans="";
        for(int i=0;i<word.length;i++)
        {
            if(i==word.length-1)
            {
                finalans=finalans+word[i];
            }
            finalans=finalans+word[i]+" ";
        }
        return finalans;
    }
}
