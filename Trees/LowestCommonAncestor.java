package Trees;

public class LowestCommonAncestor {
    public static void main(String[] args) {

    }
    static  TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null || root ==p || root==q)
        {
            return root;
        }
        TreeNode left=lowestCommonAncestor(root.left,p,q);
        TreeNode right=lowestCommonAncestor(root.right,p,q);

        if(left==null)
        {
            return right;
        }
        else  if(right==null)
        {
            return right;
        }
        else {
            return root;
        }
    }
}
