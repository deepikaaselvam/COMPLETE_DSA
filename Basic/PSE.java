package Basic;
import java.util.Stack;
public class PSE{
    public static void previousSmallerElement(int[]array){
        Stack<Integer>st=new Stack<>();
        int[]PSE=new int[array.length];
        for(int i=0;i<array.length;i++)
        {
            while(!st.isEmpty() && st.peek()>array[i])
            {
                st.pop();
            }
            if(!st.isEmpty() && st.peek()<=array[i])
            {
                PSE[i]=st.peek();
                System.out.print(PSE[i]+" ");
                st.push(array[i]);
            }
            else{
                PSE[i]=-1;
                System.out.print(PSE[i]+" ");
                st.push(array[i]);

            }
        }
    }
    public static void main(String[] args) {
    int[]array={5,7,9,6,7,4,5,1,3,4};
    previousSmallerElement(array);

    }
}