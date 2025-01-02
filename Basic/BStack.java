package Basic;
import java.util.Stack;
public class BStack {
    public static void sumofStack(int []array)
    {
        Stack<Integer>st=new Stack<>();
        int sum=0;
        for(int i=0;i<array.length;i++)
        {
            sum+=array[i];
            st.push(sum);
        }
        System.out.println(st.peek());
    }
    public static void main(String[] args) {
       
        int[]array={1,1,3,2,1};
        sumofStack(array);

        
    }
    
}