import java.util.Scanner;

class Factorial
{
 public static void main(String args[])
 {
  Scanner x = new Scanner(System.in);
  int n,fact=1;
  System.out.print("Enter the number: ");
  n=x.nextInt();
  System.out.print(n+"! = ");
  x.close();
  
  for( ; n>1 ; n--)
  {
   fact*=n;
  }
   
  System.out.print(fact);
 }
}
  
