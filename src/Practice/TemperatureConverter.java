package Practice;
import java.util.Scanner;
public class TemperatureConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        double temperature;
        double newtemperature;
        String choice;
        
        
        System.out.print("Enter the  temperature: ");
        temperature=scanner.nextDouble();
        System.out.print("Convert to celsius or Fahrenheit? (c OR f )");
        choice=scanner.next();
        newtemperature=(choice.equals("c")) ? (temperature - 32) * 5 / 9 : (temperature * 5 / 9) + 32;
        System.out.printf("%.1f°%s", newtemperature,choice );
	}

}
