import java.util.Scanner;

class P7
{
 public static void main(String args[])
{
 int n,i=0;
 Scanner x = new Scanner(System.in);
 System.out.println("Enter Array size : ");
 n=x.nextInt();
 System.out.println("Enter elements : ");
 int arr[]=new int[10];
 arr[i++]=x.nextInt();
 int min,max;
 min=max=arr[0];
 while(i<n)
 {
  arr[i]=x.nextInt();
  if(arr[i]>max)
  max=arr[i];
  if(arr[i]<min)
  min=arr[i];
  i++;
 }
 System.out.println("Max : "+max+"Min :"+min);

 
}
}
