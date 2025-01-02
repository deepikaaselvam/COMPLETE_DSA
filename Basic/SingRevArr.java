package Basic;
public class SingRevArr {
    public static void reverseArray(int i,int[]array)
    {
        int n=array.length;
        if(i>=(array.length-1)/2)
        {
            return;
        }
        int temp=array[i];
        array[i]=array[n-i-1];
        array[n-i-1]=temp;
        reverseArray(i+1, array);
     }
        public static void main(String[] args) {
            int[]array={10,20,30,40,50,60};
            reverseArray(0,array);
            for(int i=0;i<array.length;i++)
            {
                System.out.print(array[i]+" ");
            }
            
    }
    
}

    

