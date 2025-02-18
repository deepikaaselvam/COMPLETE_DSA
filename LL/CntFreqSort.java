
package LL;
import java.util.ArrayList;
import java.util.HashMap;
public class CntFreqSort {
    public static String cntFrquencySortMap(String qns)
    {
        HashMap<Character,Integer>mpp = new HashMap<>();
        for(char character:qns.toCharArray())
        {
            mpp.put(character,mpp.getOrDefault(character,0)+1);
        }
        ArrayList<Character>digits=new ArrayList<>(mpp.keySet());
        // for(int i=0;i<digits.size();i++)
        // {
        //     System.out.print(digits.get(i)+" ");
        // }
        System.out.println();
        digits.sort((a,b)->{int freqCompare =mpp.get(b)-mpp.get(a);

            // System.out.println(freqCompare);
            return freqCompare!=0?freqCompare:a-b;});


        // System.out.println(digits);
        StringBuilder ans = new StringBuilder();
        for(char digit:digits)
        {
            ans.append(String.valueOf(digit).repeat(mpp.get(digit)));
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        String s="44433338993";
        System.out.println(cntFrquencySortMap(s));
    }
}