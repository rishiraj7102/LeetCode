package Trees;

import java.util.*;

//https://leetcode.com/problems/all-nodes-distance-k-in-binary-tree/
public class AllNodesatKDIstance {
    public static void main(String[] args) {

    }
    static void markParent(TreeNode root, Map<TreeNode,TreeNode> mark_parent,TreeNode target)
    {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while (!q.isEmpty())
        {
            TreeNode node=q.poll();
            if(node.left!=null)
            {
                q.add(node.left);
                mark_parent.put(node.left,node);
            }
            if(node.right!=null)
            {
                q.add(node.right);
                mark_parent.put(node.right,node);
            }
        }
    }
    static List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Map<TreeNode, TreeNode> mark_parent=new HashMap<>();
        markParent(root,mark_parent,target);
        Map<TreeNode, Boolean> visited =new HashMap<>();
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(target);
        visited.put(target,true);
        int dis=0;
        while (!queue.isEmpty())
        {
            int size= queue.size();
            if(dis==k)
            {
                break;
            }
            dis++;
            for(int i=0;i<size;i++)
            {
                TreeNode current= queue.poll();
                if(current.left!=null && visited.get(current.left)==null)
                {
                    queue.add(current.left);
                    visited.put(current.left,true);
                }
                if(current.right!=null && visited.get(current.right)==null)
                {
                    queue.add(current.right);
                    visited.put(current.right,true);
                }
                if(mark_parent.get(current)!=null && visited.get(mark_parent.get(current))==null)
                {
                    queue.add(mark_parent.get(current));
                    visited.put(mark_parent.get(current),true);
                }

            }
        }
        List<Integer> result=new ArrayList<>();
        while (!queue.isEmpty())
        {
            result.add(queue.poll().val);
        }
        return result;
    }
}
