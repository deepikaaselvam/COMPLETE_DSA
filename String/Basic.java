package String;
public class Basic {
    public String removeString(String question,String vowel)
    {
        StringBuilder ans= new StringBuilder();
        char[]questionArray=question.toCharArray();
        int i=0;
        while(i<questionArray.length)
        {
            char charcater=questionArray[i];
           if(vowel.contains(String.valueOf(charcater)))
           {
                if(!ans.isEmpty())
                {
                    ans.deleteCharAt(ans.length()-1);
                    ans.append(charcater);
                    i++;
                }
                else{
                    ans.append(charcater);
                    i++;
                }
            }
            else{
                ans.append(charcater);
            }
            i++;
        }
        return ans.toString();

    }
    public static void main(String[] args) {
        String vowels="aeiouAEIOU";
        String qn="table";
        Basic b= new Basic();
        System.out.println(b.removeString(qn,vowels));


        // StringBuilder sb =new StringBuilder("Deepika");
        // System.out.println(sb.deleteCharAt(sb.length()-1));
    }
    
}
