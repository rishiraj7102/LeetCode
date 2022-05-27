package Trees;

import java.util.HashMap;
import java.util.Map;

public class CostructTree2 {
    public static void main(String[] args) {

    }
    static TreeNode buildTree(int[] inorder, int[] postorder) {
        Map<Integer,Integer> inMap=new HashMap<>();
        for(int i=0;i<inorder.length;i++)
        {
            inMap.put(inorder[i],i);
        }
        return helperFunction(postorder,0,postorder.length-1,inorder,0,inorder.length-1,inMap);
    }
    static TreeNode helperFunction(int [] postorder, int postStart, int postEnd, int [] inorder, int inStart, int inEnd, Map<Integer,Integer> inMap)
    {
        if(postStart>postEnd || inStart>inEnd)
        {
            return null;
        }
        TreeNode root=new TreeNode(postorder[postEnd]);

        int inroot=inMap.get(root.val);
        int numleft=inroot-inStart;

        root.left=helperFunction(postorder,postStart,postStart+numleft,inorder,inStart,inroot-1,inMap);
        root.right=helperFunction(postorder,postStart+numleft+1,postEnd-1,inorder,inroot+1,inEnd,inMap);
        return root;

    }
}
