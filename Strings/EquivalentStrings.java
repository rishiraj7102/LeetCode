package Strings;

public class EquivalentStrings {
    public static void main(String[] args) {
        String[] word1={"ab", "c"};
        System.out.println(arrayStringsAreEqual(new String[]{"a", "cb"},new String[]{"ab", "c"}));
    }
//    String s;


    static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        return(String.join("", word1).equals(String.join("", word2)));
    }
}
