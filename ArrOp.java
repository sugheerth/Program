import java.util.Scanner;

class ArrOp
{
 public static void main(String args[])
{
 int r1,r2,c1,c2,i=0,j=0;
 Scanner x = new Scanner(System.in);

 System.out.println("Array 1 :\nNumber of Rows : ");
 r1=x.nextInt();
 System.out.println("\nNumber of columns : ");
 c1=x.nextInt();
 System.out.println("\nArray 2 :\nNumber of Rows : ");
 r2=x.nextInt();
 System.out.println("\nNumber of columns : ");
 c2=x.nextInt();

 if(r1!=r2 && c1!=c2)
 {
  System.out.println("Operations not possible! ");
 }
 else
 {
  
 System.out.println("Enter elements of array 1: ");
 
 int arr[][]=new int[r1][c1];
 int arr2[][]=new int[r1][c2];
 int arr3[][]=new int[r1][c1];
 for(i=0;i<r1;i++)
 { 
  for(j=0;j<c1;j++)
   arr[i][j]=x.nextInt();
 }
 
 System.out.println("Enter elements of array 2: ");
 for(i=0;i<r2;i++)
 { 
  for(j=0;j<c2;j++)
   arr2[i][j]=x.nextInt();
 }

 char p='n';

 do
 {
 System.out.print("\n1. Addition\n2. Subtraction\n3. Multiplication\nEnter Operation : ");
 int ch=x.nextInt();
 
 switch(ch)
 {
  case 1 : addarr(arr,arr2,arr3,r1,c1);
           System.out.println("\nAdded matrix :");
           arrdisp(arr3,r1,c1);
           break;
  
  case 2 : subarr(arr,arr2,arr3,r1,c1);
           System.out.println("\nSubtracted matrix :");
           arrdisp(arr3,r1,c1);
           break;

  case 3 : if(r1!=c1)
           {
            System.out.println("Multiplication cannot be performed!");
            
           }  
           else
           {
           multarr(arr,arr2,arr3,r1);
           System.out.println("\nMultiplied matrix :");
           arrdisp(arr3,r1,c1);
           }
           break;
  default :System.out.println("\nIncorrect Choice");
           break;
 }
 System.out.println("\nContinue?(y/n) :");
   p=x.next().charAt(0);
       
}while(p=='y'||p=='Y');
}
x.close();

}


public static void arrdisp(int a[][], int r, int c)
{
 for(int i=0;i<r;i++)
 { System.out.print("\n");
  for(int j=0;j<c;j++)
   System.out.print(a[i][j] + " ");
 }
}


 public static void addarr(int a[][],int b[][],int c[][], int r1, int c1)
{
  for(int i=0;i<r1;i++)
 { 
  for(int j=0;j<c1;j++)
   c[i][j]= a[i][j] + b[i][j];
 }
} 

public static void subarr(int a[][],int b[][],int c[][], int r1, int c1)
{
  for(int i=0;i<r1;i++)
 { 
  for(int j=0;j<c1;j++)
   c[i][j]= a[i][j] - b[i][j];
 }
} 

public static void multarr(int a[][],int b[][],int c[][], int n)
{
 
 
  for(int i=0;i<n;i++)
  for(int j=0;j<n;j++)
  {
   c[i][j] = 0;
   for(int k=0;k<n;k++)
   {
    c[i][j]+= a[i][k]*b[k][j];
   }
   
  }

}

}
