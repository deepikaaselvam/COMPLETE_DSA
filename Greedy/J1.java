package Greedy;

public class J1 {
    public static boolean isJumG(int[]nums)
    {
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i+1]>nums[i])
            {

            }
            else{
                // int number=nums[i];
                if(nums[i+1]==0)
                {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] nums={3,2,1,0,4};
        System.out.println(isJumG(nums));
        
    }
    
}
