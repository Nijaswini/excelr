package day5;

public class StringsDemo {

	public static void main(String[] args) {
		String s = "Hello";
		s = s + " Java";
		System.out.println(s);

		StringBuffer sb = new StringBuffer("Hello");
		sb.append(" Java");
		System.out.println(sb);

		StringBuilder sb1 = new StringBuilder("Hello");
		sb1.append(" Java");
		System.out.println(sb1);

	}

}
