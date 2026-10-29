package Practice;
import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random =new Random();
		
		String[] choices = {"rock","paper","scissors"};
		String playerChoice;
		String computerChoice;
		String playAgain = "yes";
		do {
		System.out.print(" Enter you move (rock ,paper,scissors): ");
		playerChoice = scanner.nextLine().toLowerCase();
		if (!playerChoice.equals("rock") &&
				!playerChoice.equals("paper")&&
				!playerChoice.equals("scissors")) {
			System.out.println("please enter valid entry");	
		}
		
		computerChoice= choices[random.nextInt(1,3)];
		System.out.println("computerChoice: "+ computerChoice);
		
		if(playerChoice.equals(computerChoice)) {
			System.out.println("its a tie");
			}
		else if((playerChoice.equals("rock")&& computerChoice.equals("scissors"))||
				(playerChoice.equals("paper")&& computerChoice.equals("rock"))||
				playerChoice.equals("scissors")&& computerChoice.equals("paper"))
				{
			System.out.println("you win");	
		}
		/*else if(playerChoice.equals("paper")&& computerChoice.equals("rock")){
			System.out.println("you win");	
		}
		else if(playerChoice.equals("scissors")&& computerChoice.equals("paper")){
			System.out.println("you win");	
		}*/
		
		else {
			System.out.println("you just missed");
			
		}System.out.println("play again (yes/no)");
		playAgain=scanner.next();
		}while(playAgain.equals("yes"));
		System.out.println("thanks for playing");	
				
	scanner.close();		
	}
	
	
}
