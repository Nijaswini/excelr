package Practice;

public class Stringsdemo {

	public static void main(String[] args) {
		String name = "Nijaaswini Nandru";
		String name1="Password";

		int length = name.length();// NO OF CHARACTERS 
		char letter = name.charAt(8);//CHARACTER AT INDEX 
		int index = name.indexOf(" ");//FIRST OCCURENCE INDEX OF CHARACTER
		int lastIndex = name.lastIndexOf("a");//LAST OCCURENCE INDEX OF CHARACTER
		
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.trim());
		System.out.println(name.replace("a","i"));
 
		System.out.println(lastIndex);
		System.out.println(index);
		System.out.println(letter);
		System.out.println(length);
		
		
		
		if(name.isEmpty()) {
			System.out.println("your name is empty please the name");
		}
		else {
			System.out.println("hello "+ name);
		}
		
	
		
		if(name.contains(" ")) {
			System.out.println("your name has empty spaces");
		}
		else {
			System.out.println("hello "+ name);
		}
		
		
		if(name1.equals("password")) {//usually equals is case sensitive so when we use capital P instead of p it ignores 
			System.out.println("your name cannot be password");
		}
		else {
			System.out.println("hello "+ name);
		}
		if(name1.equalsIgnoreCase("password")) {// to ignores case sensitivity  we use equalsignorecase() 
			System.out.println("your name cannot be password");
		}
		else {
			System.out.println("hello "+ name);
		}
	}
				

}


