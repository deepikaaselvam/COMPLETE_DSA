package Recursion;
import java.math.BigInteger;
public class Fact {
    public static BigInteger factorial(int n)// For "Very Large Numbers'"
    {
        if(n==0||n==1)
        {
           return BigInteger.ONE;
        }
        return BigInteger.valueOf(n).multiply(factorial(n-1));//Without return We cannot do 
                                //The factorial,One methid is the Global/Static varible in "Below Code"

    }
    public static void main(String[] args) {
        int n=1000;
        BigInteger answer=factorial(n);
        System.out.println(answer);
    }
    
}
/*
 * public static int factorial(int n)      //For "Small Numbers"
 * {
 * if(n==0||n==1)
 * {
 * return ;}
 * return n*factorial(n-1);
 * }
 */




/*
 * public static void factorial(int n)
 * {
 * static int result=1;
 * if(fact==0||fact==1)
 * {
 * return;
 * }
 * result *=n;
 * factorial(n-1);
 * }
 */