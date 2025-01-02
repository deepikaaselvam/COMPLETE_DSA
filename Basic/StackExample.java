package Basic;
class Stack {
    private int maxSize;       // Maximum size of the stack
    private int[] stackArray;   // Array to hold stack elements
    private int top;            // Top of the stack

    // Constructor to initialize the stack
    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;               // Indicates an empty stack
    }

    // Push method to add an element to the top of the stack
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + value);
        } else {
            top=top+1;
            stackArray[top] = value;
        }
    }

    // Pop method to remove and return the top element of the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;          // Indicates an error
        } else {
            return stackArray[top--];
        }
    }

    // Peek method to view the top element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Nothing to peek.");
            return -1;          // Indicates an error
        } else {
            return stackArray[top];
        }
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return (top == -1);
    }

    // Check if the stack is full
    public boolean isFull() {
        return (top == maxSize - 1);
    }
}

public class StackExample {
    public static void main(String[] args) {
        Stack stack = new Stack(5); // Create a stack of size 5

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("Top element is: " + stack.peek()); // Prints 50

        System.out.println("Elements popped from stack:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}

