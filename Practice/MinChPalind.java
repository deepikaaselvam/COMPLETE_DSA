package Practice;
// import java.lang.StringBuilder;

   /* public static String minCharacterPalindrome(String s)
    {
        StringBuilder result1=new StringBuilder();
        StringBuilder result2=new StringBuilder();
        int cnt=0;
        int i=0,j=s.length()-1;
        while(i<=j)
        {
            if(i==j)
            {
                result1.append(s.charAt(i));
            }
            
            else if(s.charAt(i)!=s.charAt(j))
            {
                cnt++;
                result1.append(s.charAt(j));
                result2.append(s.charAt(j));
            
            }
            else{
                result1.append(s.charAt(i));
                i++;
                result2.append(s.charAt(j));
            }
            j--;

        }
        System.out.println(cnt);
        result1=result1.reverse();
        result2.append(result1);
        return result2.toString();
    }*/ 
public class MinChPalind {
    public static int mincountCharacterPalindrome(String s)
    {
        
        int cnt=0;
        int i=0,j=s.length()-1;
        while(i<=j)
        {
            if(i==j)
            {
                
            }
            
            else if(s.charAt(i)!=s.charAt(j))
            {
                cnt++;
            }
            else if(s.charAt(i)==s.charAt(j)){
                
                i++;
                
            }
            j--;

        }
        
        return cnt;
    }
    public static void main(String[] args) {
        String s="fxtlsgypsfa";//"abc";//"aacecaaaa";
        System.out.println(mincountCharacterPalindrome(s));;
    }
    
}
