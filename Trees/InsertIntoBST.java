package Trees;

public class InsertIntoBST {
    public static void main(String[] args) {

    }
    static TreeNode insertIntoBST(TreeNode root2, int val) {
        TreeNode root=root2;
        while (root!=null)
        {
            if(root.val>val)
            {
                if(root.left==null)
                {
                    root.left=new TreeNode(val);
                    return root2;
                }
                else {
                    root=root.left;
                }
            }
            if(root.val<val)
            {
                if(root.right==null)
                {
                    root.right=new TreeNode(val);
                    return root2;
                }
                else {
                    root=root.right;
                }
            }
        }
        return root;
    }
}
