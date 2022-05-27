package Trees;
//https://leetcode.com/problems/count-complete-tree-nodes/
public class CountNodes {
    public static void main(String[] args) {

    }
    static int countNodes(TreeNode root) {
        if(root==null)
        {
            return 0;
        }
        int lh=getleftcount(root);
        int rh=getrightcount(root);
        if(lh==rh)
        {
            return (2<<lh)-1;
        }
        else {
            return 1+countNodes(root.left)+countNodes(root.right);
        }
    }
    static int getleftcount(TreeNode root)
    {
        int count=0;
        while (root.left!=null)
        {
            count++;
            root=root.left;
        }
        return count;
    }
    static int getrightcount(TreeNode root)
    {
        int count=0;
        while (root.right!=null)
        {
            count++;
            root=root.right;
        }
        return count;
    }
}
