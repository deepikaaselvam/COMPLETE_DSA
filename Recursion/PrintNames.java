package Recursion;

public class PrintNames {
    public static void printNames(int n)
    {
        if(n>5)
        {
            return;
        }
        printNames(n+1);
        System.out.println("Deepika");
       
    }
    public static void main(String[] args) {
        int n=1;
        printNames(n);
    }
    
}
