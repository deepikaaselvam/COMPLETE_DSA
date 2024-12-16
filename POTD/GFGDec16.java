package POTD;
// import java.util.ArrayList;   ///Run At first Stage😍
public class GFGDec16 {
   /* public static int  kthElementarray(int[]a1,int[]a2,int k) //Brute Force Approach
    {
        ArrayList<Integer>list = new ArrayList<>();
        int total=a1.length+a2.length;
        int i=0,j=0;
        while(i<a1.length && j<a2.length && total>0 )
        {
            if(a1[i]<=a2[j])
            {
                list.add(a1[i]);
                i++;
            }
            else{
                list.add(a2[j]);
                j++;
            }
        }
        while(i<a1.length)
        {
            list.add(a1[i]);
            i++;
        }
        while(j<a2.length)
        {
            list.add(a2[j]);
            j++;
        }
        for( i=0;i<list.size();i++)
        {
            if(i+1==k)
            {
                return list.get(i);
            }
        }
        return -1;
    }*/ 
    public static int kthElementarray(int[]a1,int[]a2,int k)
    {
        int i=0,j=0;int cnt=0;
        while(i<a1.length && j<a2.length)
        {
            if(a1[i]<=a2[j])
            {
                cnt++;
                if(cnt==k)
                {
                    return a1[i];
                }
                i++;

            }
            else{
                cnt++;
                if(cnt==k)
                {
                    return a2[j];
                }
                j++;
            }
        }
        while(i<a1.length)
        {
            cnt++;
            if(cnt==k)
            {
                return a1[i];
            }
           
            i++;
        }
        while(j<a2.length)
        {
            cnt++;
            if(cnt==k)
            {
                return a2[j];
            }
            
            j++;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[]array1={100, 112, 256, 349, 770};//{2,3,6,7,9};
        int[]array2={72, 86, 113, 119, 265, 445, 892};//{1,4,8,10};
        int k=7;
        int ans=kthElementarray(array1,array2,k);
        System.out.println(ans);
        // for(int i=0;i<ans.size();i++)
        // {
        //     System.out.print(ans.get(i)+" ");
        // }
    }
    
}
