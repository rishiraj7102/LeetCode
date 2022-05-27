package Trees;

import com.sun.source.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

//https://www.geeksforgeeks.org/print-nodes-top-view-binary-tree/
public class TopView {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(20);
        root.left = new TreeNode(8);
        root.left.left =new TreeNode(4);
        root.left.right = new TreeNode(12);
        root.left.right.left = new TreeNode(10);
        root.left.right.right = new TreeNode(14);
        root.right = new TreeNode(22);
        root.right.right = new TreeNode(25);

        TopviewAns(root);
        BottomView(root);
    }
    public static class Tuple{
        TreeNode node;
        int val;

        Tuple(TreeNode node,int val){
            this.node=node;
            this.val=val;
        }
    }
    static void BottomView(TreeNode root)
    {
        TreeMap<Integer,Integer> map=new TreeMap<>();
        Queue<Tuple> q=new LinkedList<>();
        q.add(new Tuple(root,0));
        while (!q.isEmpty())
        {
            Tuple t=q.remove();
            TreeNode node=t.node;
            int x=t.val;
//            q.remove();
            if(!map.containsKey(x))
            {
                map.put(x,node.val);
            }
            else if(map.containsKey(x))
            {
                map.remove(x);
                map.put(x,node.val);
            }
            if(node.left!=null)
            {
                q.add(new Tuple(node.left,x-1));
            }
            if(node.right!=null)
            {
                q.add(new Tuple(node.right,x+1));
            }
        }
        for(int i:map.values())
        {
            System.out.println(i);
        }

    }
    static void TopviewAns(TreeNode root)
    {
        TreeMap<Integer,Integer> map=new TreeMap<>();
        Queue<Tuple> q=new LinkedList<>();
        q.add(new Tuple(root,0));
        while (!q.isEmpty())
        {
            Tuple t=q.remove();
            TreeNode node=t.node;
            int x=t.val;
//            q.remove();
            if(!map.containsKey(x))
            {
                map.put(x,node.val);
            }
            if(node.left!=null)
            {
                q.add(new Tuple(node.left,x-1));
            }
            if(node.right!=null)
            {
                q.add(new Tuple(node.right,x+1));
            }
        }
        for(int i:map.values())
        {
            System.out.println(i);
        }

    }
}
