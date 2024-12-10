package BinaryTree;
import java.util.ArrayList;
import java.util.Stack;
import java.util.Collections;
class TreeNode{
    int value;
    TreeNode left;
    TreeNode right;
    TreeNode(){}
    TreeNode(int value)
    {
        this.value=value;
    }
    TreeNode(int value,TreeNode left,TreeNode right)
    {
        this.value=value;
        this.left=left;
        this.right=right;
    }
}

public class PostOrdr1 {
    public static ArrayList<Integer> PostOrderUsingStackOne(TreeNode root)
    {
        ArrayList<Integer>answer=new ArrayList<>();
        Stack<TreeNode>st=new Stack<>();
        st.push(root);
        while(!st.isEmpty())
        {
            TreeNode currentvalue=st.pop();
            answer.add(currentvalue.value);
            if(currentvalue.left!=null)
            {
                st.push(currentvalue.left);
            }
            if(currentvalue.right!=null)
            {
                st.push(currentvalue.right);
            }
        }
        Collections.reverse(answer);

        return answer;

    }
    public static void main(String[] args) {
        
        TreeNode root = new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        root.right.left=new TreeNode(6);
        root.right.left.right=new TreeNode(7);
        root.right.left.right.right=new TreeNode(8);
        ArrayList<Integer>ans = PostOrderUsingStackOne(root);
        for(int i=0;i<ans.size();i++)
        {
            System.out.print(ans.get(i)+" ");
        }



    }
    
}
