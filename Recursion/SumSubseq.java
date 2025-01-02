package Recursion;
import java.util.ArrayList;
public class SumSubseq {
    public static void printSumSubsequences(int i,ArrayList<Integer>list,int[]array,int sum,int target)
    {
        
        if(i==array.length)
        {
            if(sum==target)
            {
                System.out.println(list);
               
            }
            return;
        }
        sum+=array[i];
        list.add(array[i]);
        printSumSubsequences(i+1, list, array, sum, target);
        sum=sum-array[i];
        list.remove(list.size()-1);
        printSumSubsequences(i+1, list, array, sum, target);
    }
    public static void main(String[] args) {
         int[]array={3};
        ArrayList<Integer>list=new ArrayList<>();
        int sum=0;int target=2;
        printSumSubsequences(0,list,array,sum,target);
    }
}