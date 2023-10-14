
public class PrimeNumer {

	public static void main(String[] args) {
		
		
	for(int j=1 ; j<=20 ; j++)
	{
		
	boolean isprime= true;
		
	for(int i=2 ; i<j ;)
	{
		if(j%i==0)
		
			isprime=false;
		break;
	}
	
	if(isprime)
	{
		System.out.println(j+ "");
	}

	
	}

	}
}
