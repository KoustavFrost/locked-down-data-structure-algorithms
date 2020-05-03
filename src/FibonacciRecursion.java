/*
* Program to print the Fibonacci series using recursion
* */
class FibonacciRecursion
{
    public static void main(String[] args) {
        FibonacciRecursion obj = new FibonacciRecursion();
        obj.fibo(10);
    }

    public int fibo(int n)
    {
        if (n <= 1)
            return n;

        return fibo(n - 1) + fibo(n - 2);
    }
}