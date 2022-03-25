package SortingAssignments;

import java.util.*;

//https://leetcode.com/problems/group-anagrams/
public class GroupAnangrams {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(strs));
    }


    static List<List<String>> groupAnagrams(String[] strs) {
        ArrayList<String> list = new ArrayList<>();
        List<List<String>> finalans = new ArrayList<>();
        for (String item : strs) {
            char[] chars = item.toCharArray();
            Arrays.sort(chars);
            String temp = String.valueOf(chars);
            list.add(temp);
        }

        System.out.println(list);
        HashMap <String,ArrayList<String>> map=new HashMap<>();
        for(int i=0;i<list.size();i++)
        {
            if(map.containsKey(list.get(i))){
                ArrayList<String> temp=map.get(list.get(i));
                temp.add(strs[i]);
                map.put(list.get(i),temp);
            }
            else {
                ArrayList<String> temp=new ArrayList<>();
                temp.add(strs[i]);
                map.put(list.get(i),temp);
            }
        }
        for(String key:map.keySet())
        {
            finalans.add(map.get(key));
        }
        return finalans;
    }
}