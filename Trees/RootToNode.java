package Trees;

import java.util.ArrayList;

public class RootToNode {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(20);
        root.left = new TreeNode(8);
        root.left.left =new TreeNode(4);
        root.left.right = new TreeNode(12);
        root.left.right.left = new TreeNode(10);
        root.left.right.right = new TreeNode(14);
        root.right = new TreeNode(22);
        root.right.right = new TreeNode(25);
        ans(root,14);
    }
    static void ans(TreeNode root, int target)
    {

        ArrayList<Integer> arr=new ArrayList<>();
        helper(root,arr,target);
        System.out.println(arr);
    }
    static boolean helper(TreeNode root, ArrayList<Integer> arr, int target)
    {
        if(root==null)
        {
            return false;
        }
        arr.add(root.val);
        if(root.val== target)
        {
            return true;
        }
        if(helper(root.left,arr,target) || helper(root.right,arr,target))
        {
            return true;
        }
        arr.remove(arr.size()-1);
        return false;
    }


}
