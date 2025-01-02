package Greedy;

public class R2 {
    public static int removeDup(int[]nums)
    {
        if(nums.length==2)
        {
            return nums.length;
        }
        int j=2;
        for(int i=2;i<nums.length;i++)
        {
            if(nums[i]!=nums[j-2])
            {
                nums[j]=nums[i];
                j++;
            }

        }
       
        return j;
    }
    public static void main(String[] args) {
        int[]array={0,0,1,1,1,1,2,3,3}; //   //0,0,1,1,1,1,2,3,3  //1,1,1,2,2,3 
        int n=removeDup(array);
        System.out.println();
        System.out.println("Length will be: "+n);
        System.out.println();
        for(int i=0;i<n;i++)
        {
            System.out.print(array[i]+" ");
        }
    }
    
}
