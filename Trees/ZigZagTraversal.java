package Trees;

//https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/
import java.util.*;

public class ZigZagTraversal {
    public static void main(String[] args) {

    }
    static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result=new ArrayList<>();
        if(root==null)
        {
            return result;
        }
        boolean LEFTtoRIGHT=true;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty())
        {
            int size=queue.size();
            List<Integer> list2=new ArrayList<>(size);
            int [] list=new int[size];
            for(int i=0;i<size;i++)
            {
                TreeNode front=queue.peek();
                queue.remove();
                int index;
                if(LEFTtoRIGHT)
                {
                    index=i;
                }
                else {
                    index=size-i-1;
                }
                assert front != null;
                list[index]=front.val;
                if(front.left!=null)
                {
                    queue.add(front.left);
                }
                if(front.right!=null)
                {
                    queue.add(front.right);
                }
            }
            LEFTtoRIGHT=!LEFTtoRIGHT;
            for(int i : list)
            {
                list2.add(i);
            }
            result.add(list2);
        }

        return result;
    }
}
