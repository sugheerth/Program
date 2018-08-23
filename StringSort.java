import java.util.Scanner;



 class StringSort
{
 public static void main(String args[])
 {
  Scanner x = new Scanner(System.in);
  System.out.print("\nEnter number of strings : ");
  int n = x.nextInt();
  String s[] = new String[n];
  for(int i=0;i<n;i++)
  {
   s[i]=x.next();
  }
  x.close();
  sortstr(s,n);
  
  System.out.println("\nStrings in ascending order : ");
  for(int i=0;i<n;i++)
  {
   System.out.println(s[i]);
  }
 }

 public static int strcmp( String a, String b)
{
 int l=a.length();
 if(b.length()<l)
   l = b.length();
 for(int i=0;i<l;i++)
 {
  if(a.charAt(i)!=b.charAt(i))
  {
   if(a.charAt(i)>b.charAt(i))
     return 1;
   else
     return -1;
  }
 }
 return 0;
}

public static void sortstr(String s[],int n)
{
 int i=0,j=0;
 String temp;
 for(i=0;i<n;i++)
  for(j=0;j<n-i-1;j++)
  {
   if(strcmp(s[j],s[j+1])>0)
    {
     temp = s[j];
     s[j] = s[j+1];
     s[j+1] = temp;
    }
  }
}

}





