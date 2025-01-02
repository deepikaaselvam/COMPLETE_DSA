package Recursion;
import java.util.ArrayList;
import java.util.Arrays;
public class CombSum1 {
    public static void combinationSumI(int i,int[]array,ArrayList<Integer>qn,int target,ArrayList<Integer>list)
    {
        if(i==array.length)
        {
            if(target==0)
            {
                System.out.println(list);
                return;
            }
        }
        if(array[i]<=target)
        {
            list.add(array[i]);
            combinationSumI(i,array,qn,target-array[i],list);
            list.remove(array[i]);
        }
        combinationSumI(i+1,array,qn,target,list);
    }
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        ArrayList<Integer>qn=new ArrayList<>(Arrays.asList(3,2,6,7));
        int[]array={3,2,6,7};
        int target=7;
        combinationSumI(0,array,qn,target,list);
    }
    
}
