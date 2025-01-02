package PrefixSumm;
public class Prefixsumarr {

    public static void main(String[] args) {
        int []array={0,1,2,3,4,5};
        int newArray[]=new int[array.length];
        newArray[0]=array[0];
        
    
        for(int i=1;i<array.length;i++)
        {
            newArray[i]=newArray[i-1]+array[i];

        }
        for(int i=0;i<newArray.length;i++)
        {
            System.out.print(newArray[i]+" ");
        }

    }
    
}
