package day2;

public class Lab6 {
	public static void main(String[] args) {
		//lab 6 ข้อ 1
	//	ForTen();
		
		//Lab 6 ข้อ2
		Sumten();
		
		//Lab 6 ข้อ3
		Find12();
		
		//Lab 6 ข้อ 4
		PrintArr();
	}
	
	public static void ForTen() {
		
		for(int i =1; i<=10;i++) {
			System.out.println(i);
		}
	}
	
	public static void Sumten() {
		int calSumten =0;
		for(int i =1; i<=10;i++) {
			calSumten =calSumten + i;
			System.out.println(calSumten);
		}
		System.out.println("ผลรวมเท่ากับ " + calSumten);
	}
	
	public static void Find12() {
		
		for(int i =1; i<=100;i++) {
			if(i%12 ==0) {
				System.out.println(i);
			}
		}
		
	}
	
	
	public static void PrintArr() {
		int[] iArr = {1,2,3,4,5};
		
		for(int i=0;i<iArr.length ;i++) {
			System.out.println(iArr[i]);
			
		}
		
		for(int nb : iArr) {
			System.out.println(nb);
		}
		
	}
	
	

}
