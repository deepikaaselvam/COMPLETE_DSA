package Basic;

public class Sort012 {
    public static int[] Sort0s1sand2s(int[]array)
    {
        int low=0,mid=0,high=array.length-1;
        while(mid<=high)
        {
            if(array[mid]==0)
            {
                int temp=array[low];
                array[low]=array[mid];
                array[mid]=temp;
                low++;
                mid++;
            }
            else if(array[mid]==1)
            {
                mid++;
            }
            else{
                int temp=array[mid]; 
                array[mid]=array[high];
                array[high]=temp;
                high--;
            }
        }
        return array;
    }
    public static void main(String[] args) {
        int[]array={1,2,0,1,2};
       int[]result= Sort0s1sand2s(array);
       for(int i=0;i<result.length;i++)
       {
        System.out.print(result[i]+"  ");
       }
    }
    
}
