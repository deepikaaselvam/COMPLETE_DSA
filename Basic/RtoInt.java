package Basic;
import java.util.HashMap;
public class RtoInt {
    public static int romanToInteger(String Question,HashMap<Character,Integer>mpp)
    {
       
        int newAnswer=mpp.get(Question.charAt(Question.length()-1));
        for(int i=Question.length()-1;i>=1;i--)
        {
            
            if(mpp.get(Question.charAt(i))>mpp.get(Question.charAt(i-1)))
            {
               newAnswer=newAnswer-mpp.get(Question.charAt(i-1));
            }
            else{
                newAnswer=newAnswer+mpp.get(Question.charAt(i-1));
            }
           
        }

        return newAnswer;
    }
    public static void main(String[] args) {
        HashMap<Character,Integer>mpp=new HashMap<>();
        mpp.put('I',1);
        mpp.put('V',5);
        mpp.put('X',10);
        mpp.put('L',50);
        mpp.put('C',100);
        mpp.put('D',500);
        mpp.put('M',1000);
        String Question ="MCMXCIV";
        int answer=romanToInteger(Question,mpp);
        System.out.println(answer);
       
      
    }
    
}
