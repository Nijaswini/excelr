package Practice;
import java.util.Scanner;

public class EmailSubstring {

	public static void main(String[] args) {
		// .substring() = A method used to extract a portion of a string
		//.substring(start, end)
        Scanner scanner=new Scanner(System.in);
		String email ;
		String Username ;
		String Domain ;
		System.out.println("enter your email id");
		email=scanner.nextLine();
		if(email.contains("@")) {
			Username = email.substring(0, 8);
			Username = email.substring(0, email.indexOf("@"));
		    Domain = email.substring(9);
		    Domain = email.substring(email.indexOf("@")+1);
			System.out.println(Username);
			System.out.println(Domain);
			
		}
		else {
			System.out.println(" your email id MUST CONTAIN @");
			
		}
        scanner.close();
        
	}

}
