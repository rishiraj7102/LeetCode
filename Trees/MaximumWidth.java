package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumWidth {
    public static void main(String[] args) {

    }
    static class Pair{
        TreeNode node;
        int num;
        Pair(TreeNode node, int num)
        {
            this.node=node;
            this.num=num;
        }
    }
    static int widthOfBinaryTree(TreeNode root) {
        Queue<Pair> q=new LinkedList<>();
        int ans=0;
        if(root==null)
        {
            return 0;
        }
        q.add(new Pair(root,0));
        while (!q.isEmpty())
        {
            int size=q.size();
            int mmin=q.peek().num;
            int first=0;
            int last=0;
            for(int i=0;i<size;i++)
            {
                int cur_id=q.peek().num-mmin;
                TreeNode node=q.peek().node;
                q.poll();
                if(i==0)
                {
                    first=cur_id;
                }
                if(i==size-1)
                {
                    last=cur_id;
                }
                if(node.left!=null)
                {
                    q.add(new Pair(node.left,(2*cur_id)+1));
                }
                if(node.right!=null)
                {
                    q.add(new Pair(node.right,cur_id*2+2));
                }
            }

            ans=Math.max(ans,last-first+1);
        }
return ans;
    }
}
