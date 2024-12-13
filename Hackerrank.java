import java.util.ArrayList;
import java.util.Arrays;

public class Hackerrank {

    public static int diagonalDifference(ArrayList<ArrayList<Integer>> arr) {
        int LeftDiagonal=0,rightDiagonal=0;
        int ans=0;
        int n=arr.size();
        for(int i=0;i<arr.size();i++)
        {
           LeftDiagonal+=arr.get(i).get(i); 
            rightDiagonal+=arr.get(i).get(n-i-1);
                
        }
        
        ans=LeftDiagonal-rightDiagonal;
        return Math.abs(ans);
        }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix=new ArrayList<>();
       matrix.add(new ArrayList<>(Arrays.asList(1, 2, 7)));
        matrix.add(new ArrayList<>(Arrays.asList(4, 5, 6)));
        matrix.add(new ArrayList<>(Arrays.asList(7, 8, 9)));
        System.out.println(diagonalDifference(matrix));
    }
    
}
