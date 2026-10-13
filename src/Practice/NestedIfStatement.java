package Practice;
import java.util.Scanner;
public class NestedIfStatement {
	public static void main(String[] args) {
		boolean iseligible;				
		boolean isStudent;
	    boolean isBaby;
	    boolean isSeniorCitizen;
	    double price=150;
		Scanner scanner = new Scanner (System.in);
		System.out.println("ARE STUDENT/BABY/SENIORCITIZEN  (true/false)" );
		iseligible=scanner.nextBoolean();
		if (iseligible==true) {
			System.out.println("congrats you can receive discount on your TICKET");
			price*=0.90;
			System.out.printf("The price of the TICKET== $%f\n",price);
			
			System.out.println("ARE YOU A BABY? (true/false)");
			isBaby = scanner.nextBoolean();
			            
			      
			if(isBaby==true) {
				System.out.println("no charges for the baby TICKET");
			    price-=price;
			    System.out.printf("The price of the TICKET== $%f\n",price);
			}
				    
	        else{
	        	System.out.println("ARE YOU A SeniorCitizen? (true/false)");
				isSeniorCitizen = scanner.nextBoolean();
				if (isSeniorCitizen == true) {
		    	System.out.println("congrats you receive 20% discount on your TICKET");
		    	price*=0.80;
			    System.out.printf("The price of the TICKET== $%f\n",price);}
				 else {
	                    // If they are eligible for the base discount but NOT a baby or senior
	                    System.out.printf("The final price of your discounted TICKET == $%.2f\n", price);
	                }
		    }
		}	
		else {
			
			System.out.println("No discounts apply. Regular price applies.");
			price*=1;
			System.out.printf("The price of the TICKET== $%f",price);
					
		}
		scanner.close();
			
	}

}
