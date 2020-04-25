/*
* A java program to remove the duplicate elements from an array.
* Time Complexity = O(n)
* Space Complexity = O(1)
*
* Is it possible to do it in reduced time?
* */
class RemoveDuplicate
{
    public int removeDuplicate(int ar[]) {
        int index = 0, i, temp = 0, len = ar.length;

        if(len == 0 || len == 1)
            return len;


        for (i = 0 ; i < len - 1; i++)
        {
            if (ar[i] != ar[i + 1])
                ar[index++] = ar[i];
        }
        ar[index++] = ar[len - 1];
        return index;
    }

    public static void main(String[] args)
    {
        int a[] = {1, 2, 2, 2, 3, 4, 4, 5, 5};
        RemoveDuplicate obj = new RemoveDuplicate();
        int n = obj.removeDuplicate(a);

        System.out.println("Index => "+n);
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }
}