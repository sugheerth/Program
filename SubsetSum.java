import java.util.Scanner;

class SubsetSum
{
 public static void main(String args[])
 {
 int n,i=0;
 Scanner x = new Scanner(System.in);
 System.out.println("Enter Array size : ");
 n=x.nextInt();
 System.out.println("Enter elements : ");
 int arr[]=new int[n];
 int sum=0;
 while(i<n)
 {
  arr[i]=x.nextInt();
  sum+=arr[i];
  i++;
 }
 if(subsetSum(arr,n-1,sum,0)==0)
 System.out.println(true);
 else
 System.out.println(false);  
 }
 

 public static int subsetSum(int arr[], int pos, int sum, int newSum )
 {

  if(pos==0)
  {
  return Math.abs(sum-newSum);
  }
  else
  return Math.min(subsetSum(arr,pos-1,sum-arr[pos],newSum+arr[pos]), subsetSum(arr,pos-1,sum,newSum));
 }
}
  
  
