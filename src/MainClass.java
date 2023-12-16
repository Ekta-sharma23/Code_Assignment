class MainClass{ 
	public static void main(String[] args){
	 C c1 = new C(); 
 	c1.test(); 
} 
} 

class D{
 void test(){} 
} 

class B extends D{
 protected void test(){ } 
} 

class C extends B{
 public void test(){ } 
}