
public class Timeconversion {

	public static void main(String[] args) {
		
		int num= 86399;
		
		//Converting sec to hour,  dividing number by 3600
		
		int hours= num/3600;
		System.out.print(hours +  ": Hours ");
		
		//calculate remaining sec i.e. % of division (86399/3600)=3599sec
		
		int remainingsec= num % 3600;  
		
		//convert remaining sec to minutes
		
		int minutes= remainingsec/60;
		System.out.print(minutes +  ": Minutes ");
		
		//CONVET reaming sec 
		
		int second = minutes%60;
		System.out.print(second +  ": Second");

		
		
		}

}


//sec--hr - we devide /3600
//Reaming sec %
//Remaining sec -- min--we divide /60
//remaining sec %
