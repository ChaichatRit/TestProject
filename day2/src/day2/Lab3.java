package day2;

public class Lab3 {
	public static void main(String[] args) {
		//lab 3 ข้อ 1
		int i =20;
		for(int j=0; j<5; j++) {
			i++;
		}
		System.out.println(i);
		
		for(int j=0; j<5; j++) {
			--i;
		}
		System.out.println(i);
		
		// Lab 3 Option 1	
		OddEven();
		
		// Lab 3 Option 2
		Compare1();
		Compare2();
		
		
	}
	
	public static void OddEven() {
		int value =1;
		for(int j=0; j<5; j++ ) {
			if( value%2 ==1) {
				System.out.println("This is Odd Number " + value);
			}else {
				System.out.println("This is Even Number " + value);
			}
			value++;
					
		}
	}
	public static void Compare1() {
		int first =2 ;
		int second =12;
		System.out.println("first=" + first + ", second =" + second);
		if (first == second) {
			System.out.println("first=" + first + " เท่ากับ second =" + second);
		}else {
			System.out.println("first=" + first + " ไม่เท่ากับ second =" + second);
		}
	}
	public static void Compare2() {
		int first =12 ;
		int second =12;
		System.out.println("first=" + first + ", second =" + second);
		if (first == second) {
			System.out.println("first=" + first + " เท่ากับ second =" + second);
		}else {
			System.out.println("first=" + first + " ไม่เท่ากับ second =" + second);
		}
	}
}
