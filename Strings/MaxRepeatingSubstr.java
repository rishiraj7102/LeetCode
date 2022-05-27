package Strings;

public class MaxRepeatingSubstr {
    public static void main(String[] args) {
        System.out.println(maxRepeating("ababc","ac"));
    }
    static int maxRepeating(String sequence, String word) {
        if(sequence.equals(word))
        {
            return 1;
        }
        int count=0;
        int x=0;
        for(int i=0;i<sequence.length()-word.length();i++)
        {
            x=0;
            for(int j=0;j<word.length();j++)
            {
                if (sequence.charAt(i + j) != word.charAt(j)) {
                    x = 1;
                    break;
                }


            }
            if(x==0)
            {
                count++;
            }
        }
        return count;
    }
}
