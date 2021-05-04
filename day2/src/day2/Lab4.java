package day2;

public class Lab4 {

	public static void main(String[] args) {
		int score = 50;
		boolean isHandSome =false;
		
		if(isHandSome) {
			System.out.println("Good");
		} else {
			if (score >= 80) {
				System.out.println("Good");
			} else if(score < 80 && score >=50 ) {
				System.out.println("normal");
			} else {
				System.out.println("fail");
			}
		}
		
		// Lab 4 Option 1 
	//	Waterbill();
		
		// Lab 4 Option 2
		Productrate();
		
		// Lab 4 Option 3
		Pressure();
	}
	
	public static void Waterbill() {
		int waterUnit = 200;
		double rate =0;
		double payBill =0;
		
		if(waterUnit <=50) {
			rate =4.25;
			payBill =rate * waterUnit;
			
		} else if(waterUnit > 50 && waterUnit <= 100) {
			rate =3.25;
			payBill =rate * waterUnit;
			
		} else if(waterUnit > 100) {
			rate =2.25;
			payBill =rate * waterUnit;
		}
		
		System.out.println("ค่าน้ำประปา = " + payBill);
	}
	
	public static void Productrate() {
		int rateDefault =2000;
		int rateIncrease =365;
		int year =1;
		boolean yearEnd =true;
		 System.out.println("อัตราการผลิต ปีที่ " + year + " = " + rateDefault );
		
		 while(yearEnd) {
			 year++;
			 rateDefault=rateDefault+rateIncrease;
			 System.out.println("อัตราการผลิต ปีที่ " + year + " = " + rateDefault );
			 if (rateDefault <= 5000) {
				 yearEnd=true;
			 }else {
				 yearEnd=false;
			 }
		 }
		 
		System.out.println(year);
	}
	
	public static void Pressure() {
		int pressInt =100;
		if (pressInt <90) {
			System.out.println("มีความเสี่ยงต่ำ");
		}else if(pressInt >=115 && pressInt < 132 ) {
			System.out.println("มีความเสี่ยปานกลาง");
		}else if(pressInt >= 132) {
			System.out.println("มีความเสี่ยปานสูงง");
		}else {
			System.out.println("ไม่มีความเสี่ยง");
			
		}
	}
}
