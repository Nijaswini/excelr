package day5;

public class ReverseString {

	public static void main(String[] args) {
		 String s = "Hello";

	        // Iterative method
	        for (int i = s.length() - 1; i >= 0; i--) {
	            System.out.print(s.charAt(i));
	        }

	        System.out.println();

	        // StringBuilder method
	        StringBuilder sb = new StringBuilder(s);
	        System.out.println(sb.reverse());

	}

}
