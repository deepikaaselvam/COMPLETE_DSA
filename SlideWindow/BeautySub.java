package SlideWindow;
import java.util.TreeMap;
public class BeautySub {
    private static int getMinimum(TreeMap<Integer,Integer>mp,int x)
    {
        int smallest =0;
        for(Integer value :mp.keySet())
        {
            if(value <0)
            {
                smallest += mp.get(value);
            }
            else{
                return 0;
            }
            if(smallest >= x)
            {
                return value;
            }
        }
       return 0;
    }
    public static int[]SlidingBeautySubarray(int[]array,int x , int k)
    {

        TreeMap<Integer,Integer> mp = new TreeMap<>();
        int[]answer = new int[array.length-k+1];
        for(int i=0;i<k;i++)
        {
            mp.put(array[i],mp.getOrDefault(array[i],0)+1);
        }
        answer[0] = getMinimum(mp,x);
        for(int i= k;i<array.length;i++)
        {
            mp.put(array[i],mp.getOrDefault(array[i],0)+1);
            mp.put(array[i-k],mp.getOrDefault(array[i-k],0)-1);
            if(mp.get(array[i-k])==0)
            {
                mp.remove(array[i-k]);
            }
            answer[i-k+1]=getMinimum(mp,k);
        }
        return answer;
}
    public static void main(String[] args) {
        int[] nums ={1,-1,-3,-2,-3};
        int k=3;
        int x=2;
        int[]answerArray = SlidingBeautySubarray(nums,x,k);
        for(int i=0 ;i<answerArray.length;i++)
        {
            System.out.print(answerArray[i]+" ");
        }
        
    }
    
}
