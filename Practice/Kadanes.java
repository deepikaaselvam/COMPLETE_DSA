package Practice;


public class Kadanes {
    public static int maxSubarray(int[]nums)
    {
        int maxSum=Integer.MIN_VALUE;
        int l=0,r=0;
        if(nums.length==1)
        {
            int ans=nums[0];
            return ans;
        }
        while(r<nums.length)
        {
           
            if(maxSum<0)
            {
                maxSum=Math.max(nums[l],maxSum);
                l++;
            }
            else{
                maxSum+=nums[r];
                maxSum=Math.max(maxSum,nums[r]);
            }
            r++;

        }
      
       
        return maxSum;
    }
    public static void main(String[] args) {
        int[]array={-1,0,-2};//{-2,-1};//{5,4,-1,7,8};//{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubarray(array));;
    }
    
}
