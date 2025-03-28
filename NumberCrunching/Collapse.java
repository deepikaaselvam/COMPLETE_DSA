package NumberCrunching;

public class Collapse {
    
    public static void main(String[] args) {
        int firstNo = 0;
        int[]nums={3,34,30,5,9};
        for(int i=nums.length-1;i>0;i++)
        {
            firstNo=nums[i];
            for(int j=i-1;j>=0;j--)
            {
                if(nums[j]<firstNo)
                {
                    int temp=firstNo;
                    firstNo=nums[j];
                    nums[j]=temp;
                }
                else{
                   continue;
                }
                firstNo=nums[j];
            }

        }
        for(int i=0;i<nums.length;i++)
        {
            System.out.print(nums[i]+" ");
        }
    }
    
}
