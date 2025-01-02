package Basic;
import java.util.Stack;
public class NGEle {
    public static void NextGreaterElement(int[]array)
    {
        Stack<Integer>st=new Stack<>();
        int[]answer=new int[array.length];
        for(int i=array.length-1;i>=0;i--)
        {
            while(!st.isEmpty()&&st.peek()<=array[i]) /*TC=>O(2N)  - It is not running for 'N'..(i.e) While Loop ->Every Time */
            {
                st.pop();
            }
            if(st.isEmpty() )
            {
                answer[i]=-1;
                System.out.print(answer[i]+" ");
                st.push(array[i]);
            }
            else 
            {
                answer[i]=st.peek();
                System.out.print(answer[i]+" ");
                st.push(array[i]);
            }
        }
    }
    public static void main(String[] args) {
        int[]array={4,12,5,3,1,2,5,3,1,2,4,6};
        NextGreaterElement(array);

    }
    
}
