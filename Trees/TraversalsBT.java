package Trees;

import com.sun.source.tree.Tree;

import java.util.*;

public class TraversalsBT {
    static public void InOrderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }
        InOrderTraversal(node.left);

        System.out.print(node.val + " ");
        InOrderTraversal(node.right);
    }

    static public void PreOrderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }

        System.out.println();
        System.out.print(node.val + " ");
        System.out.println();
        PreOrderTraversal(node.left);
        PreOrderTraversal(node.right);
    }

    static public void PostOrderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }
        PostOrderTraversal(node.left);
        PostOrderTraversal(node.right);
        System.out.println(node.val);
    }

    static public void IterativeInorder(TreeNode node) {
        TreeNode temp = node;
        Stack<TreeNode> s = new Stack<>();
        s.push(temp);
        while (true) {
            if (temp != null) {
                s.push(temp);
                temp = temp.left;
            } else {
                if (s.empty()) {
                    break;
                }
                TreeNode val = s.pop();
                System.out.println(val.val);

                temp = val.right;
            }
        }
    }

    static public void IterativePreOrder(TreeNode node) {
        Stack<TreeNode> s = new Stack<>();
        s.push(node);
        while (!s.isEmpty()) {
            node = s.pop();
            System.out.println(node.val);
            if (node.right != null) {
                s.push(node.right);

            }
            if (node.left != null) {
                s.push(node.left);
            }
        }
    }

    static public void IterativePostOrderUsing2Stack(TreeNode node)
    {

        Stack<TreeNode> s1=new Stack<>();
        Stack<TreeNode> s2=new Stack<>();
        s1.push(node);
        while (!s1.isEmpty())
        {
            TreeNode top=s1.peek();
            s1.pop();
            s2.push(top);
            if(top.left!=null)
            {
                s1.push(top.left);
            }
            if(top.right!=null)
            {
                s1.push(top.right);
            }
        }
        while (!s2.isEmpty())
        {
            System.out.println(s2.peek().val);
            s2.pop();
        }

    }
    static public void IterativePostOrderUsing1Stack(TreeNode node)
    {
        Stack<TreeNode> s=new Stack<>();
        TreeNode curr=node;
        TreeNode temp;
        while (curr!=null || !s.isEmpty())
        {
            if(curr!=null)
            {
                s.push(curr);
                curr=curr.left;
            }
            else {
                temp=s.peek().right;
                if(temp==null)
                {
                    temp=s.peek();
                    s.pop();
                    System.out.println(temp.val);
                    while (!s.isEmpty() && temp==s.peek().right)
                    {
                        temp=s.peek();
                        s.pop();
                        System.out.println(temp.val);
                    }
                }
                else {
                    curr=temp;
                }
            }
        }
    }
    public  static  void MorrisTraversalInorder(TreeNode node)
    {
        ArrayList<Integer> list=new ArrayList<>();
        TreeNode curr=node;
        while (curr!=null)
        {
            if(curr.left==null)
            {
                list.add(curr.val);
                curr=curr.right;
            }
            else {
                TreeNode prev=curr.left;
                while (prev.right!=null && prev.right!=curr)
                {
                    prev=prev.right;
                }
                if(prev.right==null)
                {
                    prev.right=curr;
                    curr=curr.left;
                }
                else {
                    prev.right=null;
                    list.add(curr.val);
                    curr=curr.right;
                }
            }
        }
        for (int i: list)
        {
            System.out.print(i);
        }
    }


    public  static  void MorrisTraversalPreOrder(TreeNode node)
    {
        ArrayList<Integer> list=new ArrayList<>();
        TreeNode curr=node;
        while (curr!=null)
        {
            if(curr.left==null)
            {
                list.add(curr.val);
                curr=curr.right;
            }
            else {
                TreeNode prev=curr.left;
                while (prev.right!=null && prev.right!=curr)
                {
                    prev=prev.right;
                }
                if(prev.right==null)
                {
                    prev.right=curr;
                    list.add(curr.val);
                    curr=curr.left;
                }
                else {
                    prev.right=null;

                    curr=curr.right;
                }
            }
        }
        for (int i: list)
        {
            System.out.print(i);
        }
    }




    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);

             InOrderTraversal(tree.root);
//        PreOrderTraversal(tree.root);
//          PostOrderTraversal(tree.root);
        System.out.println();
//            IterativeInorder(tree.root);
       // IterativePreOrder(tree.root);
//        IterativePostOrderUsing1Stack(tree.root);
            MorrisTraversalInorder(tree.root);

    }
}
