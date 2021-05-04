package day2;

public class Lab2 {
	public static void main(String[] args) {
	
		// lab 2 ข้อ 1
		bark();

		int layPrice =10;
		int colaPrice=20;
		sumPrice(layPrice,colaPrice);
		
		
		// lab2 ข้อ2
		float num1 =10.3f;
		System.out.println(num1);
		int newInt =(int)num1;
		System.out.println(newInt);
		
		int numInt =10;
		float newFloat =(float)numInt;
		System.out.println(newFloat);
		
		// lab 2 ข้อ 3
		/*
		final String hello ="Hello";
		hello = "World";		
		System.out.println(hello);
		*/
		
		// Lab 2 Option 
		/*
		 …... myWeight = 74;
		…...myFloatNum = 8.99f;
		….. myLetter = 'A';
		….. myBool = false;
		….. myText = "Hello World"; 
		 
		 */
		
		int myWeight = 74;
		float myFloatNum = 8.99f;
		char myLetter = 'A';
		boolean myBool = false;
		
		System.out.println(myLetter);
		
		double myDouble =124.23;
		int myNewint =(int)myDouble;
		System.out.println(myNewint);
	}
	
	public static void bark() {
		String dogName ="dada";
		System.out.println("The Dog name = " + dogName + " bark" );
		
	}
	
	public static void sumPrice(int price1, int price2) {
		System.out.println("Sum price =" + (price1+price2) );
	}

}
