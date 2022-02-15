package SearchingAssignments;

import java.util.Arrays;

public class MinABSsumDiff {
    public static void main(String[] args) {
            int [] nums1={1,10,4,4,2,7};
            int [] nums2={9,3,5,1,7,4};
        System.out.println(minAbsoluteSumDiff(nums1,nums2));
    }
    static int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
//            int maxdiff=Integer.MIN_VALUE;
//            int index=-1;
//            int ans=0;
//            for(int i=0;i<nums1.length;i++)
//            {
//                int temp=Math.abs(nums1[i]-nums2[i]);
//                if(temp>maxdiff)
//                {
//                    maxdiff=temp;
//                    index=i;
//                }
//                ans+=(temp% 100000007);
//            }
//            ans=ans-maxdiff;
//            int maxno=nums1[index];
//            if(maxno<nums2[index])
//            {
//                int s=0;
//                int e=nums1.length-1;
//                while (s<=e)
//                {
//                    int m=s+(e-s)/2;
//                    if(maxno<=nums1[m] && Math.abs(nums1[m]-nums2[index])<=maxdiff)
//                    {
//                        maxdiff=Math.abs(nums1[m]-nums2[index]);
//                        s=m+1;
//                    }
//                    else {
//                        e=m-1;
//                    }
//                }
//            }
//            else {
//                int s=0;
//                int e=nums1.length-1;
//                while (s<=e)
//                {
//                    int m=s+(e-s)/2;
//                    if(maxno>=nums1[m] && Math.abs(nums1[m]-nums2[index])<=maxdiff)
//                    {
//                        maxdiff=Math.abs(nums1[m]-nums2[index]);
//                        e=m-1;
//                    }
//                    else {
//                        s=m+1;
//                    }
//                }
//            }
//            ans=(ans+maxdiff)%1000000007;
//            return ans;
        int ans=0;
        int maxIndex=0;
        int maxDiff=Integer.MIN_VALUE;
        for(int i=0;i<nums1.length;i++){
            if(Math.abs(nums1[i]-nums2[i])>maxDiff){
                maxDiff=Math.abs(nums1[i]-nums2[i]);
                maxIndex=i;
            }
            ans=(ans+Math.abs(nums1[i]-nums2[i]))%1000000007;
        }
        ans=ans-maxDiff; // We subtract maxDiff  because it will change later.

        Arrays.sort(nums1);

        int maxNum=nums1[maxIndex];
        if(maxNum>nums2[maxIndex]){
            int start=0;
            int end=nums1.length-1;
            while(start<=end){
                int mid=start+(end-start)/2;
                if(nums1[mid]<=maxNum && Math.abs(nums1[mid]-nums2[maxIndex])<=maxDiff){
                    maxDiff=Math.abs(nums1[mid]-nums2[maxIndex]);
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        else{
            int start=0;
            int end=nums1.length-1;
            while(start<=end){
                int mid=start+(end-start)/2;
                if(nums1[mid]>=maxNum && Math.abs(nums1[mid]-nums2[maxIndex])<=maxDiff){
                    maxDiff=Math.abs(nums1[mid]-nums2[maxIndex]);
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        }
        ans=(ans+maxDiff)%1000000007; // Now here we added the updated maxDiff...
        return ans;
    }
}
