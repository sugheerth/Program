import java.util.Scanner;

class Car
{
	int plateNo;
        int modelNo;
        String brand;
        String colour;
        String type;
        float price;

        public Car()
        {
		plateNo = 0;
		modelNo = 0;
		brand = new String();
		colour = new String();
		type = new String();
		price = 0.0f;
	}

	public Car(int plateNo, int modelNo, String brand, String colour, String type, float price)
	{
		this.plateNo = plateNo;
		this.modelNo = modelNo;
		this.brand = brand;
		this.colour = colour;
		this.type = type;
		this.price = price;
	}

	public void getCarDetails()
	{
		System.out.print("\nEnter the Car details :\nBrand : ");
		Scanner get = new Scanner(System.in);
		brand = get.next();
		System.out.print("\nModel no : ");
		modelNo = get.nextInt();
		System.out.print("\nColour : ");
		colour = get.next();
		System.out.print("\nType : ");
		type = get.next();
		System.out.print("\nPlate no : ");
		plateNo = get.nextInt();
		System.out.print("\nPrice : ");
		price = get.nextFloat();
		//get.close();
	}

	public void displayCarDetails()
	{
		System.out.print("\nCar details :\nBrand : "+brand+"\nModel no : "+modelNo+"\nColour : "+colour+"\nType : "+type+"\nPlate no : "+plateNo+"\nPrice : "+price);
	}

	public static void main(String args[])
	{
		char ch = 'y';
	  	do
  	  	{
			System.out.print("\nEnter number of cars : ");
			Scanner get = new Scanner(System.in);
			int numOfCars = get.nextInt();
			Car cars[] = new Car[numOfCars];
			for(int i = 0; i < numOfCars ; i++)
			{
				cars[i] = new Car();
			}
			for(Car c : cars)
			{
				c.getCarDetails();
			}
	
			for(Car c : cars)
			{
				c.displayCarDetails();
			}
			System.out.println("\nTry again? <y/n>  : ");
                        ch=get.next().charAt(0);

		}while(ch=='y' || ch=='Y');
	}
};

	
	
