package Stack;
import java.util.Stack;
public class EqlStk {
    public static int  equalStack(Stack<Integer>st1,Stack<Integer>st2,Stack<Integer>st3)
    {
        int[]array1={1,1,1,2,3};
        int[]array2={2,3,4};
        int[]array3={1,4,1,1};
        int equalStk=0;
        int sum1=0,sum2=0,sum3=0;
        for(int i=0;i<array1.length;i++)
        {
            sum1+=array1[i];
            st1.push(sum1);
        }
        // System.out.println(st1.peek());
        for(int i=0;i<array2.length;i++)
        {
            sum2+=array2[i];
            st2.push(sum2);
        }
        // System.out.println(st2.peek());
        for(int i=0;i<array3.length;i++)
        {
            sum3+=array3[i];
            st3.push(sum3);
        }
        // System.out.println(st1.peek());
        while(!st1.isEmpty() && !st2.isEmpty() &&!st3.isEmpty())
        {
            int stHeight1 = st1.peek();
            int stHeight2 = st2.peek();
            int stHeight3 = st3.peek();
            if(st1.peek()>st2.peek() && st1.peek()>st3.peek())
            {
                st1.pop();
            }
            else if(st2.peek()>st3.peek() && st2.peek()>st1.peek())
            {
                st2.pop();
            }
            else if(st3.peek()>st2.peek() && st3.peek()>st1.peek())
            {
                st3.pop();
            }
            else
            {
               equalStk=st1.peek();
                break;
            }
        }
        return equalStk;

    }
    public static void main(String[] args) {
        Stack<Integer>st1 =new Stack<>();
        Stack<Integer>st2 =new Stack<>();
        Stack<Integer>st3 =new Stack<>();
        System.out.println(equalStack(st1,st2,st3));


        
    }
    
}
