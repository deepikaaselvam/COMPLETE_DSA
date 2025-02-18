package Basic;

public class ArrSort {
    public static boolean issortArray(int[]Arrayyy)
    {
        int cnt =0;
        for(int i=0;i<Arrayyy.length;i++)
        {
            if(Arrayyy[i]>=Arrayyy[(i+1)%Arrayyy.length])
            {
                cnt++;
            }
        }
        if(cnt>1)
        {
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int[]array={3,4,5,1,2};//{2,1,3,4};
        boolean ans= issortArray(array);
        System.out.println(ans);
    }
    
}
