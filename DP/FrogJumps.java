package DP;

public class FrogJumps {
    public int minimumJumps(int[] Jumps, int[] DPArray, int index)
    {
        if (index == 0) 
        {return 0; }       // Base case
        if (DPArray[index] != -1) 
        {
            return DPArray[index]; 
        }                  // Memoization

        int left = minimumJumps(Jumps, DPArray, index - 1) + Math.abs(Jumps[index] - Jumps[index - 1]);
        int right = Integer.MAX_VALUE;
        if (index > 1) {
            right = minimumJumps(Jumps, DPArray, index - 2) +  Math.abs(Jumps[index] - Jumps[index - 2]);
        }
        return DPArray[index] = Math.min(left, right);
    }
    public static void main(String[] args) {
        int[]jumps ={30,10,60,10,60,50};
        int[]dpArray = new int[jumps.length];
        for(int ind =0;ind<jumps.length;ind+=1)
        {
            dpArray[ind]=-1;
        }
        FrogJumps object = new FrogJumps();
        int result = object.minimumJumps(jumps, dpArray, jumps.length-1);
        System.out.println("Minimum jumps: " + result);
       
    }
    
}
