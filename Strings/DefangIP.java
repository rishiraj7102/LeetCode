package Strings;

public class DefangIP {
    public static void main(String[] args) {
        System.out.println(defangIPaddr("255.100.50.0"));
    }
    static String defangIPaddr(String address) {
        String ans = "";
        int start=0;
        for(int i=0;i<address.length();i++)
        {
            if(address.charAt(i)=='.')
            {
                ans=ans+"[.]";
                start=i+1;
            }
            else {
                ans=ans+address.charAt(i);
            }
        }
        return ans;
    }
}
