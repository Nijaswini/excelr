package Practice;
import java.util.Scanner;
public class MovieticketBookingNestedIfelseStatement {

	public static void main(String[] args) {
		boolean iseligible;
		boolean isStudent;
		boolean isBaby;
		boolean isSeniorCitizen;
		double price=250;
		Scanner scanner = new Scanner (System.in);
		System.out.println("ARE STUDENT/BABY/SENIORCITIZEN  (true/false)" );
		iseligible=scanner.nextBoolean();
		if (iseligible==true) {
			System.out.println("congrats you can receive discount on your TICKET");
			System.out.println("ARE YOU A BABY? (true/false)");
	        isBaby = scanner.nextBoolean();
	            
	        System.out.println("ARE YOU A STUDENT? (true/false)");
	        isStudent = scanner.nextBoolean();
	            
	        System.out.println("ARE YOU A SeniorCitizen? (true/false)");
	        isSeniorCitizen = scanner.nextBoolean();
		   
		    if(isStudent==true) {
		    	System.out.println("congrats you receive 10% discount on your TICKET");
			    price*=0.10;
			    System.out.printf("The price of the TICKET== $%f\n",price);
			}
		    else if(isBaby==true) {
		    	System.out.println("no charges for the baby TICKET");
			    price-=price;
			    System.out.printf("The price of the TICKET== $%f\n",price);
			}
		    
		    else if(isSeniorCitizen==true) {
		    	System.out.println("congrats you receive 10% discount on your TICKET");
			    price*=0.20;
			    System.out.printf("The price of the TICKET== $%f\n",price);
			    
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
