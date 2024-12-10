package BinaryTree;

public class Node {
    int data;
    Node left;
    Node right;
    public Node(int key)
    {
        this.data=key;
        System.out.println(data);
    } 
    public static void main(String[] args) {
        
    Node root=new Node(1);
    root.left=new Node (2);
    root.right=new Node(3);
    root.left.right=new Node(9);
    root.left.left=new Node(4);
    
}
    
}
