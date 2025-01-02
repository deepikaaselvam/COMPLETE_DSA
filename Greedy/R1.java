package Greedy;
public class R1 {
    public static int removeDuplicates(int[]array)
    {
        int i=0;
        int j=1;
        while(j<array.length)
        {
            if(array[i]!=array[j])
            {
                array[i+1]=array[j];
                i++;
                j++;
            }
            else {
                
                j++;
            }
            
        }
        return(i+1);
    }

    public static void main(String[] args) {
        int array[]={1,1,1,2,2,3};
        int n=removeDuplicates(array);
        for(int i=0;i<n;i++)
        {
            System.out.print(array[i]+" ");
        }
        
    }
    
} 
