package Strings;

public class SegmentOfOnes {
    public static void main(String[] args) {

    }
    static boolean checkOnesSegment(String s) {
        if(s.charAt(1)=='1')
        {
            return true;
        }
        for (int i=2;i<s.length()-1;i++)
        {
            if(s.charAt(i)=='1' && s.charAt(i+1)=='1')
            {
                return true;
            }
        }
        return false;
    }

}
