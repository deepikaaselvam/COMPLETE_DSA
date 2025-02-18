public class ZOHO2 {
    public static void main(String[] args) {
        String s ="ELELEEL";//"";//"LLEEEL";
        int chairsCnt =0;
        int finalAns =0;
        for(int i=0;i<s.length();i++)
        {
            char character =s.charAt(i);
            if(character == 'L')
            {
                if(chairsCnt!=0)
                {
                    chairsCnt-=1;

                }

            }
            else{
                chairsCnt+=1;
            }
            finalAns =Math.max(finalAns,chairsCnt);
        }
        System.out.println(finalAns);
    }
    
}
