package Contest;
import java.util.Arrays;
public class ArrUni {
    public static int makeAnswerArray(int[]array)
    {
        Arrays.sort(array);
        int increments=0;
        for(int i=1;i<array.length;i++)
        {
            if(array[i]<=array[i-1])
            {
                int incrementedLength=array[i-1]-array[i]+1;
                array[i]+=incrementedLength;
                increments++;
            }
        }
        return increments;
      
    }
    public static void main(String[] args) {
        int[]array={1,2,2,2,2};
        int answerArray=makeAnswerArray(array);
        System.out.print(answerArray+" ");
        
    }
    
}
