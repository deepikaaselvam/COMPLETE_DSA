public class charArrPuzz {
    public static int[] productExceptSelf(int arr[])
     {
       int totalProductExceptFirst = 1;
       for(int i=1;i<arr.length;i++)
       {
          totalProductExceptFirst *= arr[i];
       }
       int[]res = new int[arr.length];
       res[0]=totalProductExceptFirst;
       int i=0;
       for(int j=1;j<arr.length;j++)
       {
           res[j]=((res[i])/(arr[j])) * arr[i];
           i++;
       }
        
        return res;
        // code here
    }
    public static void main(String[] args) {
        int arr[] = {12,0};
        int res[] = productExceptSelf(arr);
        for(int i=0;i<res.length;i++)
        {
            System.out.print(res[i]+" ");
        }
        
            
        
        
    }
    
}
