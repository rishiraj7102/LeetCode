package Trees;

public class DeletaNodeinBST {
    public static void main(String[] args) {

    }
    static TreeNode deleteNode(TreeNode root, int key) {
        if(root==null)
        {
            return null;
        }
        if(root.val==key)
        {
            return helperfunction(root);
        }
        TreeNode dummy=root;
        while (root!=null)
        {
            if(root.val>key)
            {
                if(root.left!=null && root.left.val==key)
                {
                    root.left= helperfunction(root.left);
                    break;
                }
                else {
                    root=root.left;
                }
            }
            else {
                if(root.right!=null && root.right.val==key)
                {
                    root.right=helperfunction(root.right);
                    break;
                }
                else {
                    root=root.right;
                }
            }


        }
        return dummy;
    }
    static TreeNode helperfunction(TreeNode root)
    {
        if(root.left==null)
        {
            return root.right;
        }
        else if(root.right==null)
        {
            return root.left;
        }
        else{
            TreeNode rightchild=root.right;
            TreeNode lastright=findlastright(root.left);
            lastright.right=rightchild;
            return root.left;
        }
    }
    static TreeNode findlastright(TreeNode root)
    {
        if(root.right==null)
        {
            return root;
        }
        return findlastright(root.right);
    }
}
