package Strings;
//https://leetcode.com/problems/excel-sheet-column-title/
public class ExcelSheet {
    public static void main(String[] args) {

    }
    static String convertToTitle(int columnNumber) {
        String ans="";
        while (columnNumber>0)
        {
            char c= (char) ('A'+(columnNumber-1)%26);
            ans=ans+c;
            columnNumber=(columnNumber-1)/26;
        }
        return ans;
    }
}
