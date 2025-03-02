package TwoPointer;

public class Longest_Subarray_Brute {
    public static int longestSubarraywithSumK(int[]nums,int k)
    {
        int maxLen=0;
        int left =0;
        int sum=0;
        int right =0;
        int Length =nums.length;
        while(right<Length)
        {
            
                sum+=nums[right];
            while(sum>k)
            {
                sum-=nums[left];
                left++;
              
            }
            if(sum<=k){
                maxLen=Math.max(maxLen,right-left+1);
            }
            
           
            right++;
        }
        
        return maxLen;
    }
    public static void main(String[] args) {
        int[]nums={2,5,1,7,10};
        int k=14;
        System.out.println(longestSubarraywithSumK(nums,k));
    }
    
}


/*      int Length = nums.length;
        for(int index1 =0;index1<Length-1;index1+=1)
        {
            int sum=0;
            for(int jIndex =index1;jIndex<Length;jIndex+=1)
            {
                sum+=nums[jIndex];
                if(sum>k)
                break;
                else maxLen =Math.max(maxLen,jIndex-index1+1);
            }
        }
*/


/*         BETTER APPORACH
 *  int maxLen=0;
        int left =0;
        int sum=0;
        int right =0;
        int Length =nums.length;
        while(right<Length)
        {
            
                sum+=nums[right];
            while(sum>k)
            {
                sum-=nums[left];
                left++;
              
            }
            if(sum<=k){
                maxLen=Math.max(maxLen,right-left+1);
            }
            
           
            right++;
        }
        
        return maxLen;
 */