package Strings;
//https://leetcode.com/problems/robot-return-to-origin/
public class RobotReturn {
    public static void main(String[] args) {

    }
    static boolean judgeCircle(String moves) {
        int l=0,r=0,u=0,d=0;
        for(int i=0;i<moves.length();i++)
        {
            if(moves.charAt(i)=='L')
            {
                l++;
            }
            if(moves.charAt(i)=='R')
            {
                r++;
            }
            if(moves.charAt(i)=='U')
            {
                u++;
            }
            if(moves.charAt(i)=='D')
            {
                d++;
            }
        }
        return l == r && u == d;

    }
}
