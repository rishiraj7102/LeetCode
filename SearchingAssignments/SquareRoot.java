package SearchingAssignments;

public class SquareRoot {
    public static void main(String[] args) {
        System.out.println(squareroot(10));

    }
    static int squareroot(int number)
    {
        if(number==0||number==1)
        {
            return number;
        }
       int s=1;
       int e=number;
       int ans=0;
       while (s<=e)
       {
           int mid=s+(e-s)/2;
           if(mid==number)
           {
               return mid;
           }
           else if(mid>number/mid)
           {
              e=mid-1;
           }
           else {
               if((mid+1)>number/(mid+1))
               {
                   return mid;
               }
               s=mid+1;
           }
       }
        return -1;
    }
}
