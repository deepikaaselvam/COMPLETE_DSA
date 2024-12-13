import java.util.Deque;
import java.util.LinkedList;
public class DequePalind {
    public static boolean isPalindrome(String s)
    {
        Deque<Character> deque=new LinkedList<>();
        s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        for(int i=0;i<s.length();i++)
        {
            deque.addLast(s.charAt(i));
        }
        while(deque.size()>1)
        {
            char front=deque.pollFirst();
            char rear=deque.pollLast();
            if(front!=rear)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama ";
        System.out.println(isPalindrome(s));
      

    }
    
}
