package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class SerializeDeserializeTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(20);
        root.left = new TreeNode(8);
        root.left.left =new TreeNode(4);
        root.left.right = new TreeNode(12);
        root.left.right.left = new TreeNode(10);
        root.left.right.right = new TreeNode(14);
        root.right = new TreeNode(22);
        root.right.right = new TreeNode(25);

        System.out.println(serialize(root));
        String serialized=serialize(root);


    }
    static String serialize(TreeNode root) {
        if(root==null) return "";
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        StringBuilder serialized=new StringBuilder();
        while (!q.isEmpty())
        {
            TreeNode node=q.peek();
            q.poll();
            if(node==null)
            {
                serialized.append("# ");
            }
            else {
                serialized.append(node.val+" ");
            }
            if(node!=null)
            {
                q.add(node.left);
                q.add(node.right);
            }

        }
        return serialized.toString();
    }
    static TreeNode deserialize(String data) {
        if(data.equals("")) return null;
        String [] values= data.split(" ");
        int rootval=Integer.parseInt(values[0]);
        TreeNode root=new TreeNode(rootval);
        Queue<TreeNode > q=new LinkedList<>();
        q.add(root);
        for (int i=1;i<values.length;i++)
        {
            TreeNode parent=q.poll();
            if(!values[i].equals("#"))
            {
                TreeNode left=new TreeNode(Integer.parseInt(values[i]));
                assert parent != null;
                parent.left=left;
                q.add(left);
            }
            if(!values[++i].equals("#"))
            {
                TreeNode right=new TreeNode(Integer.parseInt(values[i]));
                assert parent != null;
                parent.right=right;
                q.add(right);
            }
        }
        return root;
    }

}
