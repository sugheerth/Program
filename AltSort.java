import java.util.Scanner;

class AltSort
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
  
  for(int i=0;i<n;i++)
  {
   int max= arr[i];
   int min=arr[i];
   int pos = i;
   for(int j=i;j<n;j++)
    {
     if(i%2==0)
      {
       if(arr[j]>max)
       {
        max=arr[j];
        pos=j;
       }
      }
     else
      {
       if(arr[j]<min)
       {
        min=arr[j];
         pos=j;
       }
      }
     }
    int temp = arr[pos];
    arr[pos]=arr[i];
    arr[i]=temp;
    
  }
  System.out.println("\nArranged : ");
  for(int i=0;i<n;i++)
    System.out.println(arr[i]);
}
}
  


  
    
