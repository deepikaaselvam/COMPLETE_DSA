package Recursion;
import java.util.ArrayList;
public class Subsequ {
    public static void subSequences(int i,int[]array,ArrayList<Integer>list)
    {
        if(i==array.length)
        {
            System.out.print(list+" ");
            return;
        }
        list.add(array[i]);
        subSequences(i+1,array,list);
        list.remove(list.size()-1);
        subSequences(i+1,array,list);
      
    }
    public static void main(String[] args) {
        int[]array={1,2,3,4,5,6};
        ArrayList<Integer>list=new ArrayList<Integer>();
        subSequences(0,array,list);
    }
    
}
