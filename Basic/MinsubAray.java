package Basic;
public class MinsubAray {
    public static void main(String[] args) {
        int[]array={1,4,6,7,3,7,8,1};
        int sum=0;
        for(int i=0;i<array.length;i++)
        {
            int minimum=array[i];
            for(int j=i;j<array.length;j++)
            {
                minimum=Math.min(array[j],minimum);
                sum+=minimum;
            }

        }
        System.out.println(sum);
    }
}