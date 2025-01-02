package Contest;

public class RDup {
    public static int removeDup(int[]array)
    {
        if(array.length==0)
        {
            
            return 0;
        }
        int i=0,j=1;
        while(j<array.length)
        {
            if(array[i]==array[j])
            {
                j++;
            }
            else{
                array[i+1]=array[j];
                i++;
            }
        }
        return (i+1);

    }
    public static void main(String[] args) {
        int[]array={1,1,2,2,2,3,3};
        int newLength=removeDup(array);
        for(int i=0;i<newLength;i++)
        {
            System.out.print(array[i]+" ");
        
        }
        
    }
    
}
