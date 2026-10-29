package Practice;

public class TwoDimenisionalArray {

	public static void main(String[] args) {
	// for-each loop traverse elements in an array or collection without using an index variable.
	//for (dataType variableName : arrayOrCollection) {
    // Code block to be executed}
		String[] fruits= {"apple", "oranges","banana" };
		String[] veggies= {"tomato", "onion","chilles" };
		String[] meat= {"chicken", "mutton","fish" };
		
		
		//String[][] groceries= { fruits,veggies,meat };
		String[][] groceries= { {"apple", "oranges","banana" }, 
				                  {"tomato", "onion","chilles" },
				                      {"chicken", "mutton","fish" }};
		
		groceries[0][0]="pineapple";
		groceries[1][2]="cucumber";
		for(String[] foods : groceries ) {
			for(String food : foods) {
				System.out.print(food+" ");
				
			}
			System.out.println();	
		}
	}

}
