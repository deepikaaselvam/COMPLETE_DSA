package Patterns;

public class Tri {
    public static void main(String[] args) {
       /*int n=3;
        for(int i=0;i<n;i++)
        {
            for(int j=n-1;j>=i;j--)
            {
                System.out.print("  ");
            }
            for(int j=0;j<2*i+1;j++)
            {
                System.out.print(" 1 ");
            }
            for(int j=n-1;j>=i;j--)
            {
                System.out.print("  ");
            }
            System.out.println();
            
        }*/
        int n=5;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            for(int j=n-1;j>=1;j--)
            {
                System.out.print(" ");
            }
            for(int j=n-1;j>=1;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
