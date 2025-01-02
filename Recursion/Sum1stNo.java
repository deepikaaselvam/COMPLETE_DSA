package Recursion;

public class Sum1stNo {
    public static int sumofFirstNNumbers(int n)
    {
        if(n==1)
        {
            return n;
        }
        return (n+sumofFirstNNumbers(n-1));
    }
    public static void main(String[] args) {
        int n=777;
        System.out.println(sumofFirstNNumbers(n));;
    }
    
}
