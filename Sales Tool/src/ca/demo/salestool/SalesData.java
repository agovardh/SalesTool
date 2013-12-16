package ca.demo.salestool;

public class SalesData {

	int data[] = {0,4,42};
	
	public void display() {
		//System.out.println("Todo : Implement data display");
		for (int i = 0; i<data.length; i++) {
			System.out.println(" Data Array Item ["+ i + "] : "+ data[i]);			
		}
		
	}
	
}
