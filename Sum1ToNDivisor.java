public class Sum1ToNDivisor{
// User function Template for Java

    public static int sumofEachValueDivisor(int singlevalue)
    {
        int EachDigitSum =0;
        for(int i=1;i<=singlevalue;i++)
        {
            
            if(singlevalue% i ==0)
            {
                EachDigitSum+=i;
            }
        }
        return EachDigitSum;
    }
    public static int sumOfDivisors(int n) {
        int FinalAns=0;
        int ans =0;
        for(int i=1;i<=n;i++)
        {
             ans =sumofEachValueDivisor(i);
             FinalAns+=ans;
        }
        return FinalAns;
        //code here
       
}
        
    
    public static void main(String[] args) {
        System.out.println(sumOfDivisors(4));
    }
} 