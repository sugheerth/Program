import java.util.Scanner;

class P14
{

 
 public static void main(String args[])
 { Scanner x = new Scanner(System.in);
  char ch='n',c='s';
  do
  {
   System.out.println("Enter the character to be displayed: ");
   c=x.next().charAt(0);
   System.out.println("Enter Number of times: ");
   int n = x.nextInt();
   int i=0;

   while(i++<n)
   System.out.print(c);

   System.out.println("\nContinue?(y/n) :");
   ch=x.next().charAt(0);
   
  }while(ch=='y'||ch=='Y');
  x.close();
 }

}
