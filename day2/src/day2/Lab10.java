package day2;

public class Lab10 {
	public static void main(String[] args) {
		//Lab 10 ข้อ 1
		Count10();
		
		//Lab 10 Option 
		Luckynumber();		
	}
	
	public static void Count10() {
		for(int i=0; i <=10; i++) {
			if (i==2) {
				i++;
				
			}
			System.out.println(i);
		}
	}
	
	public static void Luckynumber() {
		
		for(int i=1; i <=10; i++) {
			if (i%2 ==1) {
				System.out.println(i + " is lucky number ");
				
			}
			
		}
	}

}
