import java.util.Scanner;

class CheckEq
{
 public static void main(String args[])
 {
  boolean chk=true;
  int count=0;
  Scanner get = new Scanner(System.in);
  System.out.println("\nEnter string : ");
  String s = get.nextLine();
  for(int i=0;i<s.length();i++)
   {
    if(s.charAt(i)=='+'||s.charAt(i)=='-'||s.charAt(i)=='*'||s.charAt(i)=='/'||s.charAt(i)=='%'||s.charAt(i)=='^') 
     {
      if (s.charAt(i-1)>='0' && s.charAt(i-1)<='9' || s.charAt(i-1)>='A' && s.charAt(i-1)<='Z' || s.charAt(i-1)>='a' && s.charAt(i-1)<='z') 
        if(s.charAt(i+1) == '(' )        
         {
             continue;
         }
       else if(!(s.charAt(i+1)>='0' && s.charAt(i+1)<='9' || s.charAt(i+1)>='A' && s.charAt(i+1)<='Z' || s.charAt(i+1)>='a' && s.charAt(i+1)<='z'))
         {
          chk=false;
          break;
         } 
    }
    else if(s.charAt(i)==')')
       {
        count--;
        if(count<0)
        {
         chk=false;
         break;
        } 
       }
    else if(s.charAt(i)=='(')
      count++;
   
    else if((s.charAt(i)=='&' && s.charAt(i+1)=='&')||(s.charAt(i)=='|' && s.charAt(i+1)=='|'))
         {
      if(!( (s.charAt(i-1)>='0' && s.charAt(i-1)<='9' || s.charAt(i-1)>='A' && s.charAt(i-1)<='Z' || s.charAt(i-1)>='a' && s.charAt(i-1)<='z') && (s.charAt(i+2)>='0' && s.charAt(i+2)<='9' || s.charAt(i+2)>='A' && s.charAt(i+2)<='Z' || s.charAt(i+2)>='a' && s.charAt(i+2)<='z') ) )
      chk=false;
        }
    }
   
   if(count!=0)
    chk=false;
    

   if(chk)
    System.out.println("\nVaild");
   else
    System.out.println("\nInvaild"); 
  }
}
