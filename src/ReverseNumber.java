import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Enter the number");
		int remainder, reverse = 0;
		int n= scan.nextInt();
		
		while(n>0)
		{
			remainder= n % 10;
			reverse = reverse * 10 + remainder;
			n = n / 10;
		}
			System.out.println("This is reverse number" +reverse);
		}
		

	}


