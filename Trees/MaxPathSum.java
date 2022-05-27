package Trees;

public class MaxPathSum {
    static int max=0;
    public static void main(String[] args) {

    }
    static int maxPathSum(TreeNode root) {
        if(root==null)
        {
            return 0;
        }
        int lh=Math.max(0,maxPathSum(root.left));
        int rh=Math.max(0,maxPathSum(root.right));
        max=Math.max(max,root.val +lh+rh);
        return root.val +Math.max(lh,rh);
    }
}
