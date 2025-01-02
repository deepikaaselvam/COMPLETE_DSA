package TwoPointer;
public class Match {
    public static String stringMatching(String str1,String pat1)
    {
        int i=0;
        int j=0;
        String answer="";
        while(i<str1.length() && j<pat1.length())
        {
            if(str1.charAt(i)==pat1.charAt(j))
            {
                answer+=pat1.charAt(j);
                i++;
                j++;
                
            }
            else{
                j=0;
                i++;
                answer="";
            }
        }

        return answer;

    }
    public static void main(String[] args) {
        String str = "abcdeabdbabef";     //in the worst case...it may run -> O(n*m) .   str= "aaaaaaaaaaaa"
        String pattern = "abd";           // pattern ="aaaaa"   
        String result = stringMatching(str,pattern);
        System.out.println(result);
    }
    
}
