package Practice;
import java.util.Scanner;
public class WhileLoopDemo2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = 0;

		System.out.print("Enter your number betwwen 1 to 10 : ");
		number = scanner.nextInt();

		while(number < 1 || number >10 ){
		System.out.println("Your number can't in this range");
		System.out.print("Enter your number betwwen 1 to 10 : ");
		number = scanner.nextInt();
		}
		System.out.println("NUMBER IS BETWEEN 1 TO 10: " + number );

		scanner.close();
	

	}

}
