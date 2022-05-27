package Trees;

public class CeilBST {
    public int findceil(TreeNode root, int key)
    {
        int ceil=Integer.MAX_VALUE;
        while (root!=null)
        {
            if(root.val==key)
            {
                ceil=root.val;
                return ceil;
            }
            if(root.val>key && root.val<ceil)
            {
                ceil=root.val;
                root=root.left;
            }
            if(root.val<key)
            {
                root=root.right;
            }

        }
        return ceil;
    }
}
