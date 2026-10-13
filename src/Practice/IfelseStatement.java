package Practice;
import java.util.Scanner;
public class IfelseStatement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("ENTER YOUR Name");
		String name=sc.nextLine();
		
		System.out.print("ENTER YOUR AGE");
		int age=sc.nextInt();
		
		System.out.print("are you a student:(true/false)");
		boolean student=sc.nextBoolean();
		
		if(name.isEmpty()){
			System.out.println("your didnt enter name please enter name");	
		}
		else{
			System.out.println("HELLO" + name);
			
		}
		if(age>= 18) {
			System.out.println("your are an adult");
		
	    }
	    else if(age<0) {
	    	System.out.println("your are not born yet");
	    	
	    }
		
	    else if(age==0) {
	    	System.out.println("your are an baby");
	    	
	    }
	    else { 
	    	System.out.println("you are child");
	    }
		
		if(student) {
			System.out.println("you are student");
	    }
		else {
			System.out.println("you NOT STUDENT");
	    
		}
	}
}
