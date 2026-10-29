package Practice;
import java.util.Scanner;

public class CountDown {

	public static void main(String[] args) throws InterruptedException{
	Scanner scanner = new Scanner(System.in);
	System.out.print("how many seconds to countdown from :");
	int Countdown = scanner.nextInt();
	for(int i = Countdown;i >0;i--) {
		
		System.out.println(i);
		Thread.sleep(1000); // it actually wait for few seconds before the display
		
	}
	
	System.out.print("SURPRISE");	

	}

}
