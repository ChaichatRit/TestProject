package day2;

public class Lab5 {

	public static void main(String[] args) {
		// Lab 5 
		Calgrade(86);
		
		//Lab 5 option 1
		Elevator('G');
		
		//Lab 5 option 2
		Tshirtsize(42);
	}
	
	public static void Calgrade(int score) {
		switch(score) {
		case 40:
			System.out.println("E");
			break;
		case 50:
			System.out.println("D");
			break;
		case 60:
			System.out.println("C");
			break;
		case 70:
			System.out.println("B");
			break;
		case 80:
			System.out.println("A");
			break;
		default:
			System.out.println("F");
			break;
		
		}
		
	}
	
	public static void Elevator(char lavel) {
		switch(lavel) {
		case 'G':
			System.out.println("Elevator is going to " + lavel + " floor");
			break;
		case '2':
			System.out.println("Elevator is going to " + lavel + " floor");
			break;
		case '3':
			System.out.println("Elevator is going to " + lavel + " floor");
			break;
		case '4':
			System.out.println("Elevator is going to " + lavel + " floor");
			break;
		case '5':
			System.out.println("Elevator is going to " + lavel + " floor");
			break;
		default:
			System.out.println("Elevator is going to " + lavel + " floor");
			break;
		
		}
		
   }
	
	public static void Tshirtsize(int size) {
		switch(size) {
		case 29:
			System.out.println("Small");
			break;
		case 42:
			System.out.println("Medium");
			break;
		case 44:
			System.out.println("Large");
			break;
		case 48:
			System.out.println("Extra Large");
			break;
		
		default:
			System.out.println("Unknown");
			break;
		
		}
	}
}
