public class TrailingZero {
    public static int trailingZeroes(int n) {
        if(n==0)
        {
            return 0;
        }
        int product =1;
        for(int i=n;i>0;i--)
        {
            product *=i;
        }
        int ans=product;
        int cnt =0;
        while(ans >0)
        {
            if(ans %10 ==0)
            {
                cnt++;
            }
            ans =ans/10;
        }
        return cnt;
    }
    public static void main(String[] args) {
        System.out.println(trailingZeroes(7));
    }

}
