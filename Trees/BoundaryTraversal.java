package Trees;

import com.sun.source.tree.Tree;
import org.w3c.dom.Node;

import java.util.ArrayList;

//https://www.geeksforgeeks.org/boundary-traversal-of-binary-tree/
public class BoundaryTraversal {
    public static void main(String[] args) {

       TreeNode root = new TreeNode(20);
        root.left = new TreeNode(8);
        root.left.left =new TreeNode(4);
        root.left.right = new TreeNode(12);
        root.left.right.left = new TreeNode(10);
        root.left.right.right = new TreeNode(14);
        root.right = new TreeNode(22);
        root.right.right = new TreeNode(25);
        ArrayList<Integer >ans = new ArrayList<>();
        ans.add(root.val);
        addLeft(root,ans);
        addLeaves(root,ans);
        addRight(root,ans);
        System.out.print(ans+" ");

    }
    static boolean isleaf(TreeNode root)
    {
        return root.left == null && root.right == null;
    }
    static void addLeft(TreeNode root, ArrayList<Integer> res)
    {
        TreeNode curr=root.left;
        while (curr!=null)
        {
            if(!isleaf(curr))
            {
                res.add(curr.val);
            }
            if(curr.left!=null)
            {
                curr=curr.left;
            }
            else
            {
                curr=curr.right;
            }
        }
    }
    static void addRight(TreeNode root, ArrayList<Integer> res2)
    {
        ArrayList<Integer> res=new ArrayList<>();
        TreeNode curr=root.right;
        while (curr!=null)
        {
            if(!isleaf(curr))
            {
                res.add(curr.val);
            }
            if(curr.right!=null)
            {
                curr=curr.right;
            }
            else
            {
                curr=curr.left;
            }
        }
        for(int i=res.size()-1;i>=0;i--)
        {
            res2.add(res.get(i));
        }
    }
    static void addLeaves(TreeNode root,ArrayList<Integer> res)
    {
        if(isleaf(root))
        {
            res.add(root.val);
        }
        else
        {
            if(root.left!=null)
            {
                addLeaves(root.left,res);
            }
            if(root.right!=null)
            {
                addLeaves(root.right,res);
            }
        }
    }



}
