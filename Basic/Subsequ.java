package Basic;
import java.util.ArrayList;
public class Subsequ {
    public static void subSequences(int i,int[]array,ArrayList<Integer>list,int sum)
    {
        int k=3;
        if(i==array.length-1)
        {
            if(sum==k)
            {
                System.out.println(list);
                return;
            }
           
        }
        list.add(array[i]);
        sum+=array[i];
        subSequences(i+1, array, list,sum);
        sum-=array[i];
        list.remove(list.size()-1);
        subSequences(i+1, array, list,sum);

    }
    public static void main(String[] args) {
        int[]array={3,1,2};
        int sum=0;
        ArrayList<Integer>list=new ArrayList<>();
        subSequences(0,array,list,sum);
        
    }
    
}
