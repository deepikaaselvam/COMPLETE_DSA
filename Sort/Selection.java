package Sort;

public class Selection {
    public static void main(String[] args) {
        int[]array={15,12,9,77,81,69,23};
        for(int i=0;i<array.length-1;i++)
        {
            int minimum=i;
            for(int j=i+1;j<array.length;j++)
            {
                if(array[j]<array[minimum])
                {
                    int temp=array[j];
                    array[j] =array[minimum];
                    array[minimum]=temp;
                }
            }
        }
        for(int i:array)
        {
            System.out.print(i+" ");
        }
    }
    
}
