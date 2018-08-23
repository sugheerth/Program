import java.util.Scanner;

class CharMatrix
{
 public static void main(String args[])
 {
  Scanner get = new Scanner(System.in);
  System.out.print("\nEnter the order of the matrix : ");
  int order = get.nextInt();
  char array[][] = new char[order][order];
  System.out.print("\nEnter the elements of the matrix : ");
  
  for(int iterator1 = 0;iterator1 <order; iterator1++)
   for(int iterator2 = 0; iterator2 < order; iterator2++)
    array[iterator1][iterator2]=get.next().charAt(0);
  
   System.out.print("\nEnter the word : ");
   String word = get.next();
   boolean check = false;
  for(int iterator1 = 0;iterator1 <order; iterator1++)
   for(int iterator2 = 0; iterator2 < order; iterator2++)
    {
      if(array[iterator1][iterator2] == word.charAt(0))
       if(array[iterator1][iterator2+1] == word.charAt(1))
        {
        check = true;
        int i=2;
        while(i<word.length())
         {
          if(array[iterator1][iterator2+i]!=word.charAt(i))
          {
           check = false;
           break;
          }
          i++;
         }
        if(check)
         {
          
          break;
         }
        }
       else if(array[iterator1+1][iterator2] == word.charAt(1))
        {
        check = true;
        int i=2;
        while(i<word.length())
         {
          if(array[iterator1+i][iterator2]!=word.charAt(i))
          {
           check = false;
           break;
          }
          i++;
         }
        if(check)
         {
          
          break;
         }
        }
      }
   System.out.println(" " + check);
   }
}
