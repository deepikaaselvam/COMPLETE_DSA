package TwoPointer;

public class Matching {
    public static int[]lpsArray(String str1,String Pattern)
    {
        int[]LPS = new int[Pattern.length()];
        int i=0,j=1;
        LPS[0]=0;
        //To Build The LPS Arrayyyy
        while(j<Pattern.length())
        {
            if(Pattern.charAt(i) == Pattern.charAt(j))
            {
                i++;
                LPS[j]=i;
                j++;
            }
            else{
                if(i!=0)
                {
                
                   i = LPS[i-1];
                }
                else {
                    LPS[j]=0;
                    j++;
                }

            }
            
           

        }
        return LPS;
    }
    public static void main(String[] args) {
        String s1 ="abxabcabcaby";
        String pattern = "abcaby";
        int[]answer=lpsArray(s1,pattern);
        for(int i=0;i<answer.length;i++)
        {
            System.out.print(answer[i]+" ");
        }
        
    }
    
}
