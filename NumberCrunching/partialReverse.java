package NumberCrunching;

public class partialReverse {
    public static void main(String[] args) {
        int number =37529356;
        int pos =4;
        // int digits =(int) Math.log10(number);
        int positionExtract =(int)Math.pow(10,pos);
        int number2= (number)%positionExtract;
        int rev=0;int dig=0;
        int temp=number2;
        while(number2!=0)
        {
            dig=number2%10;
            rev=rev*10+dig;
            number2=number2/10;
        }
        number =(number-temp)+rev;
        System.out.println(number);
    
        
    }
   




    
}
