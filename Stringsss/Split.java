package Stringsss;

public class Split {
    public static boolean isCircular(String sentence)
    {
        char[]characterArray=sentence.toCharArray();
        int i=0;
        char firstWord=characterArray[0];
        while(i<characterArray.length)
        {
            if(characterArray[i]==' ')
            {
                if(characterArray[i-1]!=characterArray[i+1])
                {
                    return false;
                }
                
            }
            if(characterArray[characterArray.length-1]!=firstWord)
            {
                return false;

            }
            i++;
        }
        return true;
    }
    public static void main(String[] args) {
        String sentence="Leetcode is cool";//"eetcode";//"leetcode estates sound delightful";
        System.out.println(isCircular(sentence));;
       
    }
    
}
