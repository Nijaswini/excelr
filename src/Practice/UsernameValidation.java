package Practice;
import java.util.Scanner;
public class UsernameValidation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		
		String username;
		System.out.println("Enter the Username");
		username=scanner.nextLine();
		if(username.length()<4 ||username.length()>12) {
			System.out.println("invalid Username:Username must be between 4-12 characters");
			
		}
		else if(username.contains(" ")|| username.contains("_")){
			System.out.println("invalid Username:Username must not contain spaces or underscores");
			
		}
		else {
			System.out.println("hello!"+ username);
		}
		

	}

}

// username must be between 4-12 characters
// username must not contain spaces or underscores
//variable.contains()
//variable.isEmpty()
