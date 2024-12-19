package POTD;

import java.util.ArrayList;

public class GFGDec2 {
    public static int[] sort0s1s2s(int[]arr)
    {
        ArrayList<Integer>l1 = new ArrayList<>();
        ArrayList<Integer>l2 = new ArrayList<>();
        ArrayList<Integer>l3 = new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                l1.add(arr[i]);
            }
            if(arr[i]==1)
            {
                l2.add(arr[i]);
            }
            if(arr[i]==2)
            {
                l3.add(arr[i]);
            }
        }
        int ans[]  = new int[arr.length];
        for(int i=0;i<l1.size();i++)
        {
            ans[i]=l1.get(i);
        }
        for(int i=l1.size();i<(l1.size()+l2.size());i++)
        {
            ans[i]=l2.get(i-l1.size());
        }
        for(int i=(l1.size()+l2.size());i<(l1.size()+l2.size()+l3.size());i++)
        {
           ans[i]=l3.get(i-(l1.size()+l2.size())); 
        }
        return ans;
        // code here
    }
    public static void main(String[] args) {
        int[]array={0,1,2,0,1,2};
        int[]answer=sort0s1s2s(array);
        for(int i=0;i<answer.length;i++)
        {
            System.out.print(answer[i]+" ");
        }
    }
    
}
