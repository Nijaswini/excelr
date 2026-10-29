package Practice;
import java.util.Scanner;
public class BankingProgram {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.print("Enter your avaliable Balance:");
		double balance = scanner.nextDouble();
		boolean isRunning=true;
		while(isRunning=true){
		System.out.println("...................");
		System.out.println(" BANKING PROGRAM ");
		System.out.println("...................");
		System.out.println("1.Show Balance");
		System.out.println("2.Deposit");
		System.out.println("3.Withdraw");
		System.out.println("4.EXIT");
		System.out.println("...................");
		System.out.print("Enter your choice (1-4)");
		int choice = scanner.nextInt();
		
		switch(choice) {
		case 1 -> showBalance(balance);
		case 2 -> balance += deposit();
		case 3 -> balance -= withdraw(balance );
		case 4 -> isRunning=false;
		default-> System.out.println("invalid choice");
		
		}}
		System.out.println("******************");
		System.out.printf("Thankyou" );
		System.out.println("******************");
		scanner.close();
	
		
	}
	static void showBalance(double balance) {
		System.out.println("******************");
		System.out.printf("$%.2f\n",balance);
	
	}
	static double deposit() {
		
		System.out.println("******************");
		double amount;
		System.out.println("Enter an amount to be deposited");
		amount=scanner.nextDouble();
		if(amount<0) {
			System.out.println("deposited amount can't be negaive");
			return 0;
		}
		else {
			return  amount;
		}
	
	}
	static double withdraw (double balance ) {
		System.out.println("******************");
		double amount;
		System.out.print("Enter an amount to withdraw");
		amount=scanner.nextDouble();
		if(amount>balance) {
			System.out.println("no suffient balance");
			return 0 ;
	    }
		else {
		return amount;
	}
	 

	}
}