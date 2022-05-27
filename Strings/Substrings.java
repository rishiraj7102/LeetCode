package Strings;
//https://leetcode.com/problems/number-of-strings-that-appear-as-substrings-in-word/
public class Substrings {
    public static void main(String[] args) {

    }
    static int numOfStrings(String[] patterns, String word) {
        int count=0;
        for(String s:patterns)
        {
            if(word.contains(s))
            {
                count++;
            }
        }
        return count;
    }
}
