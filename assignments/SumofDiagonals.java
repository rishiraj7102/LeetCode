package assignments;

public class SumofDiagonals {
    public static void main(String[] args) {
        int [][]mat = {{1,2,3},
                {4,5,6},
                {7,8,9}};
        int row=0;
        int sum=0;
        int s=0;
        int e=mat.length-1;
        while(e>=0 && s<mat.length)
        {
            if(s!=e)
            {
                sum=sum+mat[row][s]+mat[row][e];
            }
            else
            {
                sum+=mat[row][s];
            }
            row++;
            s++;
            e--;
        }
        System.out.println(sum);
    }
}
