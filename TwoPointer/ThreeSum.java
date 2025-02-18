package TwoPointer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
       /*  List<List<Integer>> result = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                for(int k=j+1;k<nums.length;k++)
                {
                    if (nums[i] + nums[j] + nums[k] == 0) 
                    {
                       List<Integer>triplet= (Arrays.asList(nums[i], nums[j], nums[k]));
                       Collections.sort(triplet);
                       if(!result.contains(triplet))
                       {
                         result.add(triplet);
                       }
                     }
                }
            }
        }*/
        List<List<Integer>> result = new ArrayList<>();
       
        for(int i=0;i<nums.length;i++)
        {
            HashSet<Integer>set = new HashSet<>();
            for(int j=i+1;j<nums.length;j++)
            {
                int Thirdelement = -(nums[i]+nums[j]);
                if(set.contains(Thirdelement))
                    {
                        List<Integer>triplet = Arrays.asList(nums[i],nums[j],Thirdelement);
                        Collections.sort(triplet);
                        if(!result.contains(triplet))
                        {
                            result.add((triplet));
                        }

                        
                    }
                
                set.add(nums[j]);

            }

        }
        return result;
    }
    public static void main(String[] args) {
        int[]array={-1,0,1,2,-1,-4};
        List<List<Integer>> ans = threeSum(array);
        for (List<Integer> triplet : ans) {
            System.out.println(triplet);
        }
    }
       
}
