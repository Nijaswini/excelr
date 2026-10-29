import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		String[] foods = {"Pizza","puff","briyani"};//int[] numbers={1,2,3,45,6}
		Scanner scanner = new Scanner(System.in);
		String target="briyani";//int target =4
		boolean isFound=false;
		for(int i =0;i<foods.length;i++) {
			if(foods[i].equals(target) )//if(target==number[i])
				System.out.println("element found at index:"+i);
			    isFound=true;
			  
				
			}
		
		if(!isFound) {
			System.out.println("Element not found in the array");
		}
	
		
		
		
		
		/*
	
		 
		//String[] foods = new String[3];
		System.out.print("Enter how many items you need  :");
		int size = scanner.nextInt();
		scanner.nextLine();
		String[] foods = new String[size];
		
		for(int i = 0; i < foods.length; i++){
			System.out.print("Enter a food :");
			foods[i] = scanner.nextLine(); 
			
		}
		
		for(String food : foods) {
			System.out.println(food);
		}
		
		
		*/
scanner.close();
	}

}
