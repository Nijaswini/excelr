package Practice;
import java.util.Scanner;
public class TernaryOperator {

	public static void main(String[] args) {
		// ternary operator ? = Return 1 of 2 values if a condition is true

		// variable = (condition) ? ifTrue : ifFalse;
		Scanner scanner =new Scanner(System.in);
	
		int score;
		System.out.print("Enter the marks achieved:");
		score=scanner.nextInt();
		String passorfail = (score>=35)? "pass" : "fail";
		System.out.println(passorfail);
		
		int number;
		System.out.print("Enter the number:");
		number=scanner.nextInt();
		String evenorodd = (number % 2 ==0 )? "even number" : "odd number";
		System.out.println(evenorodd);
		
		int hours;
		System.out.print("Enter the time:");
		hours=scanner.nextInt();
		String AmorPM = (hours<=12)? "AM" : "PM";
		System.out.println(AmorPM);
		
        scanner.close();
	}

}
