package Strings;

public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
    static boolean isPalindrome(String s) {
        String temp="";
        for (int i=0;i<s.length();i++)
        {
            int asciivalue=(int)Character.toLowerCase(s.charAt(i));
            if((asciivalue>=48 && asciivalue<=57 ) || (asciivalue>=97 && asciivalue<=122))
            {
                temp+=Character.toLowerCase(s.charAt(i));
            }
        }
        int start=0;
        int end=temp.length()-1;
        while (start<=end)
        {
            if(temp.charAt(start)!=temp.charAt(end))
            {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
