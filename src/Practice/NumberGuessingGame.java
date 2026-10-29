package Practice;
import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int guess;
		int attempts=0;
		int randomNumber =random.nextInt(1,101);
		
		
		System.out.println(" NUMBER GUESSING GAME");
		System.out.println(" GUESS A NUMBER BETWEEN 1 - 100");
		System.out.print(" ENTER A GUESS : ");
		guess=scanner.nextInt();		
		
		while(guess!=randomNumber){
			System.out.println(" very close ! try again");
			System.out.print(" ENTER A GUESS : ");
			guess=scanner.nextInt();		
			attempts++;
			if(guess<randomNumber) {
				System.out.print(" Too low! try again ");
				
			}
			else if (guess > randomNumber) {
				System.out.print(" Too HIgh ! try again ");
			}
			else {
				System.out.println(" correct the number was: "+randomNumber);
				System.out.print("attempts:" +attempts);
			}
		}
		
			
		
	scanner.close();
	

	}

}
