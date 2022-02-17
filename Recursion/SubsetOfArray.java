package Recursion;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetOfArray {
    public static void main(String[] args) {
            int [] arr={1,2,3};
            List<List<Integer>> ans=subset(arr);
            System.out.println(ans);
        arr=new int[]{1,2,2};
        List<List<Integer>> ans2=subsetDuplicates(arr);
        System.out.println(ans2);
    }
    static List<List<Integer>> subset(int [] arr)
    {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for(int num:arr)
        {
            int n=outer.size();
            for(int i=0;i<n;i++)
            {
                List<Integer> inner=new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }
        }


        return outer;
    }

    static List<List<Integer>> subsetDuplicates(int [] arr)
    {
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start=0;
        int end=0;
        for(int j=0;j<arr.length;j++)
        {
            start=0;
            if(j>0 && arr[j]==arr[j-1])
            {
                start=end+1;
            }
             end=outer.size()-1;
            int n=outer.size();
            for(int i=start;i<n;i++)
            {
                List<Integer> inner=new ArrayList<>(outer.get(i));

                inner.add(arr[j]);
                outer.add(inner);
            }
        }


        return outer;
    }

}
