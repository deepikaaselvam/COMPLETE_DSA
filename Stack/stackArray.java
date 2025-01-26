package stack;
 class SecondClass {
    static int[]stack = new int[4];
    static int top =-1;
    public static int push(int element)
    {
        
        if(top >= stack.length-1)
        {
            System.out.println("Stack overflow");
            return -1;
        }
        else{
            top++;
            stack[top]=element;
        }
        return stack[top];
    }
    public static int pop()
    {
        if(top==-1)
        {
            System.out.println("Stack Underflow");
            return -1;
        }
        else{
            int element= stack[top];
            top--;
            return element;
        }
    }
}
public class stackArray{
    public static void main(String[] args) {
        int[]array={2,5,1,3};
        for(int i:array)
        {
            System.out.print(SecondClass.push(i)+" ");
        }
        System.out.println();
       SecondClass.push(67);
       //top element
       System.out.println(SecondClass.stack[SecondClass.top]);
       //popping
        while(SecondClass.top!=-1)
        {
            System.out.print(SecondClass.pop()+" ");
        }
        //chck underflow
        System.out.println();
        System.out.println(SecondClass.pop());
        

    }

}
   
    
