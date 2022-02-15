package Sorting;

import java.util.Arrays;

public class CyclicSOrt {
    public static void main(String[] args) {
        int [] arr={2,3,5,1,4};
        cyclicsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static  void swap(int [] arr, int i, int correct)
    {
        int temp=arr[i];
        arr[i]=arr[correct];
        arr[correct]=temp;
    }
    static void cyclicsort(int [] arr)
    {
        int i=0;
        while (i < arr.length) {
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct])
            {
                swap(arr,i,correct);
            }
            else {
                i++;
            }
        }
//        for(int i=0;i<arr.length;i++)
//        {
//            while (i!=arr[i]-1)                           // using 2 loops here... better approach above
//            {
//                int temp=arr[i];
//                arr[i]=arr[arr[i]-1];
//                arr[temp-1]=temp;
//            }
//        }
    }

}
