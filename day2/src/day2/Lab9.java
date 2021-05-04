package day2;

public class Lab9 {

	public static void main(String[] args) {
		//Lab 9 ข้อ 1
		Count20();
				
	}
	
	public static void Count20() {
		for(int i=0; i <=20; i++) {
			if (i==11) {
				System.out.println(i);
				continue;
			}
			System.out.println(i);
		}
	}
	
}
