package Trees;

public class ChildSum {
    public static void main(String[] args) {

    }
    static void Childsumfunction(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        int child=0;
        if(root.left!=null)
        {
            child+=root.left.val;
        }
        if(root.right!=null)
        {
            child+=root.right.val;
        }
        if(child>=root.val)
        {
            root.val=child;
        }
        else {
            if(root.left!=null)
            {
                root.left.val=root.val;
            }
            if(root.right!=null)
            {
                root.right.val=root.val;
            }
        }

        Childsumfunction(root.left);
        Childsumfunction(root.right);
        int total=0;
        if(root.left!=null)
        {
            total+=root.left.val;
        }
        if(root.right!=null)
        {
            total+=root.right.val;
        }
        if(root.left !=null || root.right !=null)
            root.val=total;
    }
}
