package Recursion;

import java.util.ArrayList;
public class CmbSum {
    public static void combinationSumI(int i,int[]array,int target,ArrayList<Integer>list,
                                            ArrayList<ArrayList<Integer>>answer)
    {
        if(i==array.length)
        {
            if(target==0)
            {
                answer.add(new ArrayList<>(list));
             
                
            }
            return;
        }
        if(array[i]<=target)
        {
      
            list.add(array[i]);
            combinationSumI(i,array,target-array[i],list,answer);
            list.remove(list.size()-1);
           

        }
        combinationSumI(i+1,array,target,list,answer);
        
    }
    public static void main(String[] args) {
        int[]array={2,3,6,7};
        ArrayList<ArrayList<Integer>>BigAnswer=new ArrayList<>();
        ArrayList<Integer>list=new ArrayList<>();
        int target=7;
        combinationSumI(0,array,target,list,BigAnswer);
        System.out.println("Combinations of al the combination sum are :"+BigAnswer);
    }
    
}
