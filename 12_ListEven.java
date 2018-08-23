
class P12
{
 public static void main(String args[])
 {
  int i=1;
  while(i<101)
  {
   if(ifeven(i))
   System.out.print(i +" ");
   i++;
  }
  
 }

 public static boolean ifeven(int n)
 {
   if(n%2==0)
   return true;
   else
   return false;
 }

 
  
}
