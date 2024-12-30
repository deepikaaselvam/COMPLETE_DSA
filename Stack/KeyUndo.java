package stack;                  //SkillRackProblem DoneDone😍✅
import java.util.Stack;
public class KeyUndo {
    public static String undoKeyStroke(String str)
    {
    StringBuilder result = new StringBuilder();
    Stack<Character>st =new Stack<>();
    int i=0;
    while(i<str.length())
    {
        if(!st.isEmpty() && str.charAt(i)=='*')
        {
            st.pop();
            
        }
        else if(st.isEmpty() && str.charAt(i)=='*')
        {
   
        }
        else{
           st.push(str.charAt(i));
        }
        i++;
    }
    while(!st.isEmpty())
    {
        result.append(st.pop());
    }
    result.reverse();
    

    return result.toString();


    }
    public static void main(String[] args) {
        String s="tt***u";//"trui**yhap*rd";//"lucky * draty**w";
        String answer=undoKeyStroke(s);
        System.out.println(answer);
    }
    
}
