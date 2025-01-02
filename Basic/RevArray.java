package Basic;
public class RevArray {
    public static void reverseArray(int l,int r,int[]array)
    {
        if(l>=r)
        {
            return;
        }
        int temp=array[l];
        array[l]=array[r];
        array[r]=temp;
        reverseArray(l+1, r-1, array);
     }
       public static void main(String[] args) {
        int[]array={10,20,30,40,50,60};
        
        reverseArray(0,array.length-1,array);
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+" ");
        }
        
    }
    
}
