package Contest;

import java.util.*;
public class Feb2 {
    public int maxDifference(String s) {
        HashMap<Character,Integer>mpp = new HashMap<>();
        char [] StringArray = s.toCharArray();
        for(int i=0;i<StringArray.length;i++)
        {
            mpp.put(StringArray[i],mpp.getOrDefault(StringArray[i],0)+1);
        }
        int largest =0;
        int secondLargest =0;
       
        for(int i=0;i<StringArray.length;i++)
        {
            if(mpp.get(StringArray[i])>largest)
            {
                secondLargest=largest;
                largest =mpp.get(StringArray[i]);
            }
            else if(mpp.get(StringArray[i])<largest && mpp.get(StringArray[i])>secondLargest)
            {
                    
                secondLargest=mpp.get(StringArray[i]);
            }
        }
        int diff = largest-secondLargest;
            
        return diff;
     }
     public static void main(String[] args) {
        Feb2 obj = new Feb2();
        System.out.println((obj.maxDifference("aaaaabbc")));
     }
}
