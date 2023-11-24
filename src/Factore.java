
public class Factore {

	public static void main(String[] args) {
	
		int value=24;
		
		System.out.println("Factore for  "+value+ " number" );
		Findfactore(value);
		
	}
	
		public static void  Findfactore(int num) {
			
			for(int i=1; i<= num; i++) 
			{
				if (num % i==0)
				{
					System.out.println(i+ "");
				}
		}
		
	}

}
