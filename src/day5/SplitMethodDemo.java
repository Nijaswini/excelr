package day5;

public class SplitMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Java is easy to learn";

        String[] words = s.split(" ");

        for (String word : words) {
            System.out.println(word);
        }

	}

}
