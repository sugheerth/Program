
class P10
{
 public static void main(String args[])
 {
  int i=100;
  while(i<201)
  {
   if(ifprime(i))
   System.out.print(i +" ");
   i++;
  }
  
 }

 public static boolean ifprime(int n)
 {
  boolean x=true;
  int i=2;
  while(i<n/2)
  {
   if(n%i==0)
   {
    x=false;
    return x;
   }
   i++;
  }
  return x;
 }

 
  
}
