package SlideWindow;

public class AvgSub {
    public static double findMaxAverage(int[] nums, int k) {
        if(nums.length==1)
        {
            return (double)(nums[0]/k);
        }
        double avg;
        int j=0;
        double sum=0.0;
        for(j=0;j<k;j++)
        {
            sum+=nums[j];
        }
        avg = (double) (sum/k);
        for(j=k;j<nums.length;j++)
        {
           
            sum = sum - nums[j-k]+ nums[j];
            
            avg= Math.max(avg,(double)(sum/k));
        }
        return avg;
       
    }
    public static void main(String[] args) {
        int[]array={1,12,-5,-6,50,3};//{5};//
        int k=4;//1
        double answer=findMaxAverage(array,k);
        System.out.println(answer+" ");

        
    }
    
    
}
