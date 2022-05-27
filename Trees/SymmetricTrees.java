package Trees;

public class SymmetricTrees {
    public static void main(String[] args) {

    }
    static boolean isSymmetric(TreeNode root)
    {
        if(root==null)
        {
            return true;
        }
        return helperfunction(root.left,root.right);
    }
    static boolean helperfunction(TreeNode left,TreeNode right)
    {
        if(left==null || right==null)
        {
            return left==right;
        }
        if(left.val!=right.val)
            return false;
        return helperfunction(left.left , right.right) && helperfunction(left.right,right.left);
    }


}
