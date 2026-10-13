package Practice;
import java.util.Scanner;

public class CalculatorProgram {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double number1;
		double number2;
		char operator;
		double result=0;
		
        System.out.print("Enter The First Number: ");
		number1 = scanner.nextDouble();
	
        System.out.print("SELECT [ +, -, /, ^]: ");
		operator = scanner.next().charAt(0);
		
		System.out.print("Enter The Second Number: ");
		number2 = scanner.nextDouble();
		/*
		switch(operator) {
		case '+' -> System.out.print(number1 + number2 );
		case '-' -> System.out.print( number1 - number2 );
		case '/' -> System.out.print( number1 / number2 );
		case '^' -> System.out.print( Math.pow(number1, number2));
		default ->  System.out.print( "Enter the valid operation" );
		}
		*/
		
		switch(operator) {
		   case '+' -> result = number1 + number2 ;
		   case '-' -> result = number1 - number2 ;
		   case '/' -> result = number1 / number2 ;
		   case '^' -> result = Math.pow(number1, number2);
		   default -> {
	        System.out.println("Error: Invalid operator entered.");
		    scanner.close();
		   }
	    
		
	    }
		System.out.println(result) ;
		scanner.close();
		
	}

}
