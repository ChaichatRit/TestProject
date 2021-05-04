package day2;

public class Lab8 {
	public static void main(String[] args) {
		//Lab 8 ข้อ 1
		Count20();
		
		//Lab 8 Option
		Luckynumber();
		
		
	}
	public static void Count20() {
		for(int i=0; i <=20; i++) {
			if (i==11) {
				System.out.println(i);
				break;
			}
			System.out.println(i);
		}
	}
	
	public static void Luckynumber() {
		
		for(int i=1; i <=10; i++) {
			if (i==7) {
				System.out.println(i + " is lucky number ");
				break;
			}
			System.out.println("Print number "+i);
		}
	}
}
