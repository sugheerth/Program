
class ListOdd
{
 public static void main(String args[])
 {
  int i=1;
  while(i<101)
  {
   if(ifodd(i))
   System.out.print(i +" ");
   i++;
  }
  
 }

 public static boolean ifodd(int n)
 {
   if(n%2!=0)
   return true;
   else
   return false;
 }

 
  
}
