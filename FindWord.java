import java.util.Scanner;

class FindWord
{
 public static void main(String args[])
 {
  Scanner x = new Scanner(System.in);
  String s, a;
  System.out.print("Enter the Sentence : ");
  s=x.nextLine();
  System.out.print("Enter the word : ");
  a=x.next();
  x.close();
  if(searchword(s,a))
   System.out.println("Word is Present");
  else
   System.out.println("Word is Not Present"); 
 }
 public static boolean searchword(String s, String a)
 {
  for(int i=0;i<s.length();i++)
  {
   int j=0;
   if( chkchar(s,i,a,j) )
       return true;
  }
  return false;
 }
  public static boolean chkchar(String s,int i,String a, int j)
 {
  boolean chk=true;
  if(j<a.length())
  {
   if(s.charAt(i)==a.charAt(j))
     chkchar(s,++i,a,++j);
   else
    chk=false;
  }
  return chk;
 }
 
}     
  
  
