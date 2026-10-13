package Practice;
import java.util.Scanner;
public class WeightConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// WEIGHT CONVERSION PROGRAM
		// Declare variables
		// welcome message
		// prompt for user choice
		// option 1 convert lbs to kgs
		// option 2 convert kgs to lbs
		// else print not a valid choice
        Scanner scanner = new Scanner(System.in);
        
        double weight;
        double newweight;
        int choice;
        System.out.println("Weight Conversion Program choose option(1/2)");
        System.out.println("option 1 convert lbs to kgs");
        System.out.println("option 2 convert kgs to lbs");
        System.out.print("choose an option: ");
        choice=scanner.nextInt();
        
        if(choice==1) {
        	System.out.print("Enter the weight in lbs:");
            weight=scanner.nextDouble();
            newweight=weight*0.453592;
        	System.out.printf("new weight in kg is: %.2f",newweight);
        	
        }
        else if(choice==2) {
        	System.out.print("Enter the weight in kg:");
            weight=scanner.nextDouble();
            newweight=weight*2.20462;
        	System.out.printf("new weight in kg is: %.2f",newweight);
        }	
           
        else {
        	System.out.println("choice choosen is not valid ");
        }
        
        
        
	}

}
