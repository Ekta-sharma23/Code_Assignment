import java.util.Scanner;

public class Greater_Number {

	public static void main(String[] args) {

		 Scanner scan= new Scanner(System.in);
		 
		 	
		 	System.out.println("Enter  First number : ");
		 	int number1= scan.nextInt();
		 	
		
			System.out.println("Enter  Second number : " );
			int number2= scan.nextInt();
			
		
			System.out.println("Enter  Third number : ");
			int number3= scan.nextInt();
			
			int greater =number1;
			
			if( number2>number1)
			{
				greater = number2;
			}
				if(number3>number1)
				{
					greater = number3;
					
				}
				 // Display the greatest number
				 System.out.println("The greatest number is: " + greater);			
				 
	}
}

	


