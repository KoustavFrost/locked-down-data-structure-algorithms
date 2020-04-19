import java.util.*;
class BubbleSort
{
    int ar[];
    BubbleSort(int n)
    {
        ar = new int[n];
    }
    public void getArray()
    {
        Scanner br = new Scanner(System.in);
        System.out.println("Enter the array elements --> ");
        for (int i = 0; i < ar.length; i++)
        {
            ar[i] = br.nextInt();
        }
    }
    public void sort()
    {
        int i, j, temp, l = ar.length;
        for (i = 0; i < l - 1; i++)
        {
            for (j = 0; j < l - i -1; j++)
            {
                if (ar[j] > ar[j+1])
                {
                    temp = ar[j];
                    ar[j] = ar[j + 1];
                    ar[j + 1] = temp;
                }
            }
        }
    }
    public void display()
    {
        System.out.println("The array is --> ");
        for (int i = 0; i < ar.length; i++)
        {
            System.out.print(ar[i] + " ");
        }
    }
    public static void main(String[] args)
    {
        Scanner br = new Scanner(System.in);
        int len;
        System.out.println("Enter the length of the array --> ");
        len = br.nextInt();

        BubbleSort obj = new BubbleSort(len);
        obj.getArray();
        obj.display();
        obj.sort();
        obj.display();
    }
}