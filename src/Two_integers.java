import java.util.Scanner;

public class Two_integers {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter First number: ");
		int number1 = scan.nextInt();
        System.out.println("Enter Second number: ");
		int number2 = scan.nextInt();
		
		 //sum of 2 number
				int sum =number1+ number2; 
				 System.out.println("Sum of Two numbers : " +sum);
			   
			   
	        //Difference 
			   int diff = number1 - number2;
			   System.out.println("Difference of Two number :" +diff);
			   
			   //Product
			   int product = number1*number2;
			   System.out.println("Product of Two number :"+product);
			   
			   //Average
			   int avg =(number1*number2)/2;
			   System.out.println("Average of Two number :"+avg);
			   
			   
			   //Distance
			    int distance= Math.abs(number1-number2);
			   System.out.println("Distance of Two number :" +distance);
			   
			   
			   //maximum
			   int max=Math.max(number1,number2);
			   System.out.println("Maximum of Two number :" +max);
			   
			   
			   //minimum
			   int min=Math.min(number1, number2);
			   System.out.println("Minium of Two number :"+min);
				   
		
	}

}
