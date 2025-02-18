package Contest;
class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode()
    {

    }
    TreeNode(int data)
    {
        this.data=data;
    }
    TreeNode(int data,TreeNode left,TreeNode right)
    {
        this.data=data;
        this.left=left;
        this.right =right;
    }
}

public class RecInOrder {
    public void recursiveInorder(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        recursiveInorder(root.left);
        System.out.print(root.data+" ");
        recursiveInorder(root.right);
        


    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        root.right.left=new TreeNode(6);
        root.right.right=new TreeNode(7);
        RecInOrder recInOrder = new RecInOrder();
        recInOrder.recursiveInorder(root);
    }

    
}
