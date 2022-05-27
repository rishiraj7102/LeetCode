package Trees;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val)
    {
        this.val = val;
        left=right=null;
    }

}
public class BinaryTree {
    TreeNode root;
    BinaryTree(int data)
    {
        root.val =data;
    }
    BinaryTree()
    {
        root=null;
    }

    public static void main(String[] args) {
        BinaryTree tree=new BinaryTree();
        tree.root=new TreeNode(1);
        tree.root.left=new TreeNode(2);
        tree.root.right=new TreeNode(3);
        /* 2 and 3 become left and right children of 1
               1
            /     \
          2        3
        /   \     /  \
      null null null null  */

        tree.root.left.left=new TreeNode(4);

        /* 4 becomes left child of 2
                    1
                /       \
               2          3
             /   \       /  \
            4    null  null  null
           /   \
          null null
         */
    }
}
