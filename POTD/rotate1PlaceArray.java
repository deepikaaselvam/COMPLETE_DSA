package POTD;

public class rotate1PlaceArray {
    public static int[] rotateOneplace(int[]nums)
    {
        int temp =nums[0];
        for(int i=1;i<nums.length;i++)
        {
            nums[i-1]=nums[i];
        }
        nums[nums.length-1]=temp;
        return nums;
    }
    public static void main(String[] args) {
        int[]array={1,2,3,4,5,6};
        int[]answer=rotateOneplace(array);
        for(int i=0;i<answer.length;i++)
        {
            System.out.print(answer[i]+" ");
        }
    }
    
}
