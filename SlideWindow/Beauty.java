package SlideWindow;

import java.util.ArrayList;

public class Beauty {
     public static int[] getSubarrayBeauty(int[] nums, int k, int x) {
        int n = nums.length;
        int[] freq = new int[51];
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0, j = 0; i < n; i++) {
            // count freq of negative numbers in current sliding windows
            if (nums[i] < 0) {freq[Math.abs(nums[i])]++;}
            if (i - j + 1 >= k) 
            {
                int cnt = 0;
                // calculate xth smallest number in current sliding windows
                for (int L = 50; L >= 1; L--) 
                {
                    cnt += freq[L];
                    if (cnt >= x) 
                    { 
                        ans.add(-L);
                        break;
                    }
                }
                // No xth smallest number present 
                if (cnt < x){ans.add(0);}
                if (nums[j] < 0) {freq[Math.abs(nums[j])]--;}
                j++;
               
            }
        }
        return ans.stream().mapToInt(Integer::intValue).toArray();


        // public int[] getSubarrayBeauty(int[] nums, int k, int x) {
        //     int[] counter = new int[50], ans = new int[nums.length - k + 1];;
        //     for (int i = 0; i < nums.length; i++) {
        //         if (nums[i] < 0) counter[nums[i] + 50]++;
        //         if (i - k >= 0 && nums[i - k] < 0) counter[nums[i - k] + 50]--;
        //         if (i - k + 1 < 0) continue;
        //         for (int j = 0, count = 0; j < 50; j++) {
        //             count += counter[j];
        //             if (count >= x) {
        //                 ans[i - k + 1] = j - 50;
        //                 break;
        //             }
        //         }
        //     }
        //     return ans;
        // }
        
        
    }
    public static void main(String[] args) {
        int[]arrayy ={-3,1,2,-3,0,-3};//{1,-1,-3,-2,3};
        int k=2;
        int x=1;
        int[]answer=getSubarrayBeauty(arrayy,k,x);
        for(int i=0;i<answer.length;i++)
        {
            System.out.print(answer[i]+" ");
        }
        
    }
    
}
