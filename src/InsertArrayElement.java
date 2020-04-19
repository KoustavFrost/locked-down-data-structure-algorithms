import java.util.*;
class InsertArrayElement
{
    public static void main(String args[])
    {
        Scanner br = new Scanner(System.in);
        int len, i, num, pos;

        System.out.println("Enter the limit of the array --> ");
        len = br.nextInt();

        int ar[] = new int[len + 1];

        System.out.println("Enter the array elements --> ");
        for (i = 0; i < len; i++) {
            ar[i] = br.nextInt();
        }

        System.out.println("Enter the element and the position to be inserted --> ");
        num = br.nextInt();
        pos = br.nextInt();

        for (i = len; i >= pos; i--) {
            ar[i] = ar[i - 1];
        }

        ar[pos - 1] = num;

        System.out.println("The array elements --> ");
        for (i = 0; i <= len; i++) {
            System.out.print(ar[i] + " ");
        }
    }
}