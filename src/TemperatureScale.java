import java.util.Scanner;

public class TemperatureScale {

	public static void main(String[] args) {
	
   Scanner scan = new Scanner(System.in);
   System.out.print("Enter your temperature in Celsius : ");     //ask number from user
   double cel = scan.nextDouble();
	
	double  fahrenheit = (1.8*cel ) + 32; //formula convert Celsius into Fahrenheit
	
	System.out.println(cel+ ": Celsius = " + fahrenheit + ": Fahrenheit");
	
	double Kelvin= (cel+273);              //formula to convert Celsius into Kelvin
	
	System.out.println(cel+ ": Celsisu = " + Kelvin + ": Kelvin");
	

	

   
 
   
   
   

	}

}
