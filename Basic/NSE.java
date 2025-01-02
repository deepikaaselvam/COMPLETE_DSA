package Basic;
import java.util.Stack;
public class NSE {
    public static int[] nextSmallerElement(int[]array)
    {
        int nse[]=new int[array.length];
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<array.length;i++)
        {
            while(!st.isEmpty() && array[st.peek()]>=array[i])
            {
                st.pop();
            }
            nse[i]=st.isEmpty()?-1:st.peek();
            st.push(i);
        }
        return nse;
    }
    public static void main(String[] args) {
        int[]array={1,4,6,7,3,7,8,1};
        int []NSE=nextSmallerElement(array);
        for(int i=0;i<NSE.length;i++)
        {
            System.out.print(NSE[i]+" ");
        }
    }
    
}
