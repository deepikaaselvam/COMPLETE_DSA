
import java.util.Stack;
public class remparan {
    public static String remParanthese(String ques)
    {
        Stack<Integer>st = new Stack<>();
        boolean[]valid = new boolean[ques.length()];
        for(int i=0;i<ques.length();i++)
        {
            char ch=ques.charAt(i);
            if(ch == '(')
            {
                st.push(i);
            }
            else if(ch==')')
            {
                if(!st.isEmpty() && st.peek()!='(')
                {
                    valid[i]=true;
                    valid[st.pop()]=true;
                }
            }
            else{
                valid[i]=true;
            }
        }
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<ques.length();i++)
        {
            if(valid[i])
            {
                ans.append(ques.charAt(i));
            }
        }
     
            return ans.toString();
        }
        public static void main(String[] args) {
        System.out.println(remParanthese("(AB))(cd))"));
        
        
    }
    
}

