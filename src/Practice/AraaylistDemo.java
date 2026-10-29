package Practice;
import java.util.ArrayList;
import java.util.Scanner;

public class AraaylistDemo {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		// ArrayList = A resizeable array that stores objects (autoboxing)
		//Arrays are fixed in size, but ArrayLists can change

		ArrayList<String> fruits = new ArrayList<>();

	/*	fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Banana");
		fruits.add("Coconut");

		fruits.remove(0);
		fruits.set(0, "Pineapple");
		*/
		
		System.out.print("Enter the no of food you would like to add");
		int numOfFruits= scanner.nextInt();
		scanner.nextLine();
		
		for(int i = 1; i<numOfFruits; i++) {
			System.out.print("Enter food " +i+ ": ");
			String fruit =scanner.next();
			fruits.add(fruit);
			
		}
		System.out.print(fruits);
	
		
		
	}
	

}
