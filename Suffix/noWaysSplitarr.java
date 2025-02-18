package Suffix;
public class noWaysSplitarr {
    public static int cntWaysoftheSplitArrayy(int[]array)
    {
        int[]prefixSum=new int[array.length];
        int cnt=0;
        int sum=0;
        for(int i=0;i<array.length;i++)
        {
            sum+=array[i];
            prefixSum[i]=sum;
        }
        int l=0;
        while(l<array.length-1)
        {
                if(prefixSum[l]>=prefixSum[array.length-1]-prefixSum[l])
                {
                    cnt++;
                }
            l++;
        }
        return cnt;
    }
    public static void main(String[] args) {
        int[]array={10,4,-8,7};
        System.out.println(cntWaysoftheSplitArrayy(array));
    }
     // else
            // {
            //     if(prefixSum[l]>=prefixSum[array.length-1]-prefixSum[l])
            //     {
            //         cnt++;
            //     }
            // }
    
}
