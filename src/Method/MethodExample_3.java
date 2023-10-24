package Method;

public class MethodExample_3 {
		
public static void main(String[] args) {
	
	
	methods.staticmethod();
	
	methods call= new methods();
	call.nonstaticmethod();

	
	
}		

}

class methods{
	 
	 public static void staticmethod()
	 {
		 System.out.println("This is static method");
	 }
	 
	 public void nonstaticmethod()
	 {
		 System.out.println("This is non static method");
	 }
	 
	 
	
	
}
	

		  