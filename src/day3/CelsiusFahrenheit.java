package day3;
import java.util.Scanner;

public class CelsiusFahrenheit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double c = sc.nextDouble();

        double f = (9.0 / 5.0) * c + 32;

        System.out.printf("Fahrenheit = %.2f", f);
    }
}
