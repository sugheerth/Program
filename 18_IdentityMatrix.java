import java.util.Scanner;

class P18
{
 
 
 public static void main(String args[])
 {
  Scanner x = new Scanner(System.in);
  System.out.print("Enter order of matrix : ");
  int n = x.nextInt();
 
  for(int i=0;i<n;i++)
   {
     for(int j=0;j<n;j++)
    if(i==j)
     System.out.print(1+" ");
    else
      System.out.print(0+" ");
     
     System.out.println(" ");
   }
  x.close();
 }
}
