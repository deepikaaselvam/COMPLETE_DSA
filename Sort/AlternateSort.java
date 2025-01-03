package Sort;
import java.util.ArrayList;
import java.util.Arrays;
public class AlternateSort {
    public static ArrayList<Integer>alternateSortoftheArray(int[]array)
    {
        Arrays.sort(array);
        ArrayList<Integer>result = new ArrayList<>();
        int l=0,r=array.length-1;
        while(l<=r)
        {
            if(l==r)
            {
                result.add(array[l]);
                break;
            }
            result.add(array[r]);
            result.add(array[l]);
            r--;
            l++;
        }
        return result;

    }
    public static void main(String[] args) {
        int[]array={7,8,1,2,3,4,5,5};
        ArrayList<Integer>ans = alternateSortoftheArray(array);
        for(int i=0;i<ans.size();i++)
        {
            System.out.print(ans.get(i)+" ");
        }
    }
    
}
