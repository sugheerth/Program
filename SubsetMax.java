import java.util.Scanner;

class SubsetMax
{
 public static void main(String args[])
 { 
 Scanner get = new Scanner(System.in);
 System.out.print("\nEnter the size of the array : ");
 int size = get.nextInt(), arr[]=new  int[size],i=0;
 System.out.print("\nEnter the elements of the array : ");
 for(i=0;i<size;i++)
  arr[i]=get.nextInt();
 System.out.print("\nEnter the size of the subset : ");
 int k=get.nextInt();
 System.out.print("\nMax of the subsets : ");
 for(i=0;i<=size-k;i++)
  {
   int max = arr[i];
   for(int j=1;j<k;j++)
    if(arr[i+j]>max)
     max=arr[i+j];
   System.out.print(max+" ");
  }
 }
}
 
