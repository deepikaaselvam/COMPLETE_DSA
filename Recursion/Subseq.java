package Recursion;
import java.util.ArrayList;
public class Subseq {
    public static void subsequences(int i,int[]array,ArrayList<Integer>list)
    {
        if(i==array.length)//i>=array.length
        {
            System.out.println(list);
            return;
        }
        list.add(array[i]);//take or pick the element
        subsequences(i+1, array, list);
        list.remove(list.size()-1);//not take the element
        subsequences(i+1,array,list);
    }
    public static void main(String[] args) {
        int[]array={3,1,2};
        ArrayList<Integer>list=new ArrayList<>();
        subsequences(0,array,list);

    }
    
}
