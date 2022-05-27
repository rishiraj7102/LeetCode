package Trees;

import com.sun.source.tree.Tree;

import java.time.temporal.Temporal;

public class kthsmallest {
    public static void main(String[] args) {

    }
    static int kthsmallest(TreeNode root, int k) {

        TreeNode small=helper(root,k);
        return small.val;
    }
    static TreeNode helper(TreeNode root,int k)
    {
        if(root==null)
        {
            return null;
        }
        if(k==0)
        {
            return root;
        }
        helper(root.left,k);
        k--;
        return helper(root.right,k);
    }
}
