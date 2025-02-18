package Basic;

public class lcmm {
    public static void main(String[] args) {
        int a = 33;
        int b = 15;
        int lcm;
        int multiplies =0;
        if(a%b==0)
        {
            lcm = a;
        } else {
            multiplies = a * 2;
            while(multiplies%b!=0)
            {
                multiplies+=a;
            }

        }
            lcm = multiplies;
            System.out.println("LCM : "+lcm);
        }
}
    

