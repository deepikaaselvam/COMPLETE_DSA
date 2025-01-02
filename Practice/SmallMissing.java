package Practice;


public class SmallMissing {
    public static int smallestPositiveMissigNumber(int[]arr)
    {
        
        for( int i=0;i<arr.length;i++)
        {
           while(arr[i]>0 && arr[i]<=arr.length && arr[arr[i]-1]!=arr[i])
            {
                int temp=arr[arr[i]-1];
                arr[arr[i]-1]=arr[i];
                arr[i]=temp;
            }
         }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=i+1)
            {
                return i+1;
            }

        }
       
      
      return arr.length-1+1;
        

    }
    public static void main(String[] args) {
        int[]array={-8, 0, -1, -4, -3};//{-6,-3,1,5};//{2, -3, 4, 1, 1, 7};//{1,2,3,4,5};//{-8, 0, -1, -4, -3};//{5, 3, 2, 5, 1};//{2, -3, 4, 1, 1, 7};
        System.out.println(smallestPositiveMissigNumber(array));
    }
    //2,6,2,-8,-7,8 = 1.
    //-6,-3,1,5=0
    //2, -3, 4, 1, 1, 7=0
    //1,2,3,4,5=6
    //-8, 0, -1, -4, -3=1
    //5, 3, 2, 5, 1=4
    //2, -3, 4, 1, 1, 7 =3
}
