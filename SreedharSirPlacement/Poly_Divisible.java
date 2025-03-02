package SreedharSirPlacement;
public class Poly_Divisible {
    private static void poly_divisible_helper(int[]used ,int work_for_Value,int value)
    {
        if(work_for_Value==used.length)
        {
            System.out.println(value);
            return;
        }
        // int value =0;
        for(int ind=1;ind<used.length;ind++)
        {
            if(used[ind]==0 && ((value*10+ind)%work_for_Value)==0)
            {
                used[ind]=1;
                poly_divisible_helper(used,work_for_Value+1,(value*10 +ind));
                used[ind]=0;
                
            }
        }
    }
    public static void poly_divisible_no(int baseNo)
    {
        //arm length
        if(baseNo%2!=0)
        {
            return;
        }
        if(baseNo ==1)
        {
            System.out.println(0);
            return;
        }
        if(baseNo==2)
        {
            System.out.println(1);
            return;
        }
 
        //pass an environment
        int[]used = new int[baseNo];
        //call an helper function recursively ,initiate it!
        poly_divisible_helper(used,1,0);
    }
    public static void main(String[] args) {
        int Base = 10;
        poly_divisible_no(Base);

    }
    
}
