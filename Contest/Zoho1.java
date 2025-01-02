package Contest;

public class Zoho1 {
    public static int equilibruimIndexrray(int[]array)
    {
       /*  for(int i=1;i<array.length;i++)
        {
            int leftSum=0,rightSum=0;
            for(int i1=i-1;i1>=0;i1--)
            {
                leftSum+=array[i1];
            }
            for(int j=i+1;j<array.length;j++)
            {
                rightSum+=array[j];
            }
            if(leftSum==rightSum)
            {
               return i; 

            }

        }*/
        int leftsum=array[0];     //Optimised Appproach
        int rightSum=0;
        for(int i=2;i<array.length;i++)
        {
            rightSum+=array[i];

        }
        for(int i=1;i<array.length-1;i++)
        {
            if(leftsum==rightSum)
            {
              return i;
            }
            else{
                leftsum+=array[i];
                rightSum-=array[i+1];
            }
        }
        return -1;
        
    }
    public static void main(String[] args) {
        int[]array={0,0,0,0 };    //1,3,5,2,2   //-1, 3, -4, 5, 1, -6, 2, 1   //1,2,3,4,5
        int ans=equilibruimIndexrray(array);

        System.out.println(ans);
       
        }
    }
    

