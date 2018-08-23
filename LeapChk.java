import java.util.Scanner;

class LeapChk
{
 public static void main(String args[])
 {
  String s;
  Scanner x = new Scanner(System.in);
  System.out.print("Enter the date (dd/mm/yyyy) : ");
  s = x.next();
  int n = (s.charAt(6)-48)*1000 + (s.charAt(7)-48)*100 + (s.charAt(8)-48)*10 + (s.charAt(9)-48);
  if( (n%4==0 && n%100!=0) || (n%400==0) )
    System.out.print( n + " is a leap year");
  else
    System.out.print( n + " is not a leap year");
 }
}
