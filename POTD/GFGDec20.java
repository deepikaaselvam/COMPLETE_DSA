package POTD;
import java.util.ArrayList;
public class GFGDec20 {
    public static ArrayList<Integer> spiralMatrix(int[][]array)
    {
        int left=0,right=array.length-1;
        int top=0,bottom =array.length-1;
        ArrayList<Integer>list = new ArrayList<>();
        while(left<=right && top<=bottom)
        {
         for(int i=left;i<=right;i++)
        {
            list.add(array[top][i]);
        }
        top++;
        for(int i=top;i<=bottom;i++)
        {
            list.add(array[i][right]);
        }
        right--;
        if(top<=bottom)
        {
            for(int i=right;i>=left;i--)
            {
                list.add(array[bottom][i]);
        }
            bottom--;
        }
        if(left<=right)
        {
            for(int i=bottom;i>=top;i--)
            {
                list.add(array[i][left]);
            }
            left++;
        }

       
    }
    return list;
    }
    public static void main(String[] args) {
        int[][]array={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        ArrayList<Integer>ans=spiralMatrix(array);
        for(int i=0;i<ans.size();i++)
        {
            System.out.print(ans.get(i)+" ");
        }
    }
    
}
