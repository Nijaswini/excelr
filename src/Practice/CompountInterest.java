package Practice;
import java.util.Scanner;
public class CompountInterest {

	public static void main(String[] args) {
		// compound interest = P[1+r/n]^nt
		Scanner scanner=new Scanner(System.in);
		
		double P;//principal amount
		double r;//interest rate
		double CompoundInterest;
		int n;//number of years
		int t;//time
		
		System.out.println("enter the principal amount");
		P=scanner.nextDouble();
		System.out.println("enter the rate of interest in %");
		r=scanner.nextDouble()/100;
		System.out.println("enter the no of of years");
		n=scanner.nextInt();
		System.out.println("enter the timecompound per year");
		t=scanner.nextInt();
		CompoundInterest=P*Math.pow(1+r/n,n*t);
		System.out.printf("Total Compound interest for the amount %.1f for %.1f for the duration of %d and %d times compound is equal to == %.1f ",P,r,n,t,CompoundInterest);
		scanner.close();
		
		

	}

}
