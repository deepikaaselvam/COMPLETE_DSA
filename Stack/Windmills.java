package stack;
import java.util.Stack;
public class Windmills {
    public static int[] Nwindmills(int[]mills)
    {
        Stack<Integer>st = new Stack<>();
        int cnt=0;
        int [] answerArray = new int[mills.length];
        for(int i=0;i<mills.length;i++)
         {
             if(!st.isEmpty() && mills[st.peek()]>=mills[i])
            {
                 cnt=0;
                
               
             }
            while(!st.isEmpty() && mills[st.peek()]<mills[i])
             {
                 cnt+=1;
                 st.pop();
             }
             
            answerArray[i]=cnt;
            st.push(i);

         }
         return answerArray;
    }
    public static void main(String[] args) {
        int[]array={100,200,105,110,120,250};
        int[]answer=Nwindmills(array);
        for(int i=0;i<answer.length;i++)
        {
            System.out.print(answer[i]+" ");
        }
    }
}

 /**/




// Pop elements from the stack until the stack is empty or top of the stack is greater than or equal to current height
  // If the stack is empty, no smaller element exists to the left
  // The number of smaller elements to the left is the size of the stack

            // Push the current index onto the stack