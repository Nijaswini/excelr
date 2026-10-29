import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		String[] fruits = {"apple", "orange","Banana"};
		//System.out.println(fruits[0]);
		
		fruits[0]="pineapple"; 
		int numOffruits=fruits.length;
		Arrays.sort(fruits);
		Arrays.fill(fruits,"pineapple");
    for(String a : fruits) {
    	System.out.println(a);
    }
	}

}
