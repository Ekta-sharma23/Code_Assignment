package Method;

public class MethodExample_2 {

	public static void main(String[] args) {
		
		int k=Integer.add(6, 7);
		System.out.println(""+k);
		
		Integer sum=new Integer();
		float S= sum.difference(6, 7);
		System.out.println(""+S);


		
		
	}
	
	static class  Integer{
		
		public static int add(int num1, int num2)
		{
			int k= num1+num2;
			System.out.println("This is add method");
			return k;
		}
		
		public float difference(int num1, int num2) {
			float k= num1-num2;
			System.out.println("This is Difference method");
			return k;
		}
		}
}
