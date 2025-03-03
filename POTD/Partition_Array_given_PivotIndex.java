package POTD;

public class Partition_Array_given_PivotIndex {
    public static  int[] pivotArray(int[] nums, int pivot) {
        int[]answer = new int[nums.length];
        int lesser=0;
        int greater = nums.length-1;
        for(int ind1 =0,ind2=nums.length-1;ind1<nums.length;ind1++,ind2--)
        {
            if(nums[ind1]<pivot)
            {
                answer[lesser]=nums[ind1];
                lesser+=1;
            }
             if(nums[ind2]>pivot)
            {
                answer[greater]=nums[ind2];
                greater--;
            }
        }
        while(lesser<=greater)
        {
            answer[lesser]=pivot;
            lesser+=1;
        }
        return answer;
}
    public static void main(String[] args) {
        int nums[]={9,12,5,10,14,3,10};
        int pivot=10;
        int[]answer =pivotArray(nums,pivot);
        for(int i =0; i<answer.length;i++)
        {
            System.out.print(answer[i]+" ");
        }
    }
    
}


/*int n= nums.length;
             //less than Pivot ->List1
          List<Integer>list1 = new ArrayList<>();
            int cnt=0;
            //greater than pivot ->List2
           List<Integer>list2 = new ArrayList<>();
            for(int ind=0;ind<nums.length;ind++)
            {
                if(nums[ind]<pivot)
                {
                    list1.add(nums[ind]);
                }
                else if(nums[ind]>pivot)
                {
                   list2.add(nums[ind]);
                }
                else if(nums[ind]==pivot)
                {
                    cnt++;
                }
            }
          
                int[]answer = new int[nums.length];
                int ind2=0;
                for(int LesserValue:list1)
                {
                    answer[ind2]=LesserValue;
                    ind2++;
                }
                for(int i=0;i<cnt;i++)
                {
                    answer[ind2]=pivot;
                    ind2++;
                }
                for(int GreaterValue:list2)
                {
                    answer[ind2]=GreaterValue;
                    ind2++;
                }
            return answer;*/