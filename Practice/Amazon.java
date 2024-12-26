package Practice;
public class Amazon {
    public static int searchElement(int[]nums,int target)
    {
        if(nums.length==1)
        {
            return nums[0] == target ? 0 : -1;
        }
        int l=0;
        int r= nums.length-1;
        while(l<=r)
        {
            int mid =(l+(r-l)/2);
            if(nums[mid]==target)
            {
                return mid;
            }
            else if(nums[l]<=nums[mid])
            {
                if(nums[l]<=target&& target<=nums[mid]) // Why we use the condition na...becoz...{                                        
                {                                       // the question itself is clearly states that ..it is rotated sorted array
                    r=mid-1;                            // so we can simply use the condition 
                }
                else{ 
                    l=mid+1;     
                }

            }
            else if(nums[mid]<=nums[r]){
                if(nums[mid]<=target && target<=nums[r])
                {
                    l=mid+1;
                }
                else{
                    r = mid -1;   //[7,8,9,1,2,3,4,5,6] target = 1 7<=1 ->No...2<=1->yes..2<=1&& 1<=6 ->No ->r=mid-1...or it is r =mid -1;
           
                }

            }
            
        }
        return -1;
    }
   public static void main(String[] args) {
    int[]array={4,5,6,7,0,1,2};
    int target =1;
    System.out.println(searchElement(array,target));
    
   }
}