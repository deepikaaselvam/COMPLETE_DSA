package POTD;
public class CircleSArr {
    public static int maxSubarraySumCircular(int[] nums) {
       
        int sum=0;
        int n=nums.length;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<=(nums.length);i++)
        {
            if(i<n)
            {
                sum+=nums[i];
                maxi=Math.max(maxi,sum);
                if(sum<0)
                {
                    sum=0;
                }

            }
            if(i>=n)
            {
                sum+=nums[(i)%n];
                maxi=Math.max(maxi,sum);
                if(sum<0)
                {
                    sum=0;
                }

            }
        }
        return maxi;
        
    }

    public static void main(String[] args) {
        int[]nums={5,-3,5};
        int ans=maxSubarraySumCircular(nums);
        System.out.println(ans);
        
    }
    
}
