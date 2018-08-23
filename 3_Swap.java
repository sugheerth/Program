import java.util.Scanner;

class P3
{
 public static void main(String args[])
{
 int a,b;
 Scanner x = new Scanner(System.in);
 System.out.println("Enter A : ");
 a=x.nextInt();
 System.out.println("Enter B : ");
 b=x.nextInt();
 x.close();
 a=a+b;
 b=a-b;
 a=a-b;
 System.out.println("Interchanged\nA: "+a+"\nB: "+b);
}
}
