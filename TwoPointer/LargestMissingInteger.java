package TwoPointer;
import java.util.Arrays;
import java.util.HashMap;
public class LargestMissingInteger {
    public static int missingLargestInteger(int[]nums,int k)
    {
        if(nums.length-k==0)
        {
            Arrays.sort(nums);
            return nums[nums.length-1];
        }
        HashMap<Integer,Integer>mpp = new HashMap<>();
        int Length =nums.length;
        for(int index1 =0;index1<=Length-k;index1+=1)
        {
            for(int index2=index1;index2<(index1+k);index2+=1)
            {
                mpp.put(nums[index2],mpp.getOrDefault(nums[index2],0)+1);
          }
        }
        int largest=-1;
        for (HashMap.Entry<Integer, Integer> entry : mpp.entrySet()) {
            if (entry.getValue() == 1) {
                largest = Math.max(largest, entry.getKey());
            }
        }
       return largest;
    }
    public static void main(String[] args) 
    {
        int[]nums={3,9,7,2,1,7};//{3,9,2,1,7};
        int k=4;//4->3//3;->7
        System.out.println(missingLargestInteger(nums,k));
    }
    
}




















// for (HashMap.Entry<Integer, Integer> entry : mpp.entrySet()) {
        //     System.out.print(entry.getKey() + " "+entry.getValue());
        //     System.out.println();
        // }