package Recursion;

public class OptRevArray {
    public static void reverse (int[]array,int i,int n)
    {
        if(i>=n/2)
        {
            return;
        }
        int temp=array[i];
        array[i]=array[n-i-1];
        array[n-i-1]=temp;
        reverse(array,i+1,n);
    }
    public static void main(String[] args) {
        int[]array={10,23,45,67,89,100};
        reverse(array,0,array.length);
        for(int answer:array)
        {
            System.out.print(answer+" ");
        }

    }
    
}
