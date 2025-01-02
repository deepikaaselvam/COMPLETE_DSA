package TwoPointer;

import java.util.Stack;

public class LValid {
     public static int longestValidParentheses(String s) {
        Stack<Character>stack = new Stack<>();
        if(s.length()==0)
        {
            return 0;
        }
        int i=0,j=0;int cnt=0;
        while(j<s.length())
        {
            if(s.charAt(j)=='(')
            {
                stack.push(s.charAt(j));
                i=j;
            }
            else
            {
                if(stack.isEmpty() && s.charAt(j)==')')
                {
                    return cnt;
                }
              

                char c=stack.pop();
                
                if(s.charAt(j)==')'&& c=='(')
                {
                    cnt+= 2;
                }
            }
            j++;
        }
        return cnt;
    }
        public static void main(String[] args) {
            String s="()(()";
            System.out.println(longestValidParentheses(s));
            
        }
    
}
