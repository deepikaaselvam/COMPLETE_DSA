package Practice;

public class LConsSeq {
    public static int longestConsecutiveSequence(int[]nums)
    {
        int longest=Integer.MIN_VALUE;
        java.util.Arrays.sort(nums);int cnt=1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==nums[i-1])
            {
              
            }
           
            else if(nums[i]==nums[i-1]+1)
            {
                cnt++;
            }
            else{
                
                
                cnt=1;
            }
            longest=Math.max(cnt,longest);
            
           
        }
        return longest;
    }
    public static void main(String[] args) {
        int[]array={100,102,100,101,101,4,3,2,3,2,1,1,1,2};
        System.out.println(longestConsecutiveSequence(array));;
    }
    
}
