package Recursion;

public class BTOneToN {
    public static void backTrack(int n)
    {
        if(n<1)
        {
            return;
        }
        backTrack(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        int n=5;
        backTrack(n);
    }
    
}
