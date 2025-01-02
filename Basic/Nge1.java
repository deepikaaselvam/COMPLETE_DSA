package Basic;
public class Nge1 {
    public static void nGE(int[]array)
    {
        int []NGE=new int[array.length];
  
        for(int i=0;i<array.length;i++)
        {
            int f1=1;
            for(int j=i+1;j<array.length;j++)
            {
                if(array[j]>array[i])
                {
                    NGE[i]=array[j];
                    System.out.print(NGE[i]+" ");
                    f1=0;
                    break;
                }
            }
            if(f1==1)
            {
                System.out.print("-1 ");
            }
        }
    }
    public static void main(String[] args) {
        int[]array={6,0,8,1,3};
        nGE(array);
    }
    
}
