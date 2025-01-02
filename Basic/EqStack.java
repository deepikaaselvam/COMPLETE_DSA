package Basic;
import java.util.Stack;
public class EqStack {
    public static void equalStack(int[]arr1,int[]arr2,int[]arr3)
    {
        Stack<Integer>st1=new Stack<>();
        Stack<Integer>st2=new Stack<>();
        Stack<Integer>st3=new Stack<>();
        for(int a1:arr1)
        {
            st1.push(a1);
        }
        for(int a1:arr2)
        {
            st2.push(a1);
        }
        for(int a1:arr3)
        {
            st2.push(a1);
        }
      while(!st1.isEmpty() && !st2.isEmpty() && !st3.isEmpty())
      {
        st1.pop();
        st2.pop();
        st3.pop();
        if(st1.size()==st2.size()&&st2.size()==st3.size() &&st1.size()==st3.size())
        {
            System.out.println("return true");
        }
        
      }

        

    }
    public static void main(String[] args) {
        
        int[]array1={3,2,1,1,1};
        int[]array2={4,3,2};
        int[]array3={1,4,1,1};
        equalStack(array1,array2,array3);

        
    }
}