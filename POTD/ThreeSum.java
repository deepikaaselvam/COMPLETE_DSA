package POTD;
import java.util.ArrayList;
public class ThreeSum {
    public static ArrayList<Integer> ThreeSumGoogleInterview(int[]nums)
    {
        ArrayList<Integer>result= new ArrayList<>();
        int j=1,k=2;
        for(int i=0;i<=nums.length-3;i++)
        {
            if(i!=j && j!=k && k!=i)
            {
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==0)
                {
                    result.add(nums[i]);
                    result.add(nums[j]);
                    result.add(nums[k]);
                    j++;k++;
                }
                else{
                    if(k==nums.length-1)
                    {
                        return result;
                    }
                }
            }

        }

        return result;

    }
    public static void main(String[] args) {
        int[]nums={0,0,0};//{-1,0,1,2,-1,-4};//{0,1,1};
        ArrayList<Integer>ans=ThreeSumGoogleInterview(nums);
        System.out.println(ans);
    }
    
    
}
