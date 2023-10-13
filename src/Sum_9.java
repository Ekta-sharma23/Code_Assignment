import java.util.Scanner;

public class Sum_9 {

	public static void main(String[] args) {
	
Scanner scan=new Scanner(System.in);

System.out.println("Enter the number");
int sum=0,r;
int n= scan.nextInt();
while(n>0)
{
	r=n%10;
	n=n/10;
	sum= sum+r;
	
}
	System.out.println("Sum should be: " +sum);
	

	
	}
}
