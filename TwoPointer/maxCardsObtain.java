package TwoPointer;

public class maxCardsObtain {
    public static int maximumCardsObtainSum(int[]nums,int k)
    {
        int l=0;
        int r= nums.length-1;
        int lsum=0,rSum=0;
        for(l=0;l<k;l+=1)
        {
            lsum+=nums[l];
        }
        int maxSum=lsum;
        while(r>k)
        {
            lsum=lsum-nums[l-1];
            rSum+=nums[r];
            maxSum=Math.max(maxSum,(lsum+rSum));
            l--;
            r--;
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[]nums ={6,2,3,4,7,2,1,7,1};
        int k =4;
        System.out.println(maximumCardsObtainSum(nums,k));
    }
    
}
