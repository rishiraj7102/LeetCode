package Trees;

public class Diameter {
    static int max=0;
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);
        max=0;
        findD(tree.root);
        System.out.println(max);
    }
    static int findD(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        int lh=findD(root.left);
        int rh=findD(root.right);
        max=Math.max(max,lh+rh);
        return 1+Math.max(lh,rh);
    }
}

