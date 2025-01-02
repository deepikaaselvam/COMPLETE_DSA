package Recursion;

public class PowerofTwo {
    public static boolean isPowerofTwo(int n)
    {
        if(n/2==0)
        {
            return true;
        }
       
       
        return isPowerofTwo(n%2);
        
    }
    public static void main(String[] args) {
        int n=3;
        System.out.println(isPowerofTwo(n));;
    }
    
}
