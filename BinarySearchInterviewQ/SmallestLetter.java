package BinarySearchInterviewQ;

public class SmallestLetter {
    public static void main(String[] args) {
        char[] letter={'c','f','j'};
        char target='d';
        System.out.println(nextGreatestLetter(letter,target));
    }
    static char nextGreatestLetter(char[] letters, char target) {
        int s=0;
        int e=letters.length-1;
        int len=letters.length;
        while (s<=e)
        {
            int mid=s+(e-s)/2;
            if(letters[mid]>target)
            {
                e=mid-1;
            }
            else
            {
                s=mid+1;
            }

        }
        return letters[s%len];
    }
}
