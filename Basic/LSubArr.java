package Basic;

public class LSubArr {
    public static void longestSubArray(int[]array)
    {
        int l=0,r=0;
        int k=14;int sum=0;int maxLength=Integer.MIN_VALUE;
        while(r<array.length){
            sum=sum+array[r];
            if(sum>k)
            {
                sum=sum-array[l];
                l++;
            }
            if(sum<=k)
            {
                maxLength=Math.max(maxLength,r-l+1);
            }
            r++;
        }
        System.out.println(maxLength+" ");
    }
    public static void main(String[] args) {
        int[]array={2,5,1,7,10};
        longestSubArray(array);
        
    }
    
}
