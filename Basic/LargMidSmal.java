package Basic;

public class LargMidSmal {
    public static void main(String[] args) {
        int num1= 10;
        int num2=9;
        int num3=8;int largest=0,smallest=0,middle=0;

        if(num1>num2&& num1>num3)
        {
            largest=num1;
        }
        if(num2>num1 && num2>num3)
        {
            largest=num2;
        }
        if(num3>num1 && num3>num2)
        {
            largest=num3;
        }
        if(num1<num2&& num1<num3)
        {
            smallest=num1;
        }
        if(num2<num1 && num2<num3)
        {
            smallest=num2;
        }
        if(num3<num1 && num3<num2)
        {
            smallest=num3;
        }
        
        if(num1!=largest && num1!=smallest)
        {
            middle=num1;
        }
        if(num2!=largest && num2!=smallest)
        {
            middle=num2;
        }
        if(num3!=largest && num3!=smallest)
        {
            middle=num3;
        }
        System.out.println(largest+" "+smallest+" "+middle);
       
    }
  
    
}
