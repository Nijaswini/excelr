package day5;

public class Count {

	public static void main(String[] args) {
		 String s = "Java123@";

	        int v = 0, c = 0, d = 0, sp = 0;

	        for (int i = 0; i < s.length(); i++) {
	            char ch = s.charAt(i);

	            if (Character.isLetter(ch)) {
	                ch = Character.toLowerCase(ch);

	                if ("aeiou".indexOf(ch) >= 0)
	                    v++;
	                else
	                    c++;
	            } else if (Character.isDigit(ch)) {
	                d++;
	            } else if (!Character.isWhitespace(ch)) {
	                sp++;
	            }
	        }

	        System.out.println("Vowels: " + v);
	        System.out.println("Consonants: " + c);
	        System.out.println("Digits: " + d);
	        System.out.println("Special characters: " + sp);

	}

}
