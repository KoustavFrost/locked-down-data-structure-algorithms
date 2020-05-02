/*
* This is the Queue implementation using stacks (2 stacks)
* */
import java.util.*;
class QueueUsingStack
{
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    QueueUsingStack()
    {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    // Inserting an element into queue
    public void enQueue(int n)
    {
        // If stack1 is not empty then empty it in the stack2
        while (!stack1.empty())
        {
            stack2.push(stack1.pop());
        }

        // Push the number in the stack1
        stack1.push(n);

        // Re-push the elements from the stack2 to stack1
        while (!stack2.empty())
        {
            stack1.push(stack2.pop());
        }
    }

    // Removing an element from the Queue
    public void deQueue()
    {
        if (stack1.empty()) {
            // Error is the stack1 is empty
            System.out.println("Error");
        } else {
            // pop the top element of the stack1
            stack1.pop();
        }
    }

    public void display()
    {
        System.out.println("Queue -> " + stack1);
//        System.out.println("Stack2 -> " + stack2);
    }

    public static void main(String[] args)
    {
        QueueUsingStack obj = new QueueUsingStack();
        obj.enQueue(5);
        obj.enQueue(9);
        obj.display();

        obj.deQueue();
        obj.display();
    }
}