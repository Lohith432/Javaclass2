package CoreJavaProgramming;

public class EncapsulasionEx {
	// private data member
	
	private String name;
	
	// getter method for the name
	
	  public String getName() {
		  
		  return name;
		  
		  
	  }
                
	   // setter method for the name
	  
	     public void setName(String name) {
	    	 
	    	 this.name = name;
	    	 
	    	 
	     }
	public static void main(String[] args) {

		 EncapsulasionEx en = new  EncapsulasionEx();
		          
		          en.setName("Lohith");
		          
		          System.out.println(en.getName());

	}

}
