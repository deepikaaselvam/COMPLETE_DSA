package SlidingWindow;

public class Subarr {
    public static int maximumSubarraySumwithKLength(int[]array,int k)
    {
       /* if(k>array.length)
        {
            return -1;
        }
        int maximum=Integer.MIN_VALUE;
        for(int i=0;i<=array.length-k;i++)
        {
            int sum=0;
            for(int j=i;j<i+k;j++)
            {
                sum+=array[j];
            }
            maximum=Math.max(maximum,sum);
        }*/
        int maximum=Integer.MIN_VALUE;
        int l=0;int r=k;
        int sum=0;
        for(int i=l;i<r;i++)
        {
            sum+=array[i];
        }
        maximum=Math.max(maximum,sum);
        while(r<array.length-1)
        {
            sum-=array[l];
            l++;
            sum+=array[r];
            r++;
            maximum=Math.max(maximum,sum);
        }
        return maximum;
    }
    public static void main(String[] args) {
        int[]arr1={-5, -2, -1, -7, -3};//{4, -1, 2, 1};//;//{3, -2, 5, -1, 6, -3};//{10, 20, 30, 40, 50};//{2};//{1, 2, 3, 4};//{1, -2, 3, 10, -4, 7, 2, -5};//{-1,2,2,3,4,5,1};
        int k=3;
        System.out.println(maximumSubarraySumwithKLength(arr1,k));;
    }
    
}
