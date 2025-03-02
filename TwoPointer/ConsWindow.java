package TwoPointer;


public class ConsWindow {
    public static int constantWindow(int[]nums,int k)
    {
        int maxSum=Integer.MIN_VALUE;
        int left =0;
        int right =k-1;
        int sum =0;
        for(left = 0;left<=right;left+=1)
        {
            sum+=nums[left];
        }
        maxSum = Math.max(maxSum,sum);
        int length=nums.length;
        left=0;
        while(right<length-1)
        {
            sum-=nums[left];
            left +=1;
            right +=1;
            sum+=nums[right];
            maxSum = Math.max(maxSum,sum);
        }
       
        return maxSum; 

    }
    public static void main(String[] args) {
        int[]nums={-1,2,3,3,4,5,-1};
        int k=4;
        System.out.println(constantWindow(nums,k));
    }
    
}
/*             NESTED LOOP

        int maxSum=Integer.MIN_VALUE;
        for(int ind1=0;ind1<=(nums.length-k);ind1+=1)
        {
            int sum=0;
            for(int ind2=ind1;ind2<(ind1+k);ind2+=1)
            {
                sum+=nums[ind2];
            }
            maxSum=Math.max(sum,maxSum);
        } */ 