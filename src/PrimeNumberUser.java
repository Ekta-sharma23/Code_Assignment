import java.util.Scanner;

public class PrimeNumberUser {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the number");
		int n=scan.nextInt();
		
		boolean isprime=true;
	
		if(n<2)
		{
			isprime=false;
		}
		else {

		
		for(int j = 2;j<n ;j++)
		{
			if(n%j==0)
			{
				 isprime=false;
				 break;
			}
		}
	
	
			if(isprime)
			{
				System.out.println("This numnber is prime Number" +n);
				
			}
			else {
				System.out.println("This numnber is not prime numner" +n);
			}
				
		
		}
	}
}
	


