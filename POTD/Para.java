package POTD;
import java.util.Stack;
public class Para {

    public static boolean isParanthesis(String qns)
    {
        Stack<Character>st = new Stack<>();
        int i=0;
        while(i<qns.length())
        {
            if(qns.charAt(i)=='(' || qns.charAt(i)=='[' || qns.charAt(i)=='{')
            {
                st.push(qns.charAt(i));
            }
            else if(!st.isEmpty())
            {
                char c=st.pop();
                if(( qns.charAt(i)==')'&&c!='(' )||(qns.charAt(i)==']'&& c!='[' )|| (qns.charAt(i)=='}' &&c!='{'))
                {
                    return false;
                }

            }
            i++;
        }

        if(!st.isEmpty())
        {
            return false;
        }
        return true;
       
     
    }
    public static void main(String[] args) {
        String question ="(]";
        System.out.println(isParanthesis(question));
        
    }
    
}
