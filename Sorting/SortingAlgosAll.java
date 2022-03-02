package Sorting;

import java.util.Arrays;

public class SortingAlgosAll {
    public static void main(String[] args) {
        int [] arr={5,4,3,2,1};
        System.out.println(Arrays.toString(arr));
        System.out.println("Bubble sort");
        Bubble(arr);
        System.out.println(Arrays.toString(arr));;
        System.out.println("insertion sort");
        insertion(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("selection sort");
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Bubble(int [] arr)
    {
        for(int i=0;i< arr.length-1;i++)
        {
            for(int j=0;j< arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    static void selection(int [] arr)
    {
        for(int i=0;i< arr.length-1;i++)
        {
            int min=i;
            for(int j=i+1;j< arr.length;j++)
            {
                if(arr[j]<arr[min])
                {
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
    }
    static void insertion(int [] arr)
    {
        for(int i=0;i< arr.length-1;i++)
        {
            int j=i+1;
            while (arr[j]<arr[j-1] && j>0)
            {
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;

                j=j-1;
            }
        }
    }
}
