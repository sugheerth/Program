import java.util.Scanner;

class Interval
{
 public static void main(String args[])
{
 Scanner get = new Scanner(System.in);
 System.out.print("\nEnter the number of intervals : ");
 int size = get.nextInt();
 int[][] intervals = new int[size][2];
 System.out.print("\nEnter the intervals : ");
 for(int i = 0; i < size; i++)
 {
  intervals[i][0]=get.nextInt();
  intervals[i][1]=get.nextInt();
 }

 System.out.print("\nModified intervals : ");
 for(int i = 0; i < size; i++)
 {
 
  for(int j = 0; j < size; j++)
  {
   if(i!=j)
   if(intervals[i][0]>=intervals[j][0] && intervals[i][0]<=intervals[j][1])
     if(intervals[i][1]<=intervals[j][1])
       {
            int k=i;
            while(k<size-1)
            {
              intervals[k]=intervals[k+1]; 
              k++;
            }
            size--;
            i--;
       
       }

    else
     {
      intervals[j][1]=intervals[i][1];
            int k=i;
            while(k<size-1)
            {
              intervals[k]=intervals[k+1]; 
              k++;
            }
            size--;
            i--;
     }
   
  }




  }

    for(int i = 0; i < size; i++)
 {
  System.out.print("\n "+ intervals[i][0]);
  System.out.print(" " + intervals[i][1]);
 }
 }
 }
 
