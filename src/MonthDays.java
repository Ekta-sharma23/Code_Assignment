import java.util.Scanner;

public class MonthDays {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter a month (1-12): ");
		        int month = scanner.nextInt();

		        if(month>=1 && month<=12);
		        {
		        int days;
		       if(month==2)
		       {
		        	days=28;
		        }
		       		else if(month==4 ||month==6||month==9||month==11)
		       {
		       			days=30;
		       }
		       		else{
		        	
		        		days=31;
		        }
		      
		        System.out.println("Number of days in selected month " +days);
		    }
		     

	}
}



