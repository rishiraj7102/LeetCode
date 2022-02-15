package SearchingAssignments;

public class SearchIN2Dmatric {
    public static void main(String[] args) {
        int [][] matrix = {
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,60}
        };
        System.out.println(searchMatrix(matrix,100));
    }
    static boolean searchMatrix(int[][] matrix, int target) {
            int left=0;
            int right=matrix[0].length-1;
            while (left<matrix.length)
            {
                if(target>matrix[left][0] && target<matrix[left][right])
                {
                    int s=left;
                    int e=right;
                    while (s<=e)
                    {
                        int m=s+(e-s)/2;
                        if(matrix[left][m]==target)
                        {
                            return true;
                        }
                        else if(matrix[left][m]>target)
                        {
                            e=m-1;
                        }
                        else {
                            s=m+1;
                        }
                    }
                }
                else if( target > matrix[left][right])
                {
                    left++;
                }
            }
            return false;
    }
}
