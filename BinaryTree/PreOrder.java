package BinaryTree;
import java.util.ArrayList;
import java.util.Stack;
// class TreeNode{
//     int data;
//     TreeNode left;
//     TreeNode right;
//     TreeNode(){}
//    TreeNode(int data)
//     {
//     this.data=data;
//     }
//    TreeNode(int data,TreeNode left,TreeNode right)
//    {
//     this.data=data;
//     this.left=left;
//     this.right=right;
//     }
// }

 public class PreOrder {
  
    public static ArrayList<Integer>preOrderTravesal(TreeNode root)
    {
        ArrayList <Integer>preeeOrder=new ArrayList<>();
        Stack<TreeNode>st=new Stack<>();
        if(root==null)
        {
            return preeeOrder;
        }
        st.push(root);
        while(!st.isEmpty())
        {
            TreeNode currentRoot=st.pop();
            // preeeOrder.add(currentRoot.data);
            if(currentRoot.right!=null)
            {
                st.push(currentRoot.right);
            }
            if(currentRoot.left!=null)
            {
                st.push(currentRoot.left);
            }
        }

        return preeeOrder;
    }
    public static void main(String[] args) {
       TreeNode root=new TreeNode(1);
       root.left=new TreeNode(2);
       root.right=new TreeNode(7);
       root.left.left=new TreeNode(3);
       root.left.right=new TreeNode(4);
       root.left.right.left=new TreeNode(5);
       root.left.right.right=new TreeNode(6);
       ArrayList<Integer>answer=preOrderTravesal(root);
       for(int i=0;i<answer.size();i++)
       {
            System.out.print(answer.get(i)+" ");
       }
    }
}
