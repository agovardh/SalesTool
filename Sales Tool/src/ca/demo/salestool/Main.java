package ca.demo.salestool;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SalesData data = new SalesData();
		
		dispalyGreeting();
		data.display();

	}
	
	private static void dispalyGreeting() {
		System.out.println("Hello Happy Sales People !");
		System.out.println ("This app Shows Sales Data");
		
	}

}
