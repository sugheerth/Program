import java.util.Scanner;

class NonDecreasing
{
 public static void main(String args[])
{
 Scanner get = new Scanner(System.in);
 System.out.print("\nEnter the number of elements : ");
 int size = get.nextInt(),count = 0;
 int[] array = new int[size];
 System.out.print("\nEnter the elements : ");
 for(int iterator1 = 0; iterator1 < size; iterator1++)
 {
  array[iterator1]=get.nextInt();
 }
 boolean check = true;
 for(int iterator1 = 0; iterator1 < size-1; iterator1++)
 {
  if(array[iterator1]>array[iterator1+1])
   count++;
  if(count>1)
   {
    check = false;
    break;
   }
 }
 System.out.print("\n" + check);

 }
 }
 
