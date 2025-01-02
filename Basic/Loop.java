package Basic;

public class Loop {
    public static void main(String[] args) {
        int[]array={1,2,3,4,5,6};
       int l=0,r=array.length-1;
       while(l<r)
       {
        int temp=array[l];
        array[l]=array[r];
        array[r]=temp;
        l++;
        r--;
       }
       for(int i=0;i<array.length;i++)
       {
        System.out.print(array[i]+" ");;
       }
    
    }
    
}
