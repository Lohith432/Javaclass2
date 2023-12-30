package CoreJavaProgramming;

public class SingleInheritanceClassB extends SingleInhClassA {
	
	public void read()  {
		  
		   System.out.println("I am reading");
	}

	public static void main(String[] args) {

		SingleInheritanceClassB obj = new SingleInheritanceClassB();
		
		
		// data from class A
		
		System.out.println(obj.empID);
		
		System.out.println(obj.empName);
		
		obj.display();
		
		// data from class B
		
		obj.read();
		

	}

}
