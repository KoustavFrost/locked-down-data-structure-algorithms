/*
 * Testing the stack in utils package
 * Have Fun!
 * */
import java.util.*;
class StackJava
{
    public static void main(String[] args)
    {
        Stack<Integer> stack = new Stack<Integer>();
        System.out.println("Is stack empty ? -> " + stack.empty());
        stack.push(5);
        stack.push(45);
        System.out.println("The Stack after pushing 5 and 45 -> " + stack);
        stack.pop();
        System.out.println("The Stack after popping one element -> " + stack);
        stack.push(99);
        System.out.println("Is stack empty ? -> " + stack.empty());
        System.out.println("Peeking in the stack -> " + stack.peek());

        System.out.println("Is 99 present in the array? -> " + stack.search(99));
        System.out.println("Is 55 present in the array? -> " + stack.search(55));

    }
}