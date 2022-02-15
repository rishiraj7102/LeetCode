package SearchingAssignments;
//https://leetcode.com/problems/koko-eating-bananas/
public class KokoLovesBananas {
    public static void main(String[] args) {
        int [] piles={1000000000};
        System.out.println(minEatingSpeed(piles,2));
    }
    static int minEatingSpeed(int[] piles, int h) {
        int max=Integer.MIN_VALUE;
        for(int i:piles)
        {
            if(i>max)
            {
                max=i;
            }
        }
        int s=1;
        int e=max;
        int ans=0;
        while (s<=e)
        {
            int m=s+(e-s)/2;
            int timetaken=0;
            for(int i=0;i<piles.length;i++)
            {

             timetaken+=Math.ceil((float)piles[i]/m);
            }
            if(timetaken>h)
            {
                s=m+1;
            }
            else if(timetaken<=h){
                ans=m;
                e=m-1;

            }
        }
        return ans ;
    }
}

