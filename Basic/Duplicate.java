package Basic;
import java.util.HashMap;
public class Duplicate {
   
    public static  boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer>mpp=new HashMap<>();
        int cnt=0;
        for(int i=0;i<nums.length;i++)
        {
            if(mpp.containsKey(nums[i]))
            {
                return true;
            }
            else{
            mpp.put(nums[i],mpp.getOrDefault(cnt,0)+1);
            }
        }
       
        
       
        return false;
       
    }
    public static void main(String[] args) {
        int[]array={1,1,1,3,4,3,4,5,6};
        boolean ans=containsDuplicate(array);
        System.out.println(ans);
 
    }
}
    

