package TwoPointer;

public class maxSubarray {
    public static int maximumSubarraySum(int[]array)
    {
        int sum=array[0];int Maximum=sum;
        for(int i=1;i<array.length;i++)
        {
            if(array[i-1]<array[i])
            {
                sum+=array[i];
                Maximum=Math.max(Maximum,sum);
            }
            else{
                sum=0;
                sum+=array[i];
                Maximum=Math.max(Maximum,sum);
            }
        }
        return Maximum;
    }
    public static void main(String[] args) {
        int[]array={12,17,15,13,10,11,12};
        System.out.println(maximumSubarraySum(array));
    }
    
}
