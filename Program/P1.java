package Program;

public class P1 {
    public static int arraySign(int[] nums) {
        int cnt=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<0)
            {
                cnt++;
            }
            if(nums[i]==0)
            {
                return 0;
            }
         
        }
       
        return (cnt%2==0)?1:-1;
}
    public static void main(String[] args) {
        int nums[]={74,-99,-77,-15,-20,-69,-99,-70,-95,-50,
                -19,-50,-17,-27,-79,-68,-30,-51,-6,-1,-52,-93,-76,
                -36,-5,-87,-21,-94,-88,-98,-81,-66,-19,-1,-98};
           System.out.println(arraySign(nums));
    }
    
}
