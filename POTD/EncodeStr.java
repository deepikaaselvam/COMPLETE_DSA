package POTD;
import java.util.Stack;
public class EncodeStr {
    public static String encodeTheString(String s)
    {
        if(s.length()==0)
        {
            return "";
        }
        Stack<Character>stack=new Stack<>();
        stack.push(s.charAt(0));

        String answer="";
        int cnt=1;
        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i)==s.charAt(i+1))
            {
                cnt++;
            }
            else if(s.charAt(i)!=s.charAt(i+1))
            {
                answer+=stack.pop();
                answer+=cnt;
                cnt=1;
                stack.push(s.charAt(i+1));
            }

        }
        if(cnt>=1)
        {
            answer+=stack.pop();
            answer+=cnt;
        }
        return answer;
    }
    public static void main(String[] args) {
        String s="aaaaaaaaaaaa";//"aaAA";//"z";//"";//"aa11bb";//"aabbccddeee";//"abcd";//"aaaaaa";//"aaabbc";//"aaabbccc";
        System.out.println(encodeTheString(s));;
    }
    
}
