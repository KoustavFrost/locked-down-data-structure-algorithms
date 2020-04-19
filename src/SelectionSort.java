import java.util.*;
class SelectionSort
{
    public static void main(String[] args)
    {
        int i, j, n, tmp, pos = 0;
        Scanner br = new Scanner(System.in);
        System.out.println("Enter the limit --> ");
        n = br.nextInt();

        int[] ar = new int[n];

        System.out.println("Enter the array elements --> ");
        for (i = 0; i < n; i++)
            ar[i] = br.nextInt();

        // Sorting algorithm
        for (i = 0; i < n - 1; i++)
        {
            pos = i;
            for (j = i + 1; j < n; j++)
            {
                if(ar[j] < ar[pos])
                {
                    pos = j;
                }
            }
            tmp = ar[pos];
            ar[pos] = ar[i];
            ar[i] = tmp;
        }

        System.out.println("The sorted array is --> ");
        for (i = 0; i < n; i++)
            System.out.print(ar[i] + " ");
    }
}