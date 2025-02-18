package POTD;

public class array_sorted {
    public static boolean isArraySorted(int[]nums)
    {
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]>nums[i+1])
            {
                return false;
            }
        }
        return true;


    }
    public static void main(String[] args) {
        int[]nums={1,2,2,3,3,3,4,1,4,5,6};
        System.out.println(isArraySorted(nums));
    }
    
}
