package day5;

public class UpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s = "java is easy to learn";
	        String[] words = s.split(" ");

	        for (int i = 0; i < words.length; i++) {
	            words[i] = Character.toUpperCase(words[i].charAt(0))
	                    + words[i].substring(1);
	        }

	        System.out.println(String.join(" ", words));
	}

}
