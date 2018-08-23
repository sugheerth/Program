import java.util.Scanner;

class DecToBin
{
 public static void main(String args[])
 {
  Scanner x = new Scanner(System.in);
  System.out.print("Enter the number : ");
  int n = x.nextInt(),i=1;
  x.close();
  long num =0;
  while(n>0)
  {
   num=n%2*i+num;
   n/=2;
   i*=10;
  }
  System.out.print("Binary format : "+num);
 }
}
