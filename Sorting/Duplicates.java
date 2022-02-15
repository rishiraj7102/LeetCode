package Sorting;

import java.util.ArrayList;
import java.util.List;

public class Duplicates {
    public static void main(String[] args) {
        int [] arr={4,3,2,7,8,2,3,1};
        System.out.println(duplicate(arr));
    }
    static List<Integer> duplicate(int [] arr)
    {
        int i=0;
        List<Integer> list=new ArrayList<>();
        while (i<arr.length)
        {

           int correct=arr[i]-1;
           if(arr[i]!=arr[correct])
           {
               int temp=arr[i];
               arr[i]=arr[correct];
               arr[correct]=temp;
           }
            else{
                i++;
            }
        }
        for(i=0;i< arr.length;i++)
        {
            if (arr[i]!=i+1)
            {
                list.add(arr[i]);
            }
        }
        return list;
    }

}
