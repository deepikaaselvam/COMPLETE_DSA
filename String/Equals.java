package String;
import java.util.Scanner;
public class Equals {
    public static String equalityCheck(String f)
    {
        if(f=="mango")
        {
            return "Yes";
        }
        return "No";
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        if(s=="paper")
        {
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        sc.close();
        String fruit="Mango";
        String answer= equalityCheck(fruit);
        System.out.println(answer);
        String s1="Apple";
        String s2="Apple";
        System.out.println(s1==s2);
    }
    
}
