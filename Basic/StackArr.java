package Basic;
public class StackArr {
    int[]array;
    int length;
    int top;
    public StackArr(int length)
    {
        this.length=length;
        this.array=new int[length];
        this.top=-1;

    }
    public void push(int value)
    {
        if(top<=length-1)
        {
            top=top+1;
            array[top]=value;
            System.out.println(array[top]);
        }
        else{
            System.out.println("Its full");
        }

    }
    public void pop()
    {
        if(top>=0){
            top=top-1;
        }
        else{
            System.out.println("Stack UnderFlow");
        }
    }
    public int peek()
    {
        return array[top];
    }
    public int size()
    {
        return top+1;
    }
    public static void main(String[] args) {
        StackArr s1=new StackArr(5);
        //pushing the element
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        //pop up the eleement
        s1.pop();
        //Top of the element
        System.out.println(s1.peek());
        //LEngth of the stack using arrau
        System.out.println(s1.size());
    }
}

