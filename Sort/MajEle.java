package Sort;
import java.util.HashMap;
public class MajEle {
    public static void elements(int[]nums)
    {
      
        HashMap<Integer,Integer>mpp = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(mpp.containsKey(nums[i]))
            {
                mpp.put(nums[i],mpp.getOrDefault(nums[i],1)+1);
            }
            else{
                mpp.put(nums[i],1);
            }
        }
        System.out.println(mpp);
        
     

    }
    public static void main(String[] args) {
        int[]array={2,2,2,1,1,3,3,2,2,2};
        // System.out.println(Arrays.toString(array));
        elements(array);
    }
}
