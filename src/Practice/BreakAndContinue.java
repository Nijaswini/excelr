package Practice;
import java.util.Scanner;

public class BreakAndContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// break = break out of a loop (STOP)
// continue = skip current iteration of a loop (SKIP)
		
		for(int i=1;i<=10;i++) {
			if(i==5) {
				continue;
			}
			
			System.out.println(i+" ");	
			
		}
		for(int i=1;i<=10;i++) {
			if(i==8) {
				break;
			}
			
			System.out.print(i+" ");	
			
		}
	
	
	}
	
	

}
