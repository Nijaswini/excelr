package Practice;
import java.util.Scanner;
public class ForLoopDemo {

	public static void main(String[] args) {
		// for Loop = execute some code a certain amount of times
		
		//syntax -> for(Initialization;Condition;INCREMENT OR DECREMENT){
		int loop;
		Scanner scanner =new Scanner(System.in);
		System.out.print("Enter how many times you want to loop:");
		loop=scanner.nextInt();
	
		for(int i = 1; i <= loop ; i++) { //if i = 1 then i<=,if i=0 then i<
			System.out.println(i);
		}
		
		scanner.close();
		
		
		
		
	}   

}
