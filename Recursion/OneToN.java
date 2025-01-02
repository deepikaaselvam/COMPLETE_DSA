package Recursion;

public class OneToN {
    public static void printOneToN(int n)
    {
        if(n>6)
        {
            return;
        }
        System.out.println(n);
        printOneToN(n+1);
    }
    public static void main(String[] args) {
        int n=1;
        printOneToN(n);
    }
    
}
