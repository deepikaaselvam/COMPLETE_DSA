package POTD;
import java.util.ArrayList;
public class UnionArr {
    public static ArrayList<Integer> unionArray(int[]nums1,int[]nums2)
    {
        ArrayList<Integer>list = new ArrayList<>();
        for(int i=0;i<nums1.length;i++)
        {
            if(!list.contains(nums1[i]))
            {
                list.add(nums1[i]);
            }
        }
        for(int j=0;j<nums2.length;j++)
        {
            if(!list.contains(nums2[j]))
            {
                list.add(nums2[j]);
            }
        }

        return list;

    }
    public static void main(String[] args) {
        int[]array1= {1,1,2,3,4};
        int[]array2={2,3,4,4,5,6};
       ArrayList<Integer> ans = unionArray(array1,array2);
       for(int i=0;i<ans.size();i++)
       {
            System.out.print(ans.get(i)+" ");
       }
    }
    
}
