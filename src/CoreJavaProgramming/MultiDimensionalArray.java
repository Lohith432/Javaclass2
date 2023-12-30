package CoreJavaProgramming;

public class MultiDimensionalArray {
	
	public void md () {
		
		// initialization of array
		
		int arr [] [] = {{1,2,3}, {2,4,5}, {4,5,6}};
		
		// print the 3D array
		
		// for loops for rows
		
		for (int i = 0 ; i <3 ; i++) {
			
			
			
			// for loop for columes
			
			for (int j =0; j<3; j++) {
				
				System.out.println(arr[i] [j]);
			}
		
		System.out.println();}
		
		
		}
		
	
	
	
		
		
	
	public static void main (String[] arge) {
		
		MultiDimensionalArray md = new MultiDimensionalArray();
		
		md.md();
		
		
		
	}
	
	}

	
		

	
	
	


