import java.util.Scanner;

class MaxProduct
{
 public static void main(String args[])
 {
  Scanner get = new Scanner(System.in);
  System.out.print("\nEnter the number of elements of the matrix : ");
  int n = get.nextInt();
  int arr[] = new int[n],i=0;
  for(i=0;i<n;i++)
    {
     arr[i] = get.nextInt();
    }
  int max1,max2,max3,min1,min2;
  max1=max2=max3=-2147483648; 
  min1=min2=2147483647;
  for(i =0;i<n;i++)
    {
     if(arr[i]>max1)
        {
         max3=max2;
         max2=max1;
         max1=arr[i];
        }
     else if(arr[i]>max2)
           {
            max3=max2;
            max2=arr[i];
           }
          else if(arr[i]>max3)
               max3=arr[i];

    if(arr[i]<min1)
        {
         min2=min1;
         min1=arr[i];
        }
     else if(arr[i]<min2)
           min2=arr[i];
    }
   int max_product=0;
   if(min1*min2*max1 > max1*max2*max3)
   max_product = min1*min2*max1;
   else
   max_product = max3*max2*max1;
   System.out.println("\nMaximum Product of three numbers : "+max_product);
  
 }
}
           
