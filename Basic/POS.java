package Basic;

public class POS {
    public static int productOfSum(int[]array)
    {
        int sumFirst=0,sumSecond=0;
        if(array.length==-1)
        {
            return -1;
        }
        for(int i=0;i<array.length/2;i++)
        {
            sumFirst+=array[i];
        }
        for(int i=array.length/2-1;i<array.length;i++)
        {
            sumSecond+=array[i];
        }
        return(sumFirst*sumSecond);
        
    }
    public static void main(String[] args) {
        int[]array={4,7,15,11,10,5,2};
        System.out.println(productOfSum(array));;

    }
    
}
