package ca.demo.salestool;

public class SalesData {

	int data[] = {0,4,42};
	
	public void display() {
		System.out.println(" Data Array Contnets :");
		
		for (int i = 0; i<data.length; i++) {
			System.out.println("Item ["+ i + "] : "+ data[i]);			
		}
		
	}
	
}
