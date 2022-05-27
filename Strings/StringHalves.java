package Strings;

public class StringHalves {
    public static void main(String[] args) {
        System.out.println(halvesAreAlike("textbook"));
    }
    static boolean halvesAreAlike(String s) {
        int start=0;
        int end=s.length()-1;
        int countleft=0,countright=0;
        while (start<end)
        {
            if(s.charAt(start)=='a' || s.charAt(start)=='e' ||s.charAt(start)=='i' || s.charAt(start)=='o' || s.charAt(start)=='u')
            {
                countleft++;
            }
             if(s.charAt(end)=='a' || s.charAt(end)=='e' ||s.charAt(end)=='i' || s.charAt(end)=='o' || s.charAt(end)=='u')
            {
                countright++;
            }
            start++;
            end--;
        }
        return countleft==countright;
    }
}
