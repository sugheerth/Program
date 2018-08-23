import java.util.Scanner;

class MatrixPathCalc
{
  public static void main(String args[])
 {
  Scanner get = new Scanner(System.in);
  System.out.print("\nEnter the number of rows and columns of the matrix : ");
  int n = get.nextInt(), m = get.nextInt();
  int pathCount = factorial(n-1+m-1)/(factorial(n-1)*factorial(m-1));
  System.out.print("\nThe number of ways in which the last element can be reached is : " + pathCount);
 }

 public static int factorial(int n)
 {
  int fact =1;
  for( ; n>1 ; n--)
  {
   fact*=n;
  }
  return fact;
 }
}
