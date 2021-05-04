package day2;

public class Lab12 {
	public static void main(String[] args) {
		
		// Lab 12 ข้อ 1
		String x="You and Me";
		String y=" you and me ";
		String z="Me";
		
		TestEqua(x,y);
		Findstring(x,z);
		Countstring(y);
		Cutstring(y);
		Upstring(y);
		Chainstring(y);
				
		
	}
	
	public static void TestEqua(String a,String b) {
		if (a.equals(b)) {
			System.out.println( "Equal");
			
		}else {
			System.out.println( "Not equal");
		}
		
	}
	
	public static void Findstring(String a,String b) {
		if(a.contains(b)) {
			System.out.println( b);
			
		}else {
			System.out.println( "Not Found");
		}
		
	}
	
	public static void Countstring(String a) {
		
		System.out.println(a +" Length = " +  a.length());
		
	}
	
	public static void Cutstring(String a) {
		
		a=a.trim();
		
		System.out.println(a.substring(0, 4));
		
	}
	
	public static void Upstring(String a) {
		
		a=a.trim();
		
		System.out.println(a.toUpperCase());
		
	}
	
	public static void Chainstring(String a) {
		
		
		System.out.println(a.trim().toUpperCase());
		
	}

}
