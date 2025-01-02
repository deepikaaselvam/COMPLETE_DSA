package Contest;
import java.util.Arrays;
public class Greed1 {
    public static int assignCookies(int[]Parent,int[]Children)
    {
        int r=0;int l=0;
        Arrays.sort(Parent);
        Arrays.sort(Children);
        while(l<Children.length && r<Parent.length)
        {
            if(Parent[l]>=Children[r])
            {
               
                r++;
            }
           l++;
            

        }
        return (r);
    }
    public static void main(String[] args) {
        int[]parent={4,2,1,2,1,3};
        int[]children={1,5,3,3,4};
        int answer= assignCookies(parent,children);
        for(int i=0;i<answer;i++)
        {
            System.out.print(children[i]+" ");
        }
    }
    
}
