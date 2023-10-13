
public class Armstrong_number {

	public static void main(String[] args) {
		
	int sum=0,r,n;
	
	System.out.println("Amstring number from 1-1000");
	
	for(int i=1; i<=1000; i++)
	{
		n=i;
		while(n>0)
		{
			//153- 3 ise remainer  15 is rest of number
			r=n%10; //remaiinder
			sum=sum+(r*r*r); 
			n=n/10; //rest of the number 
			
		}
		if(sum==i)
		{
		System.out.println(i+"");
		}
		
		sum=0;
	}
		

	}

}
