public class Peak {
    public static int peakElement(int[]arr)
    {
    
        if(arr.length==1)
        {
            return 0;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(i==0)
            {
                if(arr[i]>arr[i+1])
                {
                    return i;
                }
            }
            else if(i==arr.length-1)
            {
                if(arr[i-1]<arr[i])
                {
                    return i;
                }
            }
            else if(arr[i-1]<arr[i]&& arr[i]>arr[i+1])
            {
                return i; ///Give the correct index
            }
            
           
        }
        return -1;
    }
    public static void main(String[] args) {
        int[]array={1,2,3};//{1,2,4,5,7,8,3};
        boolean ans=peakElement(array)>0? true: false;
        System.out.println(ans);
    
    }
    
}
