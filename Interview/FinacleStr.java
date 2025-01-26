package Interview;
public class FinacleStr {
    public static int binaryStringExamination(String s)
    {
        StringBuilder T = new StringBuilder();
        int k=3;
        for(int i=0;i<k;i++)
        {
            T.append(s);
        }
        int zerosCnt =0;
        int maxCnt = Integer.MIN_VALUE;
        String t =T.toString();
        char[]TArray = t.toCharArray();
        for(int i=0;i<T.length();i++)
        {
            if(TArray[i]=='0')
            {
                zerosCnt++;
            }
            else
            {
                maxCnt = Math.max(maxCnt,zerosCnt);
                zerosCnt=0;
            }
        }
        return maxCnt;
    }
       
    
    public static void main(String[] args) {
        String s="0010";
        System.out.println(binaryStringExamination(s));
    }
    
}
