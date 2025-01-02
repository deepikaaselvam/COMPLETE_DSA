package POTD;

public class Imp3 {
    public static int kthMissingNumber(int[]array,int k)
    {
        int lastElement=array[array.length-1];
        for(int i=1;i<=lastElement;i++)
        {
            if(i==array[i-1])
            {
                continue;
            }
            else
            {
                k--;
            }
            if(k==0)
            {
                return i;
            }
        }
        return lastElement+k;
    }
    public static void main(String[] args) {
        int[]array={2,3,4,7,11};
        int k=5;
        System.out.println(kthMissingNumber(array,k));
    }
    
}
