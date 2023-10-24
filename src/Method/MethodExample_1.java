package Method;

public class MethodExample_1 {

	public static void main(String[] args) {
		
	   int Sum = Calculator.add(5,6);
	   System.out.println(""+Sum); 
	   
	   Calculator M = new Calculator();
	  int product= M.multiply(7,8);
	  
		  System.out.println(""+product); 
	  
	}
	   
	static class Calculator{
			
			public static int add(int i,int j)
			{
				System.out.println(" addition of 2 number");
				return i+j;
				
			}
			
			public int multiply(int i, int j) 
			{
				System.out.println(" multiply  of 2 number");
				return i*j;
			}
		}

	}

