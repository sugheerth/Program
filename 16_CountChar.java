
import java.util.Scanner;

class P16
{
 public static void main(String args[])
{
  Scanner x= new Scanner(System.in);
  String s = new String();
  System.out.println("Enter the String : ");
  s=x.next();
  int i=0, count=0;
  System.out.println("Enter the character to be counted :");
  char c = x.next().charAt(0);
  while(i<s.length())
 { 
  if(s.charAt(i)==c)
  count++;
  i++;
 }
  x.close();
  System.out.println("Count :" + count); 
 }
}
 
