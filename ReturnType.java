import java.util.Scanner;


class ReturnType
{
	public static void returnVoid()
	{
		return ;
	}

	public static String[] returnStringArray()
	{
		Scanner get = new Scanner(System.in);
		System.out.print("\nEnter the number of strings : ");
		int size = get.nextInt();
		String str[] = new String[size];
		System.out.print("\nEnter the strings : ");
		for(int i = 0; i<size ; i++)
		{
			str[i] = get.next();
		}
		return str;
	}

	public static int[] returnIntArray()
	{
		Scanner get = new Scanner(System.in);
		System.out.print("\nEnter the number of integers : ");
		int size = get.nextInt();
		int array[] = new int[size];
		System.out.print("\nEnter the integers : ");
		for(int i = 0; i<size ; i++)
		{
			array[i] = get.nextInt();
		}
		return array;
	}

	public static void printNos(int num1, int num2)
	{
		System.out.println("The numbers are "+num1+" and "+num2);
	}

	public static void main(String args[])
	{
		Scanner get = new Scanner(System.in);
		char ch = 'y';
		do
		{
			 System.out.println("\n1. Return void\n2.Return String array\n3.Return Int array\n4.Print numbers\nEnter choice : ");
  			 int x=get.nextInt();
  			 switch(x)
 			 {
    				case 1 : returnVoid();
        	     			 break;
    				case 2 : String str[] = returnStringArray();
        	      			 break;
    				case 3 : int arr[] = returnIntArray();
        	     			 break;
   				case 4 : System.out.print("\nEnter two numbers : ");
					 printNos(get.nextInt(),get.nextInt());     
					 break;																      
    				default : System.out.println("\nInvalid choice");
        	      			  break;
 			 }
   			 System.out.println("\nContinue?<y/n>  : ");
   			 ch=get.next().charAt(0);
  		}while(ch=='y' || ch=='Y');
	}
};























