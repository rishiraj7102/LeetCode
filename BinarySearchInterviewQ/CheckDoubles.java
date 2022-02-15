package BinarySearchInterviewQ;

import java.util.Arrays;

public class CheckDoubles {
    public static void main(String[] args) {
            int [] arr={1,3,4,5};
        System.out.println(checkIfExist(arr));
    }
    static boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        for(int i=0;i< arr.length;i++)
        {
            int s=0;
            int e= arr.length-1;
            int target= arr[i]*2;
            while (s<=e)
            {
                int m=s+(e-s)/2;
                if(arr[m]==target)
                {
                    return true;
                }
                else if(arr[m]>target)
                {
                    e=m-1;
                }
                else{
                    s=m+1;
                }
            }
        }
        return false;
    }
}
