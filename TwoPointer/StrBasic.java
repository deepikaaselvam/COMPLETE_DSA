package TwoPointer;
import java.util.ArrayList;
import java.util.List;
public class StrBasic {
    public static List<String> wordSubSets(String[]w1,String[]w2)
    {
    
        List<String>result = new ArrayList<>();
        for(int i=0;i<w1.length;i++)
        {
            int cnt=0;
            for(int j=0;j<w2.length;j++)
            {
                if(w1[i].contains(w2[j]))
                {
                    cnt++;
                }
            }
            if(cnt==w2.length)
            {
                result.add(w1[i]);
            }
        }
        return result;
    }
    public static void main(String[] args) {
       String[]words1={"amazon","apple","facebook","google","leetcode"};
       String words2[]={"l","e"};//{"e","o"};
       List<String>ans =wordSubSets(words1,words2);
       for(int i=0;i<ans.size();i++)
       {
            System.out.print(ans.get(i)+" ");
       }
    }
    
}
