package Basic;
public class CntOcrStr {
    public static int countOfS2inS1(String s1,String s2)
    {
        int CountofS2inS1=0;
        for(int i=0;i<s1.length()-1;i++)
        {
            if(s1.charAt(i)==s2.charAt(0) && s1.charAt(i+1)==s2.charAt(1))
            {
                CountofS2inS1++;
            }
        }
        return CountofS2inS1;
    }
    /*The One things will told in the question is String s2 is always the length of '2' */
    public static void main(String[] args) {
        String s1="AABBBCCBB";
        String s2="BB";
        int answer=countOfS2inS1(s1,s2);
        System.out.println(answer);
    }
    
}
