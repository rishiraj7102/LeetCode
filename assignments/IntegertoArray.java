package assignments;

import java.util.*;

public class IntegertoArray {
    public static void main(String[] args) {
        List<Long> list=new ArrayList<>();
        List<Long> ans=new ArrayList<>();
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        while(n>0)
        {
            long rem=n%10;
            list.add(rem);
            n=n/10;
        }
        for(int i=0;i<list.size();i++)
        {
            ans.add( list.get(list.size() - 1 - i));
        }

        System.out.println(ans);
    }
}
