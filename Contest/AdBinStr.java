package Contest;
import java.lang.String;
public class AdBinStr {
    public static String addBinary(String s1, String s2) {
        char []c1=s1.toCharArray();
        char []c2=s2.toCharArray();
        int carry=0;
        int currentSum=0;
        int i=c1.length-1,j=c2.length-1;
        StringBuilder result=new StringBuilder();
        while(i>=0 || j>=0||carry>0)
        {
           currentSum=carry;
           currentSum+=i>=0?c1[i]-'0':0; 
           currentSum+=j>=0?c2[j]-'0':0;
           result.append(currentSum%2);
           carry=currentSum/2;
            i--;
            j--;
        }
        result.reverse();
        int k=0;
        while(k<result.length() && result.charAt(k)=='0')
        {
            k++;
        }
        result.delete(0,k);

        return result.toString();
        
    
}
    public static void main(String[] args) {
        String s1="10";//1101 //00100   //10
        String s2="1";//111  //010     //1
        System.out.println(addBinary(s1,s2));
        
    
}

}