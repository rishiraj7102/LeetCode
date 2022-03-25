package Strings;

public class GoalParser {
    public static void main(String[] args) {

    }
    static String interpret(String command) {
        String ans="";
        for(int i=0;i<command.length();i++)
        {
            if(command.charAt(i)=='G')
            {
                ans+="G";
            }
            else if(command.charAt(i)=='(' && command.charAt(i+1)==')')
            {
                ans+="o";
            }
            else {
                ans+="al";
            }

        }
        return ans;
    }
}
