package Sort;

public class Sel {
    public static void selectionSort(int[]array)
    {
        for(int i=0;i<array.length-1;i++)
        {
            int minimum=i;
            for(int j=i+1;j<array.length;j++)
            {
                if(array[j]<array[minimum])
                {
                    minimum=j;
                }
            }
            int temp=array[i];
            array[i]=array[minimum];
            array[minimum]=temp;
        }
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[]array={12,6,15,9,10};
        selectionSort(array);
    }
    
}
