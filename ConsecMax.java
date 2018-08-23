import java.util.Scanner;

class ConsecMax
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
  
 
  for(i=0;i<n;i++)
    aux[arr[i]]++;
 
  int count1=1,count2=1;
  for(i=0;i<=max-1;i++)
    {
     if(aux[i]>=1 && aux[i+1]>=1)
        {
         count2++;
         if(count2>count1)
            count1=count2;
        }
    else
     count2=1;
    }
  System.out.println("\nMaximum consecutive elements : "+count1);
 }
}
  
  
