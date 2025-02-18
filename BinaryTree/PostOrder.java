package BinaryTree;


// import java.util.ArrayList;
// import java.util.Stack;
class TreeNodee
{
    int val;
    TreeNodee left;
    TreeNodee right;
    TreeNodee()
    {}
    TreeNodee(int val)
    {
        this.val=val;
    }
    TreeNodee(int val,TreeNodee left,TreeNodee right)
    {
        this.val=val;
        this.left=left;
        this.right=right;
    }

}
public class PostOrder {
    // public static ArrayList<Integer>postOrder(TreeNode root)
    // {
    //     ArrayList<Integer>postOrderr=new ArrayList<>();
    //     Stack<TreeNodee >st1=new Stack<>();
    //     Stack<TreeNodee>st2=new Stack<>();
    //     TreeNode curval=root;
    //     if(root==null)
    //     {
    //         return postOrderr;
    //     }

    //     // while(true)
    //     // {
    //     //     if(curval!=null)
    //     //     {
    //     //         st1.push(curval.val);
    //     //         // TreeNode newStack2=st1.pop();
    //     //         // st2.push(newStack2.val);
    //     //         // postOrderr.add(st2.val);

    //     //     }
    //     //     if(curval.left!=null)
    //     //     {
    //     //         st1.push(curval.val);
    //     //     }
    //     //     if(curval.right!=null)
    //     //     {
    //     //         st1.push(curval.val);
    //     //     }
    //     // }

    // }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        root.right.left=new TreeNode(6);
        root.right.right.right=new TreeNode(7);
        root.right.right.right.right=new TreeNode(8);
        // System.out.print(postOrder(root));

        
    }
    
}
