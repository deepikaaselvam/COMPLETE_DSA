package Recursion;

public class NtoOne {
    public static void printNToOne(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.println(n);
        printNToOne(n-1);
    }
    public static void main(String[] args) {
        int n=5;
        printNToOne(n);
    }
    
}
