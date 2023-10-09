import java.util.Scanner;

public class Positive_Negative {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number :");
		
		int numb=scan.nextInt();
		
		if(numb>0)
		{
			System.out.println(numb+": This is Positive number");
		}
		
		else
			{
				System.out.println(numb+": This is Negative number");
				
		}
		
	}

}
