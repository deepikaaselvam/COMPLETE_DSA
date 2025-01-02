package Basic;

public class RemDup {
    public static int removeDuplicate(int[]array,int i,int j)
    {
        while(j<array.length)
        {
            if(array[i]==array[j])
            {
                j++;
            }
            else{
                array[i+1]=array[j];
                i++;
                j++;
            }
           
        }
        return (i+1);

    }
    public static void main(String[] args) {
        int[]array={0,0,1,1,1,2,2,3,3,4};
        int i=0;int j=1;
        int newArray=removeDuplicate(array,i,j);
        System.out.println(newArray);
       
    }
    
}
