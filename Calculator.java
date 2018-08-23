import java.util.Scanner;

class Calculator
{
 int a,b;
 public Calculator(int x, int y)
 {
  a=x;
  b=y;
 }
 public String add()
 {
  return String.valueOf(a+b);
 }
 public String sub()
 {
  return String.valueOf(a-b);
 }
 public String multi()
 {
  return String.valueOf(a*b);
 }
 public String div()
 { 
  if(b==0)
  return "\nDivision by 0";
  else
  return String.valueOf(a/b);
 }
 
 public static void main(String args[])
 {
  char ch = 'y';
  do
  {
  System.out.println("\nEnter two integers : ");
  Scanner get = new Scanner(System.in);
  int x = get.nextInt();
  int y = get.nextInt();
  Calculator cal = new Calculator(x,y);
  System.out.println("\n1. Add\n1.Subtract\n3.Multiplication\n4.Division\nEnter choice : ");
   x=get.nextInt();
   switch(x)
   {
    case 1 : System.out.println("\nResult : " + Integer.parseInt(cal.add()) );
             break;
    case 2 : System.out.println("\nResult : " + Integer.parseInt(cal.sub()) );
             break;
    case 3 : System.out.println("\nResult : " + Integer.parseInt(cal.multi()) );
             break;
    case 4 : try
              {
               System.out.println("\nResult : " + Integer.parseInt(cal.div()) );
               break;
              }
             catch (java.lang.NumberFormatException e)
              {
               System.out.println( "\nDivision by 0");
               break;
              }               
    default : System.out.println("\nInvalid choice");
              break;
   }
   System.out.println("\nContinue?<y/n>  : ");
   ch=get.next().charAt(0);
  }while(ch=='y' || ch=='Y');

 }
};
