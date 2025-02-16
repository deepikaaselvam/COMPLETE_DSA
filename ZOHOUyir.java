public class ZOHOUyir {
    
    public static void main(String[] args) {
        String number ="551";//"1231";//"98919";
        String digit="5";//'1';//'9';
        
        
        int maximum =Integer.MIN_VALUE;
        char[]numberArray =number.toCharArray();
        for(int i=0;i<numberArray.length;i++)
        {
            
            if(numberArray[i]==digit.charAt(0))
            {
                int index =i;
                String ans =number.substring(0,index) + number.substring(index+1,number.length());
                int integerConversion =Integer.parseInt(ans);
                if(integerConversion>maximum)
                {
                    maximum=integerConversion;
                }
               
            }
        }
        System.out.println("The final Answer "+ String.valueOf(maximum));
    }

}
/*
 *   String number = "98919";  // Example case
        char digit = '9';         // Example digit

        int maximum = Integer.MIN_VALUE;
        StringBuilder sb = new StringBuilder(number);

        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == digit) {
                // Temporarily remove the character at index i
                char removed = sb.charAt(i);
                sb.deleteCharAt(i);

                // Convert to integer and check maximum
                int num = Integer.parseInt(sb.toString());
                maximum = Math.max(maximum, num);

                // Restore the character for the next iteration
                sb.insert(i, removed);
            }
        }
 */