import java.util.Scanner;

class P8
{
 public static void main(String args[])
 {
  Scanner x = new Scanner(System.in);
  System.out.println("\nEnter Number : ");
  int n = x.nextInt();
  int i=1;
  while(i<13)
  {
   System.out.println("\n"+n+" X "+i+" = "+(n*i++) );
  }
 }
}
