package Practice;
import java.util.Scanner;
public class Practice {
	public static void main(String[]arg) {
		//AREA OF RECTANGLE
		double width=0;
		double height=0;
		double area=0;
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("enter width: ");
	    width = scanner.nextDouble();
		System.out.print("enter height: ");
		height=scanner.nextDouble();
		area=width*height;
		System.out.println("area of rectangle: "+area+ "cm^2");
	}
}
