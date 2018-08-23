import java.util.Scanner;

class PerfectNumber
{
 public static void main(String args[])
 {
  Scanner get = new Scanner(System.in);
  System.out.print("\nEnter n : ");
  int n = get.nextInt();
  int count=0;
  int i=1;
  while(true)
  {
   if(isPerfect(i))
    count++;
   if(count==n)
    break;
   i++;
  }
  System.out.println("\n"+i);
 }
 
 public static boolean isPerfect(int num)
 {
  int sum =0;
  while(num>0)
  {
   sum+=num%10;
   num/=10;
   if(sum>=10&&num>0)
    return false;
  }
  if(sum==10)
   return true;
  else
   return false;
 }
}
