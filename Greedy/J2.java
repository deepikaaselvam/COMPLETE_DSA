package Greedy;
public class J2 {
    public static int jump(int[] nums) {
        int lastIndex=nums.length-1;
        int cnt=0;int maxJump=0;int ans=0;
    
        for(int i=0;i<=lastIndex;i++)
        {
            
            if(maxJump<lastIndex)
            {
                maxJump=Math.max(maxJump,i+nums[i]);
                cnt++;
                if(maxJump>(i+1))
                {
                    i=maxJump;
                    if(i>nums.length-1)
                    {
                        break;
                    }
                }
            }
            
            else if(maxJump>=lastIndex)
            {
               ans=cnt;
                break;
            }
            
           
        }
       
        return cnt;
    }
    
    public static void main(String[] args) {
        int[]array={2,3,1,4,1,1,1,2};    //1,2   //1,2,1,1,1   //2,3,1,1,4   //2,3,0,1,4 //2,1
        System.out.println(jump(array));

        
    }
    
}
