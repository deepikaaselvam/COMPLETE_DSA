package COMPLETE_DSA.TwoPointer;
import java.util.Stack;
public class remParan {
    public static String remParanthese(String ques)
    {
        Stack<Character>st = new Stack<>();
        StringBuilder restore =new StringBuilder();
        String ans="";
        for(int i=0;i<ques.length();i++)
        {
            char ch=ques.charAt(i);
            if(ch=='(')
            {
                st.push(ch);
            }
            else if(ch!=')' && ch!='(')
            {
                ans+=ch;
            }
            else if(ch==')')
            {
                while(st.peek()!='(')
                {
                   restore.append( st.pop());
                }
                ans+=restore.reverse().toString();
            }
            }
            return ans;
        }
        public static void main(String[] args) {
        System.out.println(remParanthese("(AB))((cd))"));
        
        
    }
    
}
