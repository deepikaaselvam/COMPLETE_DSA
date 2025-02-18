import java.util.Arrays;
import java.util.Comparator;
/*
     * Using Insertion Sort to Sort the Array based on their Length
     *   for(int i=1;i<lengthSorting.length;i++)
         {
             String ithString = lengthSorting[i];
             int j = i-1;
             while(j>=0 && ithString.length()<lengthSorting[j].length())
             {
                 lengthSorting[j+1] = lengthSorting[j];
                 j--;
             }
             lengthSorting[j+1] = ithString;
         }
     */
public class SortLenStr {
    public static String[] sortLengthArray(String[]lengthSorting)
    {
        Arrays.sort(lengthSorting,Comparator.comparing(String::length));
        return lengthSorting;
}
    public static void main(String[] args) {
        String[]lengthSort = {"GeeksforGeeks","I","for","am"};
        String result[]=sortLengthArray(lengthSort);
        for(String answer:result)
        {
            System.out.print(answer+" ");
        }
    }
    
    
}
