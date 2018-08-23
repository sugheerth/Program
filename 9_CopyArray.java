import java.util.Scanner;

class P9
{
 public static void main(String args[])
{
 int n,i=0;
 Scanner x = new Scanner(System.in);
 System.out.println("Enter Array size : ");
 n=x.nextInt();
 System.out.println("Enter elements : ");
 int arr[]=new int[10];
 int arr2[]=new int[10];
 while(i<n)
 {
  arr[i]=x.nextInt();

  i++;
 }
 
 copycontent(arr,arr2,n);
 System.out.println("Content of Array 2 : ");
 i=0;
 while(i<n)
 {
  System.out.println(" "+arr[i]);

  i++;
 }
}
 public static void copycontent(int a[],int b[],int n)
{
 int i=0;
 while(i<n)
 {
  b[i]=a[i];

  i++;
 }
} 

}
