package Practice;
import java.util.Scanner;

public class MathOperations {

	public static void main(String[] args) {
		// circumference = 2 * Math.PI * radius;
		// area = Math.PI * Math.pow(radius, 2);
		// volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3)
		Scanner scanner =new Scanner(System.in);
		double radius;
		double circumference;
		System.out.print("enter radius: ");
		radius=scanner.nextDouble();
		circumference=2 * Math.PI * radius;
		System.out.println("circumference= "+ circumference +"cm");
		double area=Math.PI * Math.pow(radius, 2);
		System.out.println("area= "+ area +"cm^2");
		double volume=(4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
		System.out.println("volume= "+ volume +"cm^3");
		
		
		
		System.out.println("Results with one decimal point");
		
		/// to get only one decimal point we can use printf{% for double,,.1 for  one decimal point,,\n for new line}
		
		System.out.printf("The circumference is: %.1fcm\n", circumference);
		System.out.printf("The area is: %.1fcm2\n", area);
		System.out.printf("The volume is: %.1fcm3\n", volume);
	       	
		scanner.close();
  
	}

}
