import java.util.Scanner;

class P20
{
 
 
 public static void main(String args[])
 {
  Scanner x = new Scanner(System.in);
  System.out.print("Enter max number : ");
  int n = x.nextInt();
  int sum = 0;
  for(int i=1;i<=n;i++)
   {
    int p=1;
     for(int j=1;j<4;j++)
       p*=i;
    sum+=p;
   }
  System.out.println("Sum of cubes : " + sum);
  x.close();
 }
}
