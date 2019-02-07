import java.util.Scanner;

class MyString
{
	String string;
 
	
        
        public String concat(String str)
        {
                char array[] = new char[string.length() + str.length()];
                char arr[] = string.toCharArray(); 
                char arr2[] = str.toCharArray();      
                for(int i=0;i<arr2.length+arr.length;i++)
                {
                        if(i<arr.length)
                 	  array[i]=arr[i];
                        else if(i<arr.length+arr2.length)
                          array[i]=arr2[i-arr.length]; 
                }
                String string2 = new String(array);
                string = string2;
                return string;
        }
          
      
        public char charAt(int index)
        {
                char arr[] = string.toCharArray(); 
                return arr[index];      
                
        }
        
        public boolean endsWith(String suffix)
        {
                char arr[] = string.toCharArray(); 
                char arr2[] = suffix.toCharArray();
                if(string.length()<suffix.length())
                return false;
                      
                for(int i=0;i<arr2.length;i++)
                {
                 	if(arr[arr.length-i-1]!=arr2[arr2.length-i-1])
                           return false;

                }
                return true;
        }
         
        public static String copyValueOf(char[] data)
        {
         	String string2 = new String(data);
                
                return string2;
        }

        public int indexOf(String str)
        {
                char arr[] = string.toCharArray(); 
                char arr2[] = str.toCharArray();
                int j=1;
                for(int i = 0; i < arr.length; i++)
                 {
                           if(arr[i]==arr2[0])
                            {
                             	for( j=1; j<arr2.length; j++ )
                              	if( arr[i+j] != arr2[j] )
                                 break;

                            	if(j==arr2.length)
                              	return i;
                            }

                 }
                return -1;
        } 
                
         public boolean startsWith(String prefix)
        {
                char arr[] = string.toCharArray(); 
                char arr2[] = prefix.toCharArray();
                if(string.length()<prefix.length())
                return false;
                      
                for(int i=0;i<arr2.length;i++)
                {
                 	if(arr[i]!=arr2[i])
                           return false;

                }
                return true;
        }

        public String substring(int beginIndex)
        {
                char arr[] = string.toCharArray(); 
                if(beginIndex>string.length())
                 {
                  	return "Invalid Input";
                 }  
                char arr2[] = new char[string.length()-beginIndex];
                for(int i = beginIndex; i < arr.length; i++)
                 {
                           arr2[i-beginIndex]=arr[i];
                 }
                String sub = new String(arr2);
                return sub;
        } 


        public static void main(String args[])
        {
          
          char ch = 'y';
	  do
  	  {
		  System.out.println("\nEnter the String : ");
		  Scanner get = new Scanner(System.in);
        	  String str = get.next();
		  MyString newString = new MyString(str);
                  while(ch== 'y'||ch=='Y')
                  {
 		  	System.out.println("\n1. Append String\n2.Find character at index \n3. Find if it ends with a substring\n4. Copy array\n5. Find index of substring\n6. Find if it starts with a substring\n7. Return substring\nEnter choice : ");
	          	int x=get.nextInt();
		  	switch(x)
   	          	{
    				case 1 : System.out.print("\nEnter the string to be appended : " );
                        	         str = get.next();
                        	         newString.concat(str);
                        	         System.out.println("\nAppended string : " + newString.string);
             				 break;
    				case 2 : System.out.print("\nEnter index : ");
                                         int index = get.nextInt();
                                         System.out.println("\nCharacter at "+index+" : "+newString.charAt(index));
             				 break;
    				case 3 : System.out.print("\nEnter the substring to be checked : " );
                        	         str = get.next();
                            	         System.out.println(newString.endsWith(str));
            				 break;
    				case 4 : System.out.print("\nEnter the length of the array : " );
                        	         int size = get.nextInt();
                                         System.out.print("\nEnter the characters of the array : ");
                                         char arr[]=new char[size];
                                         for(int i=0;i<size;i++)
                                          arr[i]=get.next().charAt(0);
                        	         System.out.println("\nCopied : "+newString.copyValueOf(arr));
                                         break; 
                                case 5 : System.out.print("\nEnter the substring : " );
                        	         str = get.next();
                                         index = newString.indexOf(str);
                                         if(index!=-1)
                            	         System.out.println(index);
                                         else 
                                         System.out.println("\nSubstring not found");
            				 break; 
                                case 6 : System.out.print("\nEnter the substring to be checked : " );
                        	         str = get.next();
                            	         System.out.println(newString.startsWith(str));
            				 break; 
                                case 7 : System.out.print("\nEnter the index : " );
                        	         index = get.nextInt();
                            	         System.out.println(newString.substring(index));
            				 break;      
    				default : System.out.println("\nInvalid choice");
                        	          break;
                   	}
                        System.out.println("\nContinue? <y/n>  : ");
                        ch=get.next().charAt(0);
                   }

                   System.out.println("\nTry again? <y/n>  : ");
                   ch=get.next().charAt(0);

           }while(ch=='y' || ch=='Y');
	}
	
	public MyString(String input)
 	{
         	string = input;
        }
};


















