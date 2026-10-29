package Practice;
import java.util.Scanner;
public class HappyBirthDaySong {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your name:");
		String name = scanner.nextLine();
		System.out.print("how old are you ?:");
		int age = scanner.nextInt();
		happyBirthday(name,age);
	}
	static void happyBirthday(String name,int age) {
		
			System.out.println("Happy Birthday to you!");
			System.out.printf("Happy Birthday dear %s! \n", name);
			System.out.printf("You are %d years old! \n",age);
			System.out.println("Happy Birthday to you!\n");
	}
}
