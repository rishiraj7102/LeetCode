package SortingAssignments;
//https://leetcode.com/problems/assign-cookies/
public class AssignCookies {
    public static void main(String[] args) {
        int []g={1,2,};
        int []s={1,2,3};
        System.out.println(findContentChildren(g,s));
    }
    static int findContentChildren(int[] g, int[] s) {
        int x=0,y=0,count=0;
        while (x<g.length && y<s.length)
        {
            if(g[x]<=s[y])
            {
                count++;

            }
            x++;
            y++;
        }
        return count;
    }

}
