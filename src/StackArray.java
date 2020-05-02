/*
* This is just a stack implementation program using array.
* Java has its on implementation of stack in utils package but
* its good to know the basic concepts around.
* Have Fun!
* */
import java.util.*;
class StackArray
{
    int[] stack;
    int top;

    // Default constructor to initialize array
    StackArray()
    {
        stack = new int[5];
        top = 0;
    }

    // Function to push an array element into the stack
    public void pushElement(int n)
    {
        if (top >= (stack.length)) {
            System.out.println("Stack Overflow");
        } else {
            stack[top] = n;
            top++;
        }
    }

    // Function to pop an array element into the stack
    public void popElement()
    {
        if (top <= 0) {
            System.out.println("Stack Underflow");
        } else {
            stack[top] = 0;
            top--;
        }
    }

    // Function to print the stack
    public void printStack()
    {
        System.out.println("Stack: ");
        for (int i = 0; i < top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args)
    {
        StackArray obj = new StackArray();
        Scanner br = new Scanner(System.in);
        int ch;

        while (true) {
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Print");
            System.out.println("4. Quit");

            ch = br.nextInt();

            if (ch == 1) {
                System.out.print("Enter the number : ");
                int n = br.nextInt();
                obj.pushElement(n);
            } else if (ch == 2) {
                obj.popElement();
            } else if (ch == 3) {
                obj.printStack();
            } else if (ch == 4) {
                break;
            } else {
                System.out.println("Wrong Input !");
            }
        }
    }
}