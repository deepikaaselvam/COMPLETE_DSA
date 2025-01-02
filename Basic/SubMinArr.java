package Basic;
import java.util.Stack;
public class SubMinArr {
    public static int subArrayMinimum(int[]array)
    {
        int nse[]=findNSE(array);
        int pse[]=findPSE(array);
        int total=0;
        int mod=(int)(1e9+7);
        for(int i=0;i<array.length;i++)
        {
            int right=nse[i]-i;
            int left=i-pse[i];
            total=(int)((total+(right*left*1l*array[i])%mod)%mod);
        }
        return total;

    }
    public static int[] findNSE(int[]array)
    {
        int[]nse=new int[array.length];
        Stack<Integer>stack=new Stack<>();
        for(int i=array.length-1;i>=0;i--)
        {
            while(!stack.isEmpty() && array[stack.peek()]>=array[i])
            {
                stack.pop();
            }
            nse[i]=stack.isEmpty()?array.length:stack.peek();
            stack.push(i);
        }
        return nse;
    }
    public static int[] findPSE(int[]array)
    {
        int[]pse=new int[array.length];
        Stack<Integer>stack=new Stack<>();
        for(int i=0;i<array.length;i++)
        {
            while(!stack.isEmpty()&& array[stack.peek()]>array[i])
            {
                stack.pop();
            }
            pse[i]=stack.isEmpty()?-1:stack.peek();
            stack.push(i);
        }
        return pse;
    }

    public static void main(String[] args) {
        int[]array={1,4,6,7,3,7,8,1};
        int answer= subArrayMinimum(array);
        System.out.print(answer+" ");
    }
    
}
