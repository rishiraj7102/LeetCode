package Recursion;

public class FirstUpperCase {
    public static void main(String[] args) {
        System.out.println(finder("iamamadscientistitssocoolSonnuvabitch",0));
    }
    static char finder(String input,int pos){
        if(pos==input.length())
        {
            return '-';
        }
        if(input.charAt(pos)>65 && input.charAt(pos)<90)
        {
            return input.charAt(pos);
        }
        return finder(input,pos+1);

    }
}
