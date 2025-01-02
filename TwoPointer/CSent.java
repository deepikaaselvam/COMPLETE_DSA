package TwoPointer;

public class CSent {
    public static boolean isCircularSentence(String sentence) {
        char[]charArr=sentence.toCharArray();
        char firstWord=charArr[0];
        int i=0;
        int length=charArr.length;
        char lastWord=charArr[length-1];
        while(i<charArr.length)
        {
            if(charArr[i]!=' ')
            {
                i++;
            }
            if(charArr[i]==' ')
            {
                if(charArr[i-1]==charArr[i+1])
                {
                    i++;
                }
                else
                {
                    return false;
                }
            }
            if(charArr[i]==length-1)
            {
                 if(lastWord==firstWord)
                {
                    return true;
                }
                else
                {
                    return false;
                }

            }
           
        }
        return true;
        
    }
    public static void main(String[] args) {
        String s="leetcode exercises sound delightful";
        // System.out.println(s.length());
        System.out.println(isCircularSentence(s));

    }
    
}
