package Practice;
import java.util.Scanner;
public class MadLibsGame {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String adjective;
		String noun;
		String adjective2;
		String verb;
		String adjective3;
		
		System.out.print("enter adjective:");
	    adjective = scanner.nextLine();
	    System.out.print("noun");
	    noun = scanner.nextLine();
	    System.out.print("enter adjective2");
	    adjective2 = scanner.nextLine();
	    System.out.print("enter verb");
	    verb = scanner.nextLine();
	    System.out.print("enter adjective3");
	    adjective3 = scanner.nextLine();
	    System.out.println(" today i went to a "+adjective + " zoo ");
	    System.out.println(" where i saw a " + noun + ".");
	    System.out.println(" i was "+adjective2 + " and " +verb+ "!");
	    System.out.println(" i was  "+adjective3 + "!");
	    
	    scanner.close();
	}

}
