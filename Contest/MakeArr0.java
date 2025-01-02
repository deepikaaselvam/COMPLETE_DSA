package Contest;

public class MakeArr0 {  ///error placed
    public static boolean isSimulate(int[]array,int curr,int direction)
    {
        while(curr>=0 &&curr<array.length)
        {
            if(array[curr]==0)
            {
                
                curr+=direction;
            }
            else if(array[curr]>0)
            {
                array[curr]--;
                direction=-direction;
                curr+=direction;
            }
        }
        for(int x:array)
        {
            if(x!=0)
            {
                return false;
            }
        }
        return true;
    }
    public static int coundValidSelction(int[]array)
    {
        int validCount=0;
   
        for(int i=0;i<array.length;i++)
        {
            if(array[i]>0)
            {
                if(isSimulate(array,i,1))
                {
                    validCount++;
                }
                if(isSimulate(array,i,-1))
                {
                    validCount++;
                }
            }
        }
        return validCount;

    }

    public static void main(String[] args) {
        int[]array={2,3,4,0,4,1,0};
       int answer=coundValidSelction(array);
       System.out.println(answer);
        
    }
    
}
