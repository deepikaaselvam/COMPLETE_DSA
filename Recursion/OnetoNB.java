package Recursion;
public class OnetoNB {
    public static void backtrack(int n)
    {
        if(n<1)
        {
            return;
        }
        backtrack(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        int n=5;
        backtrack(n);
    }
    
}
