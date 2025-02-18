package Suffix;
import java.util.*;
public class cntStrRange {
    //Intuition ->In the particular range we need to find the count of the Strings in the given range🤔..
    // The idea is to "PREFIX SUM" 🔥  ->prefixSum(r)-prefixSum(l-1)
    public static int[]cntStringfrontheGivenRange(String[]words,int[][]queries)
    {
      
        HashSet<Character>voewls= new HashSet<>(Arrays.asList('a','e','i','o','u'));
        ArrayList<Integer>result=new ArrayList<>();
        int[]prefixSum=new int[words.length];
        int sum=0;
        for(int i=0;i<words.length;i++)
        {
            String curword =words[i];
         
            if(voewls.contains(curword.charAt(0)) && voewls.contains(curword.charAt(curword.length()-1)))
            {
                sum++;
            }
            prefixSum[i]=sum;
            

        }
        for(int []curQuery:queries)
        {
            int l=curQuery[0];
            int r =curQuery[1];
            int cnt=prefixSum[r]-((l>0)?prefixSum[l-1]:0);
            result.add(cnt);
        }
        int[]answer=new int[queries.length];
        for(int i=0;i<answer.length;i++)
        {
            answer[i]=result.get(i);
        }
        return answer;

    }
    public static void main(String[] args) {
        String[]words={"aba","bcb","ece","aa","e"};
        int[][]queries={{0,2},{1,4},{1,1}};
        int []res = cntStringfrontheGivenRange(words,queries);
        for(int i=0;i<res.length;i++)
        {
            System.out.print(res[i]+" ");
        }
    }
    
}
