package Basic;

public class BrtToStr {
    public static String commonSubString(String s1,String s2)
    {
        for(int i=0;i<s1.length();i++)
        {
            char c1=s1.charAt(i);
            for(int j=0;j<s2.length();j++)
            {
                char c2=s2.charAt(j);
                if(c1==c2)
                {
                    return "YES";
                }
            }
        }
        return "NO";
    }
    public static void main(String[] args) {
        String s1="Hello";
        String s2="World";
        System.out.println(commonSubString(s1,s2));
    }
    
}
