package day5;

public class Concatenate {

	public static void main(String[] args) {
		String s1 = "Hello";
        String s2 = "Java";

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s1.length(); i++)
            sb.append(s1.charAt(i));

        for (int i = 0; i < s2.length(); i++)
            sb.append(s2.charAt(i));

        System.out.println(sb);

	}

}
