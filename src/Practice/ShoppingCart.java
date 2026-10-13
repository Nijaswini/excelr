package Practice;
import java.util.Scanner;
public class ShoppingCart {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String item;
		double price;
		int quantity;
		char curreny='$';
		double sum;
		
		System.out.print("enter the item in the cart: ");
		item=scanner.nextLine();
		System.out.print("enter the price of item in the cart: ");
		price=scanner.nextDouble();
		System.out.print("enter the quantity of item in the cart: ");
		quantity=scanner.nextInt();
		sum=price*quantity;
		System.out.print("The price of the " +item+ " in the cart of " +quantity+ " is: " +curreny+ +sum);
		
	}

}
