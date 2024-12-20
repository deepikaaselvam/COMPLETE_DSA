package POTD;
import java.util.HashSet;
public class Imp1 {
    public static int  longestSubstring(String s)
    {
        HashSet<Character>set = new HashSet<>();
        int maximum=Integer.MIN_VALUE;
        char[]ch=s.toCharArray();
        int l=0,r=0;
        while(r<ch.length)
        {
            while(l<r && set.contains(ch[r]))
            {
                set.remove(ch[l]);
                l++;
            }
           
                set.add(ch[r]);
                maximum = Math.max(maximum,r-l+1);
            
            r++;

        }
        return maximum;

    }
    public static void main(String[] args) {
        String s = "abcaabcdba";
        System.out.println(longestSubstring(s));
    }
    
}
