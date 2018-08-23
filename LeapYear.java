import java.util.Scanner;

class LeapYear
{
 public static void main(String args[])
 {
  Scanner x = new Scanner(System.in);
  int year1,year2;
  System.out.print("Enter Year 1: ");
  year1=x.nextInt();
  System.out.print("Enter Year 2: ");
  year2=x.nextInt();
  x.close();
  System.out.print("Leap years between " + year1 + " and " + year2 + " are : ");
  for( ; year1<=year2 ; year1++)
  {
   if( (year1%4==0 && year1%100!=0) || (year1%400==0) )
    System.out.print(year1 + " ");
  }
 }
}
  
