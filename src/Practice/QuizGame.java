package Practice;
import java.util.Scanner;
public class QuizGame {

	public static void main(String[] args) {
		
		String[] questions = {"What is the main function of the router ",
				"Which part of the computer is considered the brain",
				"What year was Facebook launched ",
				"Who is know as the father of computer",
				"what is the first programming language"};
		String[][] Options = {{"1. Storing files", "2.Encrypting data","3. Directing internet traffic","4.Managing passwords"},{"1.CPU","2.HardDrive","3.RAM","4.GPU"},
                               {"1.2000","2.2004","3.2006","4.2008"},
                               {"1.Steve Jobs","2.Bill Gates","3. Alan turing","4. charles"},
                               {"1.Cobol","2.c","3.Fortran","4.python"}};
int[] answers = {3,1,2,4,3};
int score=0;
Scanner scanner = new Scanner(System.in);

System.out.println("...................................");
System.out.println("Welcome Gamers Lets Start The Quiz");
System.out.println("...................................");

for(int i = 0; i < questions.length;i++ ) {
	
	System.out.println(questions[i]);
	
	for(String option: Options[i]) {
		System.out.println(option);
		
	}
	System.out.print("Enter your Guess: ");
	int guess = scanner.nextInt();
	if(guess == answers[i]) {
		System.out.println(".........");
		System.out.println("coorect");
		System.out.println(".........");
		 score++;
		 
	}
	else {
		System.out.println("......");
		System.out.println("wrong");
		System.out.println("......");
	}
	

	
}

System.out.println("FINAL SCORE == "+score+ "outof "+questions.length);
scanner.close();
}
}
