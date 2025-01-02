package Practice;
public class Select {
    public static void main(String[] args) {
        int[]array={12,6,15,9,10};
        for(int i=0;i<array.length-1;i++)
        {
            int minimum=array[i];
            for(int j=1;j<array.length;j++)
            {
                if(array[j]<minimum)
                {
                    minimum=array[j];
                }
                int temp=array[i];
                array[i]=array[j];
                array[j]=temp;

            }
        }
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+" ");
        }
        
    }
    
}
