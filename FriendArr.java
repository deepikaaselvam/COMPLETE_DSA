public class FriendArr {
    public static int calculateFriendliness(int[] arr) {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
               // if(i==arr.length-1)
            // {
            //     sum+=Math.abs(arr[i]-arr[(i+1)%n]);
            // }
            // else
            // {
            //     sum+=Math.abs(arr[i]-arr[i+1]);
            // }


            //shorter form 
            sum += (i==arr.length-1)? Math.abs(arr[i]-arr[(i+1)%arr.length]) : Math.abs(arr[i]-arr[i+1]);
        }
        return sum;
    }
    public static void main(String[] args) {
        int[]array={4,1,5};
        int answer=calculateFriendliness(array);
        System.out.println(answer);
        
    }
    
}
