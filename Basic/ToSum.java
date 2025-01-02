package Basic;

public class ToSum {
    public static int[] twoSumNestedLoop(int[]array,int target)
    {
        for(int i=0;i<array.length;i++)
        {
            int firstNumber=array[i];
            for(int j=i+1;j<array.length;j++)
            {
                if(firstNumber+array[j]==target)
                {
                    return new int[]{i,j};

                }
            }
        }
        return new int[]{-1,-1};

    }
    public static void main(String[] args) {
        int[]array={2,6,5,8,11};
        int target=14;
        int[]result=twoSumNestedLoop(array,target);
        System.out.println(result[0]+" "+result[1]);
       
    }
    
}
