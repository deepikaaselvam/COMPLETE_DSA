public class primeFactorization {
    public static void main(String[] args) {
        int n=100;//27;//780;
        
        int ansCheck =1;
        for(int i=2;i<=n;i++)
        {
           while(n%i ==0)
           {
              System.out.print(i+" ");
                ansCheck *=i;
                n=n/i;
           }
           if(ansCheck==n)
           {
                break;
           }
        }
    }
    
}
