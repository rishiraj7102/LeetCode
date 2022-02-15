package BinarySearchInterviewQ;
//https://leetcode.com/problems/kth-missing-positive-number/
public class KthMissing {
    public static void main(String[] args) {
        int [] arr={2,3,4,7,11};
        int k=5;
        System.out.println(findKthPositive(arr,k));
    }
    static int findKthPositive(int[] arr, int k) {
        int s=0;
        int e= arr.length;
        while (s<=e)
        {
            int m=s+(e-s)/2;
            if(arr[m]-m-1<k)
            {
                s=m+1;
            }
            else {
                e=m-1;
            }
        }
        return k+s;
    }
}
