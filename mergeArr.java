/*import java.util.ArrayList;
 public class mergeArr {
    public static ArrayList<Integer> mergeArray(int[]nums1,int[]nums2)
    { //With Extra Spaces
        ArrayList<Integer>list=new ArrayList<>();
        int i=0,j=0;
        while(i<nums1.length && j< nums2.length)
        {
            if(nums1[i]==nums2[j])
            {
                list.add(nums1[i]);
                list.add(nums2[j]);
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j])
            {
                list.add(nums1[i]);
                i++;
            }
            else{
                list.add(nums2[j]);
                j++;
            }
        }
        while(i<nums1.length)
        {
            list.add(nums1[i]);
            i++;
        }
        while(j<nums2.length)
        {
            list.add(nums2[j]);
            j++;
        }

        return list;

    }

     public static void main(String[] args) {
         int[]array1={1,3,4,4,5,7,7,8};//{1,3,5,7};//2,4,7,10
         int[]array2={6,7,9,9,9};//{0,2,6,8,9};//{2,3};
        ArrayList<Integer>ans=mergeArray(array1,array2);
        for(int i=0;i<ans.size();i++)
        {
            System.out.print(ans.get(i)+" ");
        }   
 }*/
    
 
import java.util.Arrays;
public class mergeArr{
    public static int[] withoutExtraSpaces(int[]n1,int[]n2)
    {
        int i=n1.length-1;
        int j=0;
        while(i>=0 && j<n2.length)
        {
            if(n1[i]>n2[j])
            {
                int temp=n1[i];
                n1[i]=n2[j];
                n2[j]=temp;
                i--;
                j++;
            }
            else{
                break; ///it is already in the sorted order
            }
        }
        Arrays.sort(n1);
        Arrays.sort(n2);
        return n1 ;
       

    }
    public static void main(String[]args)
    {
        int[]nums1={2,4,7,10};
        int[]nums2={2,3};
        withoutExtraSpaces(nums1,nums2);
        for(int i=0;i<nums1.length;i++)
        {
            System.out.print(nums1[i]+" ");
        }
        for(int i=0;i<nums2.length;i++)
        {
            System.out.print(nums2[i]+" ");
        }

    }

}

