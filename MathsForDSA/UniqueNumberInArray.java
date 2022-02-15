package MathsForDSA;
// earlier every number was appearing twice so it was ez to just xor and find..but here the numbers wld be repeating thrice
public class UniqueNumberInArray {
    public static void main(String[] args) {
            int [] arr={2,2,3,2,7,7,8,7,8,8};
        System.out.println(ans(arr));
    }
    static int ans(int [] arr)
    {
        int max=Integer.MIN_VALUE;
        for(int i:arr)
        {
            if(i>max)
            {
                max=i;
            }
        }
        int x=0;
        while (max>0)
        {
            x++;
            max=max >> 1;
        }
        int [] bits= new int[x];
        for(int i=0;i< arr.length;i++)
        {
            int c=0;
            while (arr[i]>0)
            {
                int temp=arr[i] & 1;
                if(temp==1)
                {
                    bits[x-c-1]++;
                }
                arr[i]=arr[i]>>1;
                c++;
            }
        }
        int sum=0;
        int base=1;
        for(int i= bits.length-1;i>=0;i--)
        {
            int power=x-i-1;
            int temp=bits[i]%3;
            sum+=temp*Math.pow(2,power);
        }
        return sum;

    }
}
