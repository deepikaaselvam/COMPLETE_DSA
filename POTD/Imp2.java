package POTD;
import java.util.HashSet;
public class Imp2 {
    public static int longestDistinctArray(int[]nums,int k)
    {   int sum=0;
        int l=0,r=0;
        HashSet<Integer>set = new HashSet<>();
        int maximum=Integer.MIN_VALUE;
        while(r<nums.length)
        {
            while(set.contains(nums[r]))
            {
                sum-=nums[l];
                set.remove(nums[l]);
                l++;
            }
            set.add(nums[r]);
            sum+=nums[r];
            if(r-l+1==k)
            {
                maximum=Math.max(sum,maximum);
                sum-=nums[l];
                set.remove(nums[l]);
                l++;
            }
            r++;
        }
       return maximum == Integer.MIN_VALUE? 0 :maximum;

    }
    public static void main(String[] args) {
        int[]array={1,5,4,2,9,9,9};//{4,4,4};//
        int k=3;
        System.out.println(longestDistinctArray(array,k));
    }
    
}
