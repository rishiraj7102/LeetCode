package Trees;
//https://leetcode.com/problems/balanced-binary-tree/
public class CheckBalance {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);
        if(maxDepth(tree.root)==-1)
        {
            System.out.println(false);
        }
        System.out.println(true);
    }
  static int maxDepth(TreeNode root)
  {
      if(root==null)
      {
          return 0;
      }

      int lh=maxDepth(root.left);
      int rh=maxDepth(root.right);
      if(lh==-1 || rh == -1)
      {
          return -1;
      }
      if(Math.abs(lh-rh)>1)
      {
          return -1;
      }

      return 1 + Math.max(lh,rh);
    }

}
