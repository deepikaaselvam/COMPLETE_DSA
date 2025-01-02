package Basic;
public class BminSub {
    public static void main(String[] args) {
        int[]array={1,4,6,7,3,7,8,1};int sum=0;
        int mod=(int)(1e9+7);
        for(int i=0;i<array.length;i++)
        {
            int mini=array[i];
          
            for(int j=i;j<array.length;j++)
            {
                mini=Math.min(mini,array[j]);
           
               sum+=(mini)%mod;
            }
            
        }
        System.out.print(sum+" ");
    }
    
}
