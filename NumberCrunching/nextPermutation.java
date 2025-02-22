package NumberCrunching;

public class nextPermutation{
    public static int[]reverse(int[]arr,int start,int end)
    {
        int front,rear,temp;
        for(front=start,rear=end;front<=rear;front++,rear--)
        {
            temp=arr[front];
            arr[front]=arr[end];
            arr[end]=temp;
        }
        return arr;
    }
public  static int[] nxtPermutation(int[] arr) {
    boolean flag =false;
    int i=arr.length-1;int value =0;
    while(i>=0)
    {
            int j=i-1;
            if(j==0){
                break;
            }
            if(arr[j]<arr[i])
            {
                value=j;
                for(int k=arr.length-1;k>=0;k--)
                {
                    if(arr[k]>arr[value])
                    {
                        int temp=arr[k];
                        arr[k] = arr[value];
                        arr[value] = temp;
                        flag=true;
                        reverse(arr,j+1,arr.length-1);
                        break;
                    }
                }
              
            }
        if(flag==true)
        {
            break;
        }
        i--;j--;
    }
    if(flag==false)
    {
        reverse(arr,0,arr.length-1);
    }
    return arr;
}
      public static void main(String[] args) {
      
        int[]arr={1,2,3};//{3, 1,2};// {3,2,1};//{3, 4, 2, 5, 1};=>{3,4,5,1,2}//{2,4,1,7,5,0};=>{2,4,5,0,1,7}
        int[]answer = nxtPermutation(arr);
        for(int i:answer)
        {
            System.out.print(i+" ");
        }
  }
}
      
   
