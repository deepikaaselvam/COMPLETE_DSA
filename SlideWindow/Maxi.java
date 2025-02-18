package SlideWindow;
import java.util.HashMap;
public class Maxi {
    public static int[] max(int[]nums,int kk)
    {
      int[]answer=new int[nums.length - kk + 1];
      int l =0,r = 0;
      int maximum =Integer.MIN_VALUE;
      HashMap<Integer,Integer>mpp = new HashMap<>();
      for(int i=0;i<nums.length;i++)
      {
            mpp.put(i,nums[i]);
      }
      while(r<nums.length-kk)
      {
        maximum=Math.max(maximum,mpp.get(nums[r]));
        if(r-l+1 > kk)
        {
            mpp.remove(l,nums[l]);
            l++;
            maximum=Math.max(maximum,mpp.get(nums[r]));
        }
        if(r-l+1 == kk)
        {
            answer[l]=maximum;
            
        }
        r++;
        
      }
      return answer;
    }
    public static void main(String[] args) {
        int[]nums={1,3,-1,-3,5,3,6,7};
        int k=3;
        int[]answer=max(nums,k);
        for(int i=0;i<answer.length;i++)
        {
            System.out.print(answer[i]+" ");
        }
    }
    
    
}
