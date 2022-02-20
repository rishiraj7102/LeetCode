package Recursion;

import java.util.ArrayList;

//amazon
public class DiceCombo {
    public static void main(String[] args) {
        combos("",4);
        ArrayList<String> ans=combosRETURN("",4);
        System.out.println(ans);
    }
    static void combos(String p,int up)
    {
        if(up==0)
        {
            System.out.println(p);
            return;
        }

        for(int i=1;i<=6 && i<=up;i++)
        {
                combos(p+i,up-i);
        }
    }
    static ArrayList<String> combosRETURN(String p, int up)
    {
        if(up==0)
        {
//            System.out.println(p);
            ArrayList<String> ans=new ArrayList<>();
            ans.add(p);
            return ans;
        }
        ArrayList<String> outer=new ArrayList<>();
        for(int i=1;i<=6 && i<=up;i++)
        {
            outer.addAll(combosRETURN(p+i,up-i));
        }
        return outer;
    }

}
