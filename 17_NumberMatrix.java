import java.util.Scanner;

class P17
{
 
 
 public static void main(String args[])
 {
  Scanner x = new Scanner(System.in);
  System.out.print("Enter order of matrix : ");
  int n = x.nextInt();
 
  for(int i=0;i<n;i++)
   {
     for(int j=1;j<n+1;j++)
     System.out.print((i*n+j)+" ");
     
     System.out.println(" ");
   }
  x.close();
 }
}
