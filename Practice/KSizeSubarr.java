package Practice;
public class KSizeSubarr {
  
        public static int[] resultsArray(int[] array, int k) {
            int result[]=new int[array.length-k+1];
            if(array.length==1)
            {
                return new int[]{array[0]};
            }
            for(int i=0;i<=array.length-k;i++)
            {
                boolean isIncreasing=true;
                int maxi=-1;
                for(int j=i;j<i+k-1;j++)
                {
                    
                    if(array[j]>=array[j+1])
                    {
                         isIncreasing=false;
                            break;
                    }
                     maxi=Math.max(maxi,array[j+1]);
                }
                result[i]=isIncreasing? maxi:-1;
            }
            return result;
            
        }
    
    
    public static void main(String[] args) {
        int[]arr={1,3,4};//{2,2,2,2,2};//{1,2,3,4,3,2,5};
        int k=2;
        int ans[]=resultsArray(arr,k);
        for(int i=0;i<ans.length;i++)
        {
            System.out.print(ans[i]+" ");
        }
    }
    
}
