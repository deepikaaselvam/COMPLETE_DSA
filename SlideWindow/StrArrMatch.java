package SlideWindow;
import java.util.ArrayList;
import java.util.Arrays;
class StrArrMatch{
    public boolean isPatmatch(String text,String pattern)
    {
        if(pattern.length()==0)
        {
            return false;
        }
        if(text.length()<pattern.length())
        {
            return false;
        }
        int[]lpsArray= new int[pattern.length()];
        int[]lps=constructLPSArray(pattern,lpsArray);
        int i=0;int j=0;
        while(i<text.length())
        {
            if(text.charAt(i)==pattern.charAt(j))
            {
                i++;
                j++;
                if(j==pattern.length())
                {
                    return true;
                }
            }
            else
            {
                if(j!=0)
                {
                    j=lps[j-1];
                }
                else
                {
                    i++;
                }
            }
        }
        return false;
    } 
    public static int[]constructLPSArray(String pattern,int[]lps)
    {
        int len =0;
        lps[0]=0;
        int i=1;
        while(i<pattern.length())
        {
            if(pattern.charAt(i)==pattern.charAt(len))
            {
                len++;
                lps[i]=len;
                i++;
            }
            else
            {
                //mismatch
                if(len!=0)
                {
                    len=lps[len-1];

                }
                else
                {
                    lps[i]=0;
                    i++;
                }
            }
        }
        return lps;
    }
    public  ArrayList<String> stringMatching(String[] words) 
    {
        
        //KMP Algorithm
        ArrayList<String> result= new ArrayList<>();
        Arrays.sort(words,(a,b)->a.length()-b.length());
        for(int i=0;i<words.length;i++)
        {
            for(int j = i+1;j<words.length;j++)
            {
                if(isPatmatch(words[j],words[i]))
                {
                    result.add(words[i]);
                    break;
                }

            }
        }
        return result;
    }
   
   
    public static void main(String[] args) {
        String answer[]={"mass","as","hero","superhero"};
        StrArrMatch obj= new StrArrMatch();
        ArrayList<String>ans=obj.stringMatching(answer);
        for(int i=0;i<ans.size();i++)
        {
            System.out.print(ans.get(i)+" ");
        }

        
    }
}  
