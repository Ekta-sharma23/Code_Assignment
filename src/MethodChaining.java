public class MethodChaining{
	
	MethodChaining method1() {
	
		    return this;
		  }
	
	MethodChaining method2(){
			
		    return this;
		  }
		
}

	class Demo{
		
		  public static void main(String[] args){
			  
			  MethodChaining a1 = new MethodChaining();
			  
		      System.out.println(a1.method1().method2());
		  }
		}
		
		


