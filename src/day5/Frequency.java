package day5;

public class Frequency {

	public static void main(String[] args) {
		String s = "hello";
        boolean[] visited = new boolean[s.length()];

        for (int i = 0; i < s.length(); i++) {
            if (visited[i])
                continue;

            int count = 0;

            for (int j = i; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                    visited[j] = true;
                }
            }

            System.out.println(s.charAt(i) + " = " + count);
            }

	}

} 
