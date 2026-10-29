package Practice;

public class VarargsDemo {

	public static void main(String[] args) {
		// varargs = allow a method to accept a varying # of arguments
		//makes methods more flexible, no need for overloaded methods
		//java will pack the arguments into an array
		//... (ellipsis)
		System.out.println(add(1,2,5,9,7));
System.out.println("average of the number is"+averages(1,2,5,9,7));
	}
	static int add (int... numbers) {
		
		int sum = 0;
		for (int number : numbers) {
			sum+=number;
			
		}
		return sum;
	}
static double averages(double... numbers) {
	double sum = 0;
	for(double number : numbers) {
		sum+=number;
	
	}return sum/numbers.length;
}
}
