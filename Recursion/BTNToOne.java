package Recursion;
public class BTNToOne {
    public static void printNumber(int n)
    {
        if(n>5)
        {
            return ;
        }
        printNumber(n+1);
        System.out.println(n);
       
    }
    public static void main(String[] args) {
        int n=1;
        printNumber(n);
    }
    
}
