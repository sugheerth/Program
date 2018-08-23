import java.util.Scanner;

class PrintOnce
{
 public static void main(String args[])
 {
  Scanner get = new Scanner(System.in);
  System.out.print("\nEnter array size : ");
  int n=get.nextInt(), arr[]=new int[n], i=0;
  System.out.print("\nEnter array elements : ");
  for(i=0;i<n;i++)
  arr[i]=get.nextInt(); 
   
  int max=arr[0];
  for(i=0;i<n;i++)
   if(arr[i]>max)
      max=arr[i];
  int aux[]=new int[max+1];
  
  System.out.print("\nThe elements with two occurences are : ");
  for(i=0;i<n;i++)
    {
     aux[arr[i]]++;
     if(aux[arr[i]] == 2)
      System.out.print(" "+arr[i]); 
    }
 }
}
  
  
