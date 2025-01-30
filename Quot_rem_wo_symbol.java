import java.util.Scanner;
public class Quot_rem_wo_symbol {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int num1 =kbd.nextInt();
        int num2 =kbd.nextInt();
        int divisorvalue =num1;
        int remainder=0,quotient =0;
        int cnt=0;
        while(divisorvalue>=0)
        {
            divisorvalue=divisorvalue-num2;
            cnt++;
            if(divisorvalue<num2)
            {
                remainder=divisorvalue;
                quotient=cnt;
                break;
            }
            if(divisorvalue==0)
            {
                remainder=0;
                quotient=cnt;
                break;
            }
        }
        System.out.println("Quotient: "+quotient+"  Remainder: "+remainder);;
    kbd.close();
        
    }
    
}
