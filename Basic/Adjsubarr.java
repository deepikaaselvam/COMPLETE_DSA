package Basic;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
public class Adjsubarr {
    
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        if (nums.size() < 2 * k) {
            return false;
        }
       for(int i=0;i<nums.size()-2*k;i++)
           {
               if(strictlyIncreasing(nums,i,i+k) && strictlyIncreasing(nums,i+k,i+k*2)){
                   return true;
               }
           }
        return false;
    }
        public static boolean strictlyIncreasing(List<Integer>nums,int start,int end)
            {
            for(int i=start;i<end;i++)
                {
                    if(nums.get(i)>=nums.get(i+1))
                    {
                        return false;
                    }
                }
            return true;
            }
            public static void main(String[] args) {
                ArrayList<Integer>nums=new ArrayList<>(Arrays.asList(1,2,3,4,4,4,4,5,6,7));
                int k=3;
                Adjsubarr obj=new Adjsubarr();

                System.out.println(obj.hasIncreasingSubarrays(nums,k));
            }
        
    }

    

