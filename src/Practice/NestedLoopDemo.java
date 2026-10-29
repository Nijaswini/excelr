package Practice;

import java.util.Scanner;

public class NestedLoopDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("how many times:");
		int times = scanner.nextInt();
		// nested loop = A loop inside another loop  used often with matrices or DS&A
	
		for(int i=1; i <= times; i++){
			for(int j=1; j <= 9; j++){
				System.out.print(j +" ");
	
	    
				}


	    System.out.println();
        
			}
	
		
/*NORMAL METHOD 
		for(int i=1; i <= 9; i++){
		System.out.print(i +" ");
		}

		System.out.println();// TO GET SEPARATE LINE
		
		for(int i=1; i <= 9; i++){
		System.out.print(i +" ");
		}

		System.out.println();
		
		for(int i=1; i <= 9; i++){
		System.out.print(i +" ");
		}
*/
		
		
	}

}
