package Sorting;

public class MissingNumber {
    public static void main(String[] args) {
        int[]arr={9,6,4,2,3,5,7,0,1};
        System.out.println(missing(arr));
    }
    static int missing(int [] arr)
    {
        int i=0;
        while (i< arr.length)
        {
            if(arr[i]>= arr.length)
            {
                i++;
                continue;
            }
            int correct=arr[i];
            if(arr[i]!=arr[correct] && i!= arr.length)
            {
                int temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }
            else{
                i++;
            }
        }
        for(i=0;i<arr.length;i++)
        {
            if(i!=arr[i])
            {
                return i;
            }
        }
        return -1;
    }
}
