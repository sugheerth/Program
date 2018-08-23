import java.util.Scanner;

class Reverse
{
 public static void main(String args[])
{
 Scanner get = new Scanner(System.in);
  System.out.println("\nEnter string : ");
  String s = get.nextLine();
  char arr[]=new char[s.length()];
  int j=s.length()-1, i=0;
   while(i<s.length())
   {
    if(s.charAt(i)>='0' && s.charAt(i)<='9' || s.charAt(i)>='A' && s.charAt(i)<='Z' || s.charAt(i)>='a' && s.charAt(i)<='z')
      {
        if(s.charAt(j)>='0' && s.charAt(j)<='9' || s.charAt(j)>='A' && s.charAt(j)<='Z' || s.charAt(j)>='a' && s.charAt(j)<='z')
          {
           arr[i]=s.charAt(j);
           arr[j]=s.charAt(i); 
           i++;
           j--;
           
          }
        else
         {
          arr[j]=s.charAt(j); 
          j--;
         }
       }
    else
      {
       arr[i]=s.charAt(i); 
       i++;
      }
    }
  System.out.println("\nReversed string : ");
  for(i=0;i<s.length();i++)
  System.out.print(arr[i]);
}
}
  
    
    

