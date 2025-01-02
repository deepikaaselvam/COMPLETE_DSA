package POTD;

public class Dec19 {
    public static int maxChunksSorted(int[]array)
    {
        int chunks=0;
        int[]prefixMax = array.clone();
        int[]suffixMin = array.clone();
        for(int i = 1 ;i<array.length;i++)
        {
            prefixMax[i]=Math.max(prefixMax[i],prefixMax[i-1]);
        }
        // for(int i=0;i<prefixMax.length;i++)
        // {
        //     System.out.print(prefixMax[i]+" ");
        // }
       
        // System.out.println();
        for(int i = array.length-2;i>=0;i--)
        {
            suffixMin[i]=Math.min(suffixMin[i+1],suffixMin[i]);
        }

        // for(int i=0;i<suffixMin.length;i++)
        // {
        //     System.out.print(suffixMin[i]+" ");
        // }
        // System.out.println();
        for(int i = 0;i<array.length;i++)
        {
            if(chunks ==0 || suffixMin[i] > prefixMax[i-1])
            {
                chunks++;
            }
        }
        return chunks;
    }
    public static void main(String[] args) {
        int[]array={4,3,2,1,0};
        System.out.println();
        System.out.println(maxChunksSorted(array));
    }
    
}

