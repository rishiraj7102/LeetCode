package Trees;

public class SearchInBST {
    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode curr=root;
        while(curr!=null)
        {
            if(curr.val==val)
            {
                return curr;
            }
            if(curr.val>val)
            {
                curr=curr.left;
            }
            else{
                curr=curr.right;
            }
        }
        return null;

    }
}
