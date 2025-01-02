package Basic;
import java.util.ArrayList;
public class SubSeq {
    public static void subsequencesOfTheArray(int i,int[]array,ArrayList<Integer>list)
    {
        if(i==array.length)
        {
            System.out.println(list);
            return;
        }
        list.add(array[i]);
        subsequencesOfTheArray(i+1,array,list);
        list.remove(list.size()-1);
        subsequencesOfTheArray(i+1, array, list);
    }
    public static void main(String[] args) {
        int[]array={3,1,2};
        ArrayList<Integer>list=new ArrayList<>();
        subsequencesOfTheArray(0,array,list);
    }
    
}
