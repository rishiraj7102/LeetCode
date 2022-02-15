package Recursion;

public class SortedArray {
    public static void main(String[] args) {
        int [] arr={1,2,3,8,5,6};
        System.out.println(compare(arr,0));
    }
    static int z=0;
    static  boolean compare(int[] arr,int pos)
    {

        if(pos==arr.length-1)
        {
            return true;
        }
        return arr[pos]<arr[pos+1] && compare(arr,pos+1);
    }
}
