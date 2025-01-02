package Basic;
import java.util.HashMap;
public class Isomorphic {
    public static boolean isIsomorphic(String s1,String t1)
    {
        if(s1.length()!=t1.length())
        {
            return false;
        }
        HashMap<Character,Character>mpp=new HashMap<>();
        for(int i=0;i<s1.length();i++)
        {
            char original=s1.charAt(i);
            char replacement=t1.charAt(i);
            if(!mpp.containsKey(original))
            {
                
                if(!mpp.containsValue(replacement))
                {
                    mpp.put(original,replacement);
                }
                else
                {
                    return false;
                }
            }
            else
            {
                char mappedCharacter=mpp.get(original);
                if(mappedCharacter!=replacement)
                {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "foo";
        String t = "bar";
        System.out.println(isIsomorphic(s,t));;
        

    }
    
}
