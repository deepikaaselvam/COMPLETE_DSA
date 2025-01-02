package Sort;

public class QSort {
    public static void quickSort(int[]array,int l,int h)
    {
        if(h>l)
        {
            return;
        }

    }
    public static void qSort(int[]array,int low,int high)
    {
       
        int pivot=array[low];
        int i=low,j=high;
        quickSort(array,low,pivot-1);
        quickSort(array,pivot+1,high);
       
    }
    public static void main(String[] args) {
        int[]array={4,6,2,5,7,9,1,3};
        int n=array.length;
        qSort(array,0,n-1);
    }
    
}
