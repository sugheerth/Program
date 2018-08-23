import java.util.Scanner;

class P4
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
 if(a>b)
 System.out.println("A>B");
 else if(b>a)
 System.out.println("B>A");
 else
 System.out.println("A=B");
}
}
