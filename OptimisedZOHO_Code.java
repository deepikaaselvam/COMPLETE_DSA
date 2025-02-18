// import java.lang.Stringbuilder;
public class OptimisedZOHO_Code {
    public static void main(String[] args) {
        String number ="98919";
        String digits ="9";
        StringBuilder sb = new StringBuilder(number);
        int maximum = Integer.MIN_VALUE;
   

        for(int i=0;i<sb.length();i++)
        {
            if(sb.charAt(i)==digits.charAt(0))
            {
                char removed = sb.charAt(i);
                sb.deleteCharAt(i);
                int nukber = Integer.parseInt(sb.toString());
                maximum = Math.max(maximum,nukber);

                //insert the removed charcater again into the stringBuilder
                sb.insert(i,removed);
                // System.out.println(sb);

            }
        }
        System.out.println(maximum);
    }
    
}
