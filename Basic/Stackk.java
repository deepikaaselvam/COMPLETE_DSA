package Basic;
import java.util.Stack;
public class Stackk {
       public static void push(int  ele,Stack<Integer>st,int top,int[]array)
        {
            top=top+1;
            array[top]=ele;
            System.out.print(array[top]+" ");
        }
        
       
       
    
    public static void main(String[] args) {
        Stack<Integer>stackk=new Stack<>();
        int top=-1;
        int[]array={6,3,7,9,1};
        int newArray[]=new int[array.length];
        for(int i=0;i<array.length;i++)
        {
            int element=array[i];
            push(element,stackk,top,newArray);
        
        }
        
       
        
       
        
        
    }
    
}
