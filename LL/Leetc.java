import java.util.HashMap;

public class Leetc {
    
        public static String findValidPair(String s) {
            char[]CArray= s.toCharArray();
            String ans="";
            // if(CArray[0]==CArray[1])
            // {
            //     return " ";
            // }
            int cnt=1;
            HashMap<Character,Integer>mpp = new HashMap<>();
            for(int i=0;i<CArray.length;i++)
                {
                    mpp.put((Character)(CArray[i]),mpp.getOrDefault((Character)(CArray[i]),0)+1);
                }
            for(int i=0;i<CArray.length-1;i++)
                {
                    if(CArray[i]!=CArray[i+1])
                    {
                        if(Character.getNumericValue(CArray[i])==mpp.get(CArray[i])
                          && Character.getNumericValue(CArray[i+1])==mpp.get(CArray[i+1]))
                        {
                            ans=""+CArray[i]+CArray[i+1];
                        }
                        
                    }
                    
                }
            return ans;
        }
        public static void main(String[] args) {
           
            String s = "9212";
            System.out.println(findValidPair(s));
        }
    
    
}
