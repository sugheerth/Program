import java.util.Scanner;

class Fibonacci
{
 public static void main(String args[])
 {
  Scanner x = new Scanner(System.in);
  System.out.println("Enter the number: ");
  int n = x.nextInt();
  int i=2,a=0,b=1;
  System.out.println("Fibonacci Series : ");
  System.out.print(""+a+","+b);
  while(i<n)
  {
   b=a+b;
   a=b-a;
   i++;
  
   System.out.print(","+b);
  }
 x.close();
 }
}
