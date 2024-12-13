package Greedy;
import java.util.Arrays;
public class SJF {
    public static int shortestJobFirst(int[]sjf)
    {
        int arrivalTym=0,waitigTym=0;
        int n=sjf.length;
        Arrays.sort(sjf);
        for(int i=0;i<sjf.length;i++)
        {
            waitigTym+=arrivalTym;
            arrivalTym+=sjf[i];
          
            
        }
        return waitigTym/n;    //Total Waiting Process 
    }
    public static void main(String[] args) {
        int[]sjf={4,3,7,1,2};
        System.out.println(shortestJobFirst(sjf));

        }
    }
    

