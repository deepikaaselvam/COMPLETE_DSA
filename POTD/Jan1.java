package POTD;

public class Jan1 {
    public static int  countSubString(String s)
    {
        int RightString =0;
        int leftString=0;
        int maximum =0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='1')
            {
                RightString++;
            }
        }
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='0')
            {
                leftString++;
            }
            else{
                RightString--;
            }
            maximum = Math.max(maximum,RightString+leftString);
        }
        return maximum;
    }

        public static void main(String[] args) {
        String s="1111";//"011101";//"00111";
        System.out.println(countSubString(s));
    }
    
}
