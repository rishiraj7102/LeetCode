package BinarySearchInterviewQ;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FairCandySwap {
    public static void main(String[] args) {
        int [] alicesizes={2};
        int [] bobsizes={1,3};
        System.out.println(Arrays.toString(fairCandySwap(alicesizes,bobsizes)));
    }
    static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        Arrays.sort(aliceSizes);
        Arrays.sort(bobSizes);
        int aliceSum=0;
        int bobSum=0;
        for(int i:aliceSizes)
        {
            aliceSum+=i;
        }
        for(int i:bobSizes)
        {
            bobSum+=i;
        }
        int diff=(bobSum-aliceSum)/2;
        for(int i=0;i< aliceSizes.length;i++)
        {
            int s=0;
            int e=bobSizes.length-1;
            while (s<=e)
            {
                int m= s+(e-s)/2;
                int target=aliceSizes[i]+diff;
                if(bobSizes[m]==target)
                {
                    return new int []{aliceSizes[i],bobSizes[m]};
                }
                else if( bobSizes[m]>target)
                {
                    e=m-1;
                }
                else{
                    s=m+1;
                }
            }
        }
            return new int[]{-1,-1};
    }
}
