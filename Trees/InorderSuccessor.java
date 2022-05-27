package Trees;

public class InorderSuccessor {
    public static void main(String[] args) {

    }
    public int successor(TreeNode root,int key)
    {
        return helper(root,key,Integer.MIN_VALUE);
    }
    public int helper(TreeNode root, int key,int successor)
    {
        if(root==null)
        {
            return successor;
        }
        if(root.val>key)
        {
            successor=root.val;
            root=root.left;

        }
        else

        {
            root=root.right;

        }

        return helper(root,key,successor);
    }
}
