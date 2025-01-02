package Recursion;

public class RevArray {
    public static void reverseArray(int l,int r,int[]a)
    {
        if(l>=r)return;
        swap(a,l,r);
        reverseArray(l+1,r-1,a);
    }

    public static void swap(int[]arr,int left,int right)
    {
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;

    }
    public static void main(String[] args) {
        int[]array={10,20,30,40,50,60};
        int left=0,right=array.length-1;
        reverseArray(left,right,array);
        for(int number:array)
        {
            System.out.print(number+" ");
        }
    }
    
}
/*
 *  public static void reverseArray(int l,int r,int[]a)      // We can use "  these method also "!!!!!
    {
        if(l>=r)return;
        int temp=a[l];
        a[l]=a[r];
        a[r]=temp;
        reverseArray(l+1,r-1,a);
    }

 */
