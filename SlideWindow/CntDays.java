package SlideWindow;
public class CntDays 
{   public static int countDayswithoutmeeting(int days,int [][]num)
    {       int cnt =0;
            int[]check =new int[days+1];
            check[0]=1;
            for(int index =0;index<num.length;index+=1)
            {
                int start = num[index][0];
                int end = num[index][1];
                for(int jIndex =start;jIndex<=end;jIndex+=1)
                {
                    check[jIndex] = 1;
                    
                }
            }
            for(int valueCheck =1 ;valueCheck<check.length ; valueCheck+=1)
            {
                if(check[valueCheck]==0)
                {
                    cnt+=1;
                }
            }
            return cnt;
    }
    public static void main(String[] args) {
        int days =10;
        int[][]nums={{5,7},{1,3},{9,10}};
        int ans = countDayswithoutmeeting(days,nums);
        System.out.println(ans);
    }
    
    
}
