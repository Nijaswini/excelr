package day5;
import java.util.StringTokenizer;
public class StringTokenizerDemo {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("Java,Python,C++", ",");

	        while (st.hasMoreTokens()) {
	            System.out.println(st.nextToken());
	        }

	}

}
