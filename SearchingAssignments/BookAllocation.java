package SearchingAssignments;

import java.util.Arrays;

//https://www.geeksforgeeks.org/allocate-minimum-number-pages/
public class BookAllocation {
    public static void main(String[] args) {
        int [] arr={12,34,67,90};
        System.out.println(allocate(arr,2));
    }
    static int allocate(int [] arr ,int students)
    {
        Arrays.sort(arr);
        int low=arr[arr.length-1];  // low would be equal to the max element in the array
        int sum=0;
        for(int i:arr)
        {
            sum+=i;
        }
        int high=sum;  //high would be equal to the sum of all the elements
        int ans=0;
        while (low<=high)
        {
            int m=low+(high-low)/2;
            if(isValid(arr,students,m))
            {
                high=m-1;
                ans=m;
            }
            else {
                low=m+1;
            }
        }
        return ans;
    }

    private static boolean isValid(int[] arr, int students, int m) {
        int sum=0;
        int count =1;
        for (int j : arr) {
            if (sum + j > m) {
                count++;
                sum = j;
            }
            else {
                sum+=j;
            }

        }
        return count == students;
    }

}
