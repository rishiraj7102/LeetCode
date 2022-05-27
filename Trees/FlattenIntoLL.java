package Trees;
//https://leetcode.com/problems/flatten-binary-tree-to-linked-list/
public class FlattenIntoLL {
     static TreeNode curr=null;

    static void flatten(TreeNode root) {
            if(root==null)
            {
                return;
            }
            flatten(root.right);
            flatten(root.left);

            root.right=curr;
            root.left=null;
            curr=root;


    }
}
