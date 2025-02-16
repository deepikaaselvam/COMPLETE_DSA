package POTD;
import java.util.HashMap;     //PROBLEM NO : 2342
public class max_sum_with_digit_sum {
    public static int getDigitSum(int value)
    {
        int sum=0;
        while(value>0)
        {
            sum+=value%10;
            value=value/10;
        }
        return sum;
    }
    public static int maximumSum(int[]nums)
    {
        HashMap<Integer,Integer>mpp= new HashMap<>();
        int maximum=-1;
        for(int i=0;i<nums.length;i++)
        {
            int digitSum=getDigitSum(nums[i]);
             if(mpp.containsKey(digitSum))
            {
                maximum=Math.max(maximum,mpp.get(digitSum)+nums[i]);
                if(mpp.get(digitSum)<nums[i])
                {
                    mpp.put(digitSum,nums[i]);
            
                }
            }
            else{
                mpp.put(digitSum,nums[i]);
            }
        }
 
        
        return maximum;

    }
    public static void main(String[] args) {
        int[]array={ 10,12,19,14 };//{52,14,34,50,41,61};=>113
        System.out.println(maximumSum(array));
    }
    
}
