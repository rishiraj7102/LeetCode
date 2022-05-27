package Trees;

public class ValidateBST {
    public static void main(String[] args) {

    }
    static boolean isValidBST(TreeNode root) {
        return helper(root,Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    static boolean helper(TreeNode root, int min, int max)
    {
        if(root==null)
        {
            return true;
        }
        if(root.val>=max || root.val<= min)
        {
            return false;
        }
        return helper(root.left,min,root.val) && helper(root.right,root.val,max);
    }
}
