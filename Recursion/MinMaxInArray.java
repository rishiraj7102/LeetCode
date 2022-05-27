package Recursion;

public class MinMaxInArray {
    public static void main(String[] args) {
        function(new int[]{1,2,3,4,5},Integer.MAX_VALUE,Integer.MIN_VALUE,0);
    }
    static void function(int [] arr, int min,int  max, int pos)
    {
        if(pos==arr.length)
        {
            System.out.println(min+" "+max);
            return;
        }
        if(arr[pos]<min)
        {
            min=arr[pos];
        }
        else if(arr[pos]>max)
        {
            max=arr[pos];
        }
        function(arr,min,max,pos+1);


    }
}
