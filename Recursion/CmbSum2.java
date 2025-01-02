package Recursion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class CmbSum2 {
    public static void combinationalSumII(int i,int[]array,ArrayList<Integer>list,List<List<Integer>>answer,int target)
    {
        
            if(target==0)
            {
                answer.add(new ArrayList<>(list));
                return;
            }
        
        for(int j=i;j<array.length;j++)
        {
            if(j>i && array[j]==array[j-1])
            {
                continue;
            }
            if(array[i]>target)break;
        
       
      
        list.add(array[j]);
        target=target-array[j];
        combinationalSumII(j+1,array,list,answer,target);
        list.remove(list.size()-1);
        
    }
        // combinationalSumII(i+1,array,list,answer,target);


    }
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        List<List<Integer>>ans=new ArrayList<>();
        int[]array={2,5,2,1,2};
        int target=5;
        Arrays.sort(array);
        combinationalSumII(0,array,list,ans,target);
        System.out.println("Combinational Sum of the Recursion Tree are :"+ans);
    }
    
}
