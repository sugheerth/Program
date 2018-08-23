import java.util.Scanner;

class NumberCount
{
 public static void main(String args[])
 {
  Scanner get = new Scanner(System.in);
  System.out.println("\nEnter no. of elements : ");
  int n = get.nextInt();
  int arr[] = new int[n];
  System.out.println("\nEnter elements : ");
  for(int i=0;i<n;i++)
   arr[i]=get.nextInt();
  
  while(n>0)
  {
   int num =arr[0];
   System.out.print("\nNumber "+num+" : ");
   int count=0;
   for(int j =0;j<n;j++)
   {
   if(arr[j]==num)
   {
    count++;
    int k =j;
    while(k<n-1)
    {
     arr[k]=arr[k+1];
     k++;
    }
    n--;
    j--;
    
   //System.out.println("\ni " +i+" j "+j+" k "+k+" n "+n);
   }
   
   }
    System.out.println(count);
  }
 }
}
