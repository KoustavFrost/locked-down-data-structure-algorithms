import java.util.*;
class DeleteArrayElements
{
     public void deleteElement()
     {
         Scanner br = new Scanner(System.in);
         int len, i, pos;
         System.out.println("Enter the limit of the array --> ");
         len = br.nextInt();

         int ar[] = new int[len];

         System.out.println("Enter the array elements --> ");
         for (i = 0; i < len; i++) {
             ar[i] = br.nextInt();
         }

         System.out.println("Enter the position to be deleted --> ");
         pos = br.nextInt();

         for (i = pos - 1; i < (len - 1); i++) {
             ar[i] = ar[i + 1];
         }

         System.out.println("The array is ---> ");
         for (i = 0; i < (len - 1); i++) {
             System.out.print(ar[i] + " ");
         }
     }

     public static void main(String args[])
     {
         DeleteArrayElements obj = new DeleteArrayElements();
         obj.deleteElement();
     }
}