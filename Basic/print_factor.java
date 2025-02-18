package Basic;

public class print_factor
{
    public static void main(String[]args)
    {
        long num =100000011111111l;
        long start=System.currentTimeMillis();
        // for(long i=1;i<=Math.sqrt(num);i++)
        // {
        //     if(num%i ==0)
        //     {
        //         System.out.printf("%d  %d\n",i,num/i);
        //     }
        // }
        int checkFactor =1;
        while(checkFactor<=(num/checkFactor))
        {
            if(num%checkFactor==0)
            {
                System.out.printf("%d  %d\n",checkFactor,num/checkFactor);
            }
            checkFactor+=1;
        }
        long stop = System.currentTimeMillis();
        double timetaken =(stop-start)/1000.0;
        System.out.print("time Taken: "+timetaken);
    }
}
/*
 * 200=>Question
 * CF        number/CF
 * 1 * 200 = 200
 * 2 * 100 = 200
 * 3 *     =  
 * 4 * 50  = 200
 * 5 *  40 = 200
 * 6
 * 7
 * 8
 * 9
 * 10 * 20 = 200
 * 11 * 20 = 17.xxx
 * 12 * 20 = 16.xxx
 * 13 * 20 = 15.xxx
 * 14 * 20 = 14.xxxx
 * 15 * 20 = 13.xxx
 */