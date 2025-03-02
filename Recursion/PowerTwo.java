package Recursion;

public class PowerTwo {
    public static boolean isPowerofTwoo(int qn)
    {
        // int ans=qn%2;
        if(qn==1)
        {
            return true;
        }
        if(qn%2!=0)
        {
            return false;
        }
        
        
        
        return isPowerofTwoo(qn/2);
     }
    
    public static boolean isPowerOfTwo(int n) {
        // int value =n;
        if(n<1)
        {
            return false;
        }
        if(n==1)
        {
            return true;
        }
        boolean ans= isPowerofTwoo(n);
        return ans;

            
        
    }
    // public static boolean isPowerofTwoo(int powerValuee,int value)
    // {
  
    //     if(value == powerValuee)
    //     {
    //         return true;

    //     }
       
    //     if(powerValuee>value) return false;

    //    return isPowerofTwoo(powerValuee*2,value);

        
    // }
    // public static boolean isPowerOfTwo(int n) {
    //     int value =n;
        
    //     boolean ans= isPowerofTwoo(1,value);
    //     return ans;

            
        
    // }
    public static void main(String[] args) {
       
        int n =16;
        
        System.out.println(isPowerOfTwo(n));//n=16 ,1->true;
    }
    
}
