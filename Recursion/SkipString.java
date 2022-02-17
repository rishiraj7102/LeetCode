package Recursion;

// skip the substring apple
public class SkipString {
    public static void main(String[] args) {
        String str="thisisaquotewithappleinit";
        System.out.println(skipApple(str));
        String str2="thisisaquotewithappinit";
        System.out.println(skipAppNotApple(str2));
    }
    static String skipApple(String str)
    {
        if(str.length()==0)
        {
            return "";
        }
        char ch=str.charAt(0);
        if(str.startsWith("apple"))
        {
            return skipApple(str.substring(5));
        }
        return ch + skipApple(str.substring(1));
    }

    static String skipAppNotApple(String str)
    {
        if(str.length()==0)
        {
            return "";
        }
        char ch=str.charAt(0);
        if(str.startsWith("app") && !str.startsWith("apple"))
        {
            return skipAppNotApple(str.substring(3));
        }
        return ch + skipAppNotApple(str.substring(1));
    }
}
