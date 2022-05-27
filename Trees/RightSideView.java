package Trees;

import java.util.*;

public class RightSideView {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(20);
        root.left = new TreeNode(8);
        root.left.left =new TreeNode(4);
        root.left.right = new TreeNode(12);
        root.left.right.left = new TreeNode(10);
        root.left.right.right = new TreeNode(14);
        root.right = new TreeNode(22);
        root.right.right = new TreeNode(25);
        System.out.println(rightSideView(root));
    }
    public static class Tuple{
        TreeNode node;
        int val;

        Tuple(TreeNode node,int val){
            this.node=node;
            this.val=val;
        }
    }
    static List<Integer> rightSideView(TreeNode root) {
        Queue<Tuple> q=new LinkedList<>();
        List<Integer> ans=new ArrayList<>();
        TreeMap<Integer,Integer> map=new TreeMap<>();
        q.add(new Tuple(root,0));
        while (!q.isEmpty())
        {
            Tuple t=q.remove();
            TreeNode node=t.node;
            int x=t.val;

            if(!map.containsKey(x))
            {
                map.put(x,node.val);
                ans.add(node.val);
            }

            if(node.right!=null)
            {
                q.add(new Tuple(node.right,x+1));
            }
            if(node.left!=null)
            {
                q.add(new Tuple(node.left,x+1));
            }
        }
   //     List<Integer> ans=new ArrayList<>();
//        for(int i:map.values())
//        {
//            ans.add(i);
//        }
        return ans;
    }
}
