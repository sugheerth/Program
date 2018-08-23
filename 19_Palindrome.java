import java.util.Scanner;

class P19
{
 
 
 public static void main(String args[])
 {
  Scanner x = new Scanner(System.in);
  System.out.print("Enter number : ");
  int num = x.nextInt();
  x.close();
  int numcopy=num,rev=0;
  while(num>0)
  {
   rev*=10;
   rev+=num%10;
   num/=10;
  }
  
  if(numcopy==rev)
  System.out.print("Number is a palindrome");
  else
  System.out.print("Number is not a palindrome");
  
 }

}
