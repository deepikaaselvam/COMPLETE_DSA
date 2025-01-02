package Recursion;
import java.math.BigInteger;
public class Fibo {
    public static BigInteger fibonacci(int n)
    {
        if(n==0)
        {
            return BigInteger.ZERO;
        }
        if(n==1)
        {
            return BigInteger.ONE;
        }
        return (fibonacci(n-1).add(fibonacci(n-2)));
    }
    public static void main(String[] args) {
        int n=41;//	165580141
        BigInteger  ans=fibonacci(n);
        System.out.println(ans);
    }
    
}
/* public static int fibonacci(int n)     //For "Small Numbers"
    {
        if(n==0)
        {
            return 0;
        }
        if(n==1)
        {
            return 1;
        }
        return (fibonacci(n-1).add(fibonacci(n-2)));
    }

 * 
 */