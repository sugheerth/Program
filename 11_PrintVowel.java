
import java.util.Scanner;

class P11
{
 public static void main(String args[])
{
 Scanner x= new Scanner(System.in);
 String s = new String();
 System.out.println("Enter the String : ");
 s=x.next();
 int i=0;
 System.out.println("\nVowels in the string :");
 while(i<s.length())
{ 
 switch(s.charAt(i))
 {
  case 'a':
  case 'e':
  case 'i':
  case 'o':
  case 'u': System.out.println(" "+s.charAt(i));
            break;
 }
 i++;
}
x.close();
}
}
 
