package Recursion;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,6,7};
        System.out.println(linearsearch(arr,6,0));
        ArrayList<Integer> list=new ArrayList<>();
        System.out.println(AllIndices1(arr,6,0,list));
        System.out.println(AllIndices2(arr,6,0));
    }
    static int linearsearch(int [] arr, int target,int pos)
    {
        if (pos==arr.length-1)
        {
            return -1;
        }
        if(arr[pos]==target)
        {
            return pos;
        }
        return linearsearch(arr,target,pos+1);
    }
    static ArrayList<Integer> list=new ArrayList<>();
    static ArrayList<Integer> AllIndices1(int [] arr, int target, int pos,ArrayList<Integer> list)
    {
        if (pos==arr.length-1)
        {
            return list;
        }
        if(arr[pos]==target)
        {
            list.add(pos);
        }
        return AllIndices1(arr,target,pos+1,list);
    }
    static ArrayList<Integer> AllIndices2(int [] arr, int target,int pos)
    {
        ArrayList<Integer> list=new ArrayList<>();
        if (pos==arr.length-1)
        {
            return list;
        }
        if(arr[pos]==target)
        {
            list.add(pos);
        }
        ArrayList<Integer> ansFrombelow=AllIndices2(arr,target,pos+1);

        list.addAll(ansFrombelow);
        return list;


    }


}
