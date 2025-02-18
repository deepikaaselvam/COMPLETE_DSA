package POTD;

public class rotate1PlaceArray {
    public static int[] rotateDplace(int[]nums,int d )
    {
        int tempArray[] = new int[d];
        for(int i=d;i<nums.length;i++)
        {
            nums[i-d]=nums[i];
        }
        for(int i=0;i<d;i++)
        {
           tempArray[i]=nums[i];
        }
        
        return nums;
    }
    public static void main(String[] args) {
        int[]array={1,2,3,4,5,6};
        int D=2;
        int[]answer=rotateDplace(array,D);
        for(int i=0;i<answer.length;i++)
        {
            System.out.print(answer[i]+" ");
        }
    }
    //System.arraycopy(nums, 0, tempArray, 0, d);
    
}
