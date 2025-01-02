package TwoPointer;

public class maxOnes {
    public static int maximumOnes(int[]array)
    {
        int maximum =Integer.MIN_VALUE;int cnt =0;
        for(int i=0;i<array.length;i++)
        {
            
            if(array[i]==0)
            {
               cnt=0;
            
            }
            else{
                cnt++;
                maximum=Math.max(maximum,cnt);
            }

        }
        
       return  maximum;
    }
    public static void main(String[] args) {
        int[]array={0,1,1,1,0,0,1,1,0,0,1,1,1,1};
        System.out.println(maximumOnes(array));
    }
    
}
