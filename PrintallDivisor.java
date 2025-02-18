
public class PrintallDivisor {
    public static void main(String[] args) {
        int n=90000000;
        System.out.print(1+" "+n);
        long start =System.currentTimeMillis();
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                System.out.print(i+" ");
                if(i !=n/i)
                {
                   System.out.print(n/i+" ");
                }
                 
                
            }
        }

        long stop = System.currentTimeMillis();
        System.out.println();
       
       
        System.out.println(("the Execution tym is "+(stop-start)+" milliseconds."));
     

        
    }
    
}
