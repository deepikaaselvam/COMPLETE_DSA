package Recursion;
import java.util.ArrayList;
public class MiniSubArray {
    public static int  minimumSubArray(int i,int[]array,ArrayList<Integer>list,int answer)
    {
        if(i==array.length)
        {
            if(list.isEmpty())
            {
                return 0;
            }
            int minimum=Integer.MAX_VALUE;
            for(int j:list){
                if(j<minimum)
                {
                    minimum=j;
                }
            }
            
            return minimum;
        }list.add(array[i]);
        int include=minimumSubArray(i+1, array, list,answer);
        list.remove(list.size()-1);
        int exclude=minimumSubArray(i+1, array, list,answer);
        return include+exclude;
    }
    public static void main(String[] args) {
        int[]array={3,1,2,4};
        int answer=0;
        ArrayList<Integer>list=new ArrayList<>();
        int ans=minimumSubArray(0,array,list,answer);
        System.out.println(ans);
    }
    
}
