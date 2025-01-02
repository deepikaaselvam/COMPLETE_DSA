package Basic;
import java.util.ArrayList;
import java.util.Collections;;
public class minSubarr {
    static int sum=0;
    public static void subSequences(int i,int[]array,ArrayList<Integer>list)
    {
       
        if(i>=array.length)
        {
            if(!list.isEmpty())
            {
                int minimum=Collections.min(list);
                sum+=minimum;
            }
            return ;
        }
        list.add(array[i]);
        subSequences(i+1, array, list);
        list.remove(list.size()-1);
        subSequences(i+1, array, list);
       
        
    }
    public static void main(String[] args) {
      int[]array={3,1,2,4};
      ArrayList<Integer>list=new ArrayList<>();
      subSequences(0,array,list);
      System.out.println(sum);
      

    }
    
}
