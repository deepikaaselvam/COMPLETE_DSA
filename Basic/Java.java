package Basic;

import java.util.Scanner;
import java.util.Arrays;
class Java
{
    String name;
    int age;
    String[]skills;
    Scanner sc=new Scanner(System.in);
    public  void call()
    {
        this.name="Deepika";
        this.age=19;
        this.skills=new String[5];
        for(int i=0;i<skills.length;i++)
        {
            skills[i]=sc.next();
           
        }
        System.out.println(Arrays.toString(skills));
        
    }
       public static void main(String[] args) {
        Java firstOne=new Java();
        firstOne.call();
        System.out.println(firstOne.name+" "+firstOne.age);
        

    }
}