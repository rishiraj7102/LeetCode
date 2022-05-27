package Trees;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
public class ConstructTree {
    public static void main(String[] args) {

    }
    static TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer,Integer> inMap=new HashMap<>();
        for(int i=0;i<inorder.length;i++)
        {
            inMap.put(inorder[i],i);
        }
        TreeNode root=helperFunction(preorder,0,preorder.length-1,inorder,0,inorder.length-1,inMap);
        return root;
    }
    static TreeNode helperFunction(int [] preorder, int prestart, int preend, int [] inorder, int inStart, int inEnd, Map<Integer,Integer> inMap)
    {
        if(prestart>preend || inStart>inEnd)
        {
            return null;
        }
        TreeNode root=new TreeNode(preorder[prestart]);

        int inroot=inMap.get(root.val);
        int numleft=inroot-inStart;

        root.left=helperFunction(preorder,prestart+1,prestart+numleft,inorder,inStart,inroot-1,inMap);
        root.right=helperFunction(preorder,prestart+numleft+1,preend,inorder,inroot+1,inEnd,inMap);
        return root;

    }
}
