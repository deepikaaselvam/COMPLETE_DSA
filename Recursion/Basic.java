package Recursion;

public class Basic {
    public static void basic(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.println(n);
        basic(n-1);
    }
   public static void main(String[] args) {
    int n=5;
    basic(n);
   }
}
