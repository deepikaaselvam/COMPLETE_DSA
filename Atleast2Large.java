import java.util.ArrayList;
public class Atleast2Large {
    public static ArrayList<Integer> removeTwoLarge(int[]arr)
    {
        int largest=0,second_largest= 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>largest)
            {
                second_largest=largest;
                largest=arr[i];
            }
            else if(arr[i]<largest && arr[i]>second_largest)
            {
                second_largest=arr[i];
            }
        }
        ArrayList<Integer>res= new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=largest && arr[i]!=second_largest)
            {
                res.add(arr[i]);
            }
        }
        return res;

    }
    
    public static void main(String[] args) {
        int[]array={2,8,7,1,5};
        ArrayList<Integer> result=removeTwoLarge(array);
        for(int i=0;i<result.size();i++)
        {
            System.out.print(result.get(i)+" ");
        }
    }
    
}
