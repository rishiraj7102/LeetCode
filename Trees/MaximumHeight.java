package Trees;

public class MaximumHeight {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);

        System.out.println(maxheight(tree.root));
      }
    static int maxheight(TreeNode treeNode)
    {

        if (treeNode ==null)
        {
            return 0;
        }
        int lhs=maxheight(treeNode.left);
        int rhs=maxheight(treeNode.right);

        return 1+Math.max(lhs,rhs);

    }
}
