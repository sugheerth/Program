import java.util.Scanner;

class ArrSort
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
 


 asc(arr,n);
 System.out.println("Array sorted in Ascending order : ");

 i=0;
 while(i<n)
 {
  System.out.println(" "+arr[i]);

  i++;
 }
  System.out.println("Array sorted in Descending order : ");

 i=n-1;
 while(i>=0)
 {
  System.out.println(" "+arr[i]);

  i--;
 }
x.close();
}
 

public static void asc(int arr[],int n)
{
 int i=0,j=0,temp;
 for(i=0;i<n;i++)
  for(j=0;j<n-i-1;j++)
  {
   if(arr[j]>arr[j+1])
    {
     temp = arr[j];
     arr[j] = arr[j+1];
     arr[j+1] = temp;
    }
  }
} 

}
