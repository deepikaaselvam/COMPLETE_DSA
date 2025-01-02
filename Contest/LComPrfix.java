package Contest;
// import java.lang.StringBuilder;
import java.util.Arrays;
public class LComPrfix {
    public String longestCommonPrefix(String[]QnsString)
    {
        String result="";    //It takes much complexity because ,Each Time we modify the array 
                            //It will create a new object of it!!!

        //StringBuilder is better than String

        Arrays.sort(QnsString);
       char[]firstStringArray=QnsString[0].toCharArray();
       char []lastStringArray=QnsString[QnsString.length-1].toCharArray();
       for(int i=0;i<firstStringArray.length;i++)
       {
        if(firstStringArray[i]!=lastStringArray[i])
        {
            break;
        }
        result+=firstStringArray[i];
       }
       return result;
 
    }
    public static void main(String[] args) {
        String []QuestionString={"flower","flow","flight"};
        LComPrfix obj = new LComPrfix();
        System.out.println(obj.longestCommonPrefix(QuestionString));
    }
    
}
