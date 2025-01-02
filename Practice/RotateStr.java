package Practice;
import java.util.HashMap;
public class RotateStr {
    public static boolean rotateString(String s,String goal)
    {
        HashMap<Character,Integer>mpp=new HashMap<>();

        if(s.length()!=goal.length()){
            return false;
        }
        char[]sourceArray=s.toCharArray();
        char[]destArray=goal.toCharArray();
        for(int i=0;i<sourceArray.length;i++)
        {
            mpp.put(sourceArray[i],i);
        }
        for(int i=0;i<2*destArray.length;i++)
        {
            char temp=destArray[i%destArray.length];
            if(mpp.containsKey(temp))
            {
                int index=mpp.get(temp);
                if(index!=i/2)
                {
                    return false;
                }
            }
        }
        

        return true;

    }
    public static void main(String[] args) {
        String s="abcde";
        String goal="cdeab";
        System.out.println(rotateString(s,goal));
    }
    
}
