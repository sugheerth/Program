import java.util.Scanner;

class P6
{
 public static void main(String args[])
{
 int n,i=0;
 Scanner x = new Scanner(System.in);
 System.out.println("Enter Array size : ");
 n=x.nextInt();
 System.out.println("Enter elements : ");
 int arr[]=new int[10];
 while(i<n)
 {
  arr[i]=x.nextInt();
  i++;
 }
 i--;
 System.out.println("Last Element : "+arr[i]);

 
}
}
