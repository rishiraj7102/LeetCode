package Trees;
//https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
public class LCAofBST {
    public static void main(String[] args) {

    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null)
        {
            return null;
        }
        if(p.val>root.val && q.val<root.val)
        {
            return root;
        }
        if(p.val<root.val && q.val>root.val)
        {
            return root;
        }
        if(p.val>root.val && q.val>root.val)
        {
            return lowestCommonAncestor(root.right,p,q);
        }
        else {
            return lowestCommonAncestor(root.left,p,q);
        }


    }

}
