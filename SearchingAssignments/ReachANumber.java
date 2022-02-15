package SearchingAssignments;

public class ReachANumber {
    public static void main(String[] args) {
        System.out.println(reachNumber(10));
    }
    static int reachNumber(int target) {
            int i=0;
            int j=1;
            int steps=0;
            while (i<target)
            {
                if(i+j>target)
                {
                    i=i-j;
                }
                else
                {
                    i=i+j;
                }
                j++;
                steps++;
            }
            return steps;
    }
}
