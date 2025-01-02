package Basic;
import java.util.Stack;
public class EqalStack {
    EqalStack(int[]h1,int[]h2,int[]h3)
    {
        Stack<Integer>st1=new Stack<>();
        Stack<Integer>st2=new Stack<>();
        Stack<Integer>st3=new Stack<>();
        fillStacks(st1,h1,st2,h2,st3,h3);
        int maximumHeights=0;
        while(!st1.isEmpty() && !st2.isEmpty() && !st3.isEmpty())
        {
            int value1=st1.peek();
            int value2=st2.peek();
            int value3=st3.peek();
            if(value1==value2 && value2==value3 && value3==value1)
            {
                maximumHeights=st1.peek();
                break;
            }
            else if(value1>value2 && value1>value3)
            {
                st1.pop();
            }
            else if(value2>value3&& value2>value1)
            {
                st2.pop();
            }
            else
            {
                st3.pop();
            }
        }
        System.out.println(maximumHeights);
    }
    public static void fillStacks(Stack<Integer>st1,int[]h1,
                                Stack<Integer>st2,int[]h2,Stack<Integer>st3,int[]h3)
    {
        int sum1=0;
        for(int i=0;i<h1.length;i++)
        {
            sum1+=h1[i];
            st1.push(sum1);
        }
        int sum2=0;
        for(int i=0;i<h2.length;i++)
        {
            sum2+=h2[i];
            st2.push(sum2);
        }
        int sum3=0;
        for(int i=0;i<h3.length;i++)
        {
            sum3+=h3[i];
            st3.push(sum3);
        }
    }
    public static void main(String[] args) {
        int[]array1={1,2,3,1,1};
        int[]array2={1,1,4,3};
        int[]array3={1,4,1,1};
        EqalStack stack=new EqalStack(array1,array2,array3);
    }
    
}
