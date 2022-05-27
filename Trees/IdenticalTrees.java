package Trees;

public class IdenticalTrees {
    public static void main(String[] args) {

    }
    static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null || q==null)
        {
            return p==q;
        }
        return (p.val==q.val && isSameTree(p.left,q.left) && isSameTree(p.right,q.right));


    }
}
