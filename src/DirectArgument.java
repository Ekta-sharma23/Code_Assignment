public class DirectArgument {
	public static void main(String[]  args) {
	}
		  public int add(int i , int j){
		    return i+j;
		  
		  }
		
		class B{
			public static void main(String[]  args) {
			  DirectArgument a1 = new DirectArgument();
		 int result=   a1.add(a1.add(10,20),a1.add(30,40));
		 
		 System.out.println(result);
		  
		}
}
}


