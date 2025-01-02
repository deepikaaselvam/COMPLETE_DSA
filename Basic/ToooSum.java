package Basic;
import java.util.HashMap;
public class ToooSum {
    public static int[] twoSum(int[]array,int target)
    {
        HashMap<Integer,Integer>mpp=new HashMap<>();
      
        for(int i=0;i<array.length;i++)
        {
            int anotherNumber=target-array[i];
            if(mpp.containsKey(anotherNumber))
            {
                return new int[]{mpp.get(anotherNumber),i};
            }
            mpp.put(array[i],i);
            
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[]array={2,6,5,8,11};
        int target=14;
        int result[]=twoSum(array,target);
        System.out.println(result[0]+" "+result[1]);
       
       
    }
}
