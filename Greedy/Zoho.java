package Greedy;

public class Zoho {
    public static void main(String[] args) {
        int number=1003;
        StringBuilder s1=new StringBuilder();
        while(number>0){
            int rem=number%10;
            if(rem==0)
            {
                rem=5;
            }
            s1.append(rem);
            number=number/10;
        }
        System.out.println(s1.reverse().toString());
       /*  int number=1001;
        int fin=0;
        int multiply=1;
        while(number>0)
        {
            int rem=number%10;
            
            if(rem==0)
            {
                rem = 5;
            }
            fin=fin+rem*multiply;
            multiply*=10;
            number=number/10;
        }
        System.out.println(fin);*/
        
    }
    
}
