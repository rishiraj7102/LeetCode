package Recursion;

public class RotatedBS {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6};
        System.out.println(rotatedBS(arr,6,0,arr.length-1));
    }
    static int rotatedBS(int [] arr,int target, int start,int end)
    {
        int s=start;
        int e=end;
        while (s<=e)
        {
            int m=s+(e-s)/2;
            if(arr[m]==target)
            {
                return m;
            }
            if(arr[m]>arr[s])
            {
                if(target>=arr[s] && target<=arr[m])
                {
                    return rotatedBS(arr,target,s,m-1);
                }
                else {
                    return rotatedBS(arr,target,m+1,e);
                }
            }
            if(target>=arr[m] && target<=arr[e])
            {
                return rotatedBS(arr,target,m+1,e);            }
            else {
                return rotatedBS(arr,target,s,m-1);
            }
        }
        return -1;
    }
}
