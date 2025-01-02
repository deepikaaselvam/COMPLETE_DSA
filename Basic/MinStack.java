package Basic;
import java.util.Stack;
public class MinStack {
    public static void main(String[] args) {
        Stack<Integer> st1 = new Stack<>();
        st1.push(10);
        st1.push(12);
        st1.push(15);
        int getMinimum=Integer.MAX_VALUE;
        for(int i=0;i<st1.size();i++)
        {
            if(st1.peek()<getMinimum)
            {
                getMinimum=st1.peek();
                st1.pop();
            }
        }
        System.out.println(getMinimum);
      
    }
    
}
