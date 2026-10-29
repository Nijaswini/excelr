import java.util.Scanner;
import java.util.Random;
public class DiceRoller {
Scanner scanner = new Scanner(System.in);
Random random = new Random();

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int dice;
		int total=0;
		System.out.print("no of dice");
		dice= scanner.nextInt();
		
		
		//while(isRunning) {
		if(dice>0) {
			for(int i=0;i<dice;i++) {
				int roll= random.nextInt(1,7);
				System.out.println("you rolled : " +roll);
				Printdice(roll);
				total +=roll;
			
			}
			System.out.println("total = " + total);
			
			
		}
		else {
			//isRunning=false;
			System.out.print("enter valid dice value");}
		scanner.close();
	    }
          
	static void Printdice(int roll) {
		String dice1="""
				--------
				|      |
				|   ●  |  
				|      |
				--------
				""";
		String dice2="""
				--------
				| ●    |
				|      |  
				|    ● |
				--------
				""";
		String dice3="""
				--------
				| ●    |
				|   ●  |  
				|    ● |
				--------
				""";
		String dice4="""
				--------
				| ●  ● |
				|      |  
				| ●  ● |
				--------
				""";
		String dice5="""
				--------
				| ●  ● |
				|   ●  |  
				| ●  ● |
				--------
				""";
		String dice6="""
				--------
				| ●  ● |
				| ●  ● |  
				| ●  ● |
				--------
				""";
		switch(roll) {
		case 1-> System.out.print(dice1);
		case 2-> System.out.print(dice2);
		case 3-> System.out.print(dice3);
		case 4-> System.out.print(dice4);
		case 5-> System.out.print(dice5);
		case 6-> System.out.print(dice6);
		default -> System.out.print("invalid roll");
		}
	}

}






