package CoreJavaProgramming;

public class AbstractSubClassEx extends AbstractClassEx {
	
	
	
	void fetchempdetails() {
		
		System.out.println("Employee details");
	}

	public static void main(String[] args) {

		    AbstractClassEx obj = new AbstractSubClassEx();
		    
		    obj.fetchempdetails();
		    
		    obj.getempBU();

	}

}
