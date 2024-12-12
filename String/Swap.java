package String;

public class Swap {
    public static void main(String[] args) {
       /*  int a=10;
        int b=20;
        int temp=a;
        a=b;
        b=temp;
        System.out.print(a+" "+b);
       */ 
      int[]array={10,20,30,35,40,20};
      int l=0,r=array.length-1;
      while(l<r)
      {
        int temp=array[l];
        array[l]=array[r];
        array[r]=temp;
      
      l++;
      r--;
      }
      
      for(int i=0;i<array.length;i++)
      {
          System.out.print(array[i]+" ");
      }
    }
   
    

    
}
