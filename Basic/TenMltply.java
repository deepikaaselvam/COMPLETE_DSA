package Basic;

public class TenMltply {
    public static void main(String[] args) {
        /*  int num1=8;
        int num2=7;
        int i=1,j=1;
        int cnt=0;
        while(i<=10 && j<=10)
         {
             int ans1=num1*i;
             int ans2=num2*j;
             if(ans1<ans2)
             {
                 System.out.println(ans1);
                 i++;
             }
             else if(ans1==ans2)
             {
                 System.out.println(ans1);
                 i++;j++;
            }
             else{
                System.out.println(ans2);
                 j++;
             }
            cnt++;
            if(cnt==10)
            {
            break;
            }
        }*/
        int num1=3;
        int num2=7;
        int printCtr=1,val=1;
        while(printCtr<=10)
        {
            if(val%num1==0 || val%num2==0)
            {
                System.out.print(val+" ");
                printCtr++;
               
               
            }
            
            val++;
            
        }
    }
    
}
