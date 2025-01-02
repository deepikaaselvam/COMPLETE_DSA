package TwoPointer;
import java.util.ArrayList;
public class SubarrSum {
/*     public static boolean subArraySum(int[]array,int target)
    {
        int left=0,right=0;
        int sum=0;
        while(right<array.length&&left<=right)
        {
            sum+=array[right];
            right++;
            if(sum%target==0)
            {
                return true;
            }
            else{
                if(sum%target!=0 && left<=right)
                {
                    sum-=array[left];
                    sum+=array[right];
                    left++;
                    right++;
                }
            }
            
            
        }
        return false;
    }   */
   public static boolean checksubArraySum(int[]array,int target,ArrayList<Integer>list)
   {
    int l=array.length-1,r=0;int sum=0;
    while(r<array.length)
    {
        list.add(array[r]);
        sum+=array[r];
        r++;
    }
    while(l>=0)
    {
    if(sum%target==0&&list.size()>=2)
    {
        return true;
    }
    else{
        sum=sum-array[l];
        l--;
    }
}
    return false;
   }
    public static void main(String[] args) {
        int[]array={5,0,0,0};
        int target=3;
        ArrayList<Integer>list=new ArrayList<>();
        System.out.println(checksubArraySum(array,target,list));;
    }
    
}
