//package SearchingAssignments;
//
//public class PeakElement2 {
//    public static void main(String[] args) {
//
//    }
//    static  int[] findPeakGrid(int[][] mat) {
//        int startrow=0;
//        int endrow=mat.length-1;
//        while (startrow<=endrow)
//        {
//            int midrow=startrow+(endrow-startrow)/2;
//            int maxelementindex=findIndex(mat[midrow],mat[midrow].length);
//
//            if(midrow==0)
//            {
//                if(mat[midrow][maxelementindex]>mat[midrow+1][maxelementindex])
//                {
//                    return new  int []{midrow,maxelementindex};
//                }
//            }
//            if (midrow==mat.length-1)
//            {
//                if(mat[midrow][maxelementindex]>mat[midrow-1][maxelementindex])
//                {
//                    return new  int []{midrow,maxelementindex};
//                }
//            }
//            else if (midrow>0 && midrow<mat.length)
//            {
//                if(mat[midrow][maxelementindex]>mat[midrow+1][maxelementindex] && mat[midrow][maxelementindex]>mat[midrow-1][maxelementindex])
//                {
//                    return new int[]{midrow,maxelementindex};
//                }
//            }
//            if(mat[midrow][maxelementindex]<mat[midrow+1][maxelementindex])
//            {
//                startrow=midrow+1;
//            }
//            else {
//                endrow=midrow-1;
//            }
//        }
//    }
//
//     static int findIndex(int[] ints, int length) {
//        int max=Integer.MIN_VALUE;
//        for(int i=0;i<length;i++)
//        {
//            if(ints[i]>max)
//            {
//                max=i;
//            }
//        }
//        return max;
//    }
//}
