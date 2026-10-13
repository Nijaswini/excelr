package Practice;

public class Printfstatement {

	public static void main(String[] args) {
		// %[flags][width][.precision][specifier-character]
		System.out.println("// %[flags][width][.precision][specifier-character]");
		//printf [specifier-character]

		//Strings------%s
		//chars--------%c
		//int----------%d
		//boolean------%b 
		//double-------%f
		System.out.println("//[specifier-character]");
		String name = "Spongebob";
		char firstLetter = 'S';
		int age = 30;
		double height = 60.5;
		boolean isEmployed = true;

		System.out.printf("Hello %s\n", name);
		System.out.printf("Your name starts with a %c\n", firstLetter);
		System.out.printf("your are  %d years old\n", age);
		System.out.printf("You are %f inches tall\n", height);
		System.out.printf("Employed: %b\n", isEmployed);
		
		System.out.printf("%s is %d years old \n", name,age);
		//[.precision]
		System.out.println("//[.precision]");
		double price1 =9.99;
		double price2=100.15;
     	double price3 =-54.01;
	
		System.out.printf("value of price1 is equal to %.1f\n",price1);//printf [.precision]  %.1f for one decimalpoint
		System.out.printf("value of price2 is equal to %.2f\n",price2);//%.2f   for two decimal points
		System.out.printf("value of price3 is equal to %.3f\n",price3);//%.3f   for three decimal points
		
		
		// [flags]
		// + = output a plus
		// , = comma grouping separator
		// ( = negative numbers are enclosed in ()
		// space = display a minus if negative, space if positive
		System.out.println("// %[flags]");
		double price4 =900.99;
		double price5=100.15;
		double price6 =-5400.01;
		System.out.printf("value of price1 is equal to %(+,.1f\n",price4);
		System.out.printf("value of price2 is equal to %(+,.2f\n",price5);
		System.out.printf("value of price3 is equal to %(+,.3f\n",price6);
		
		// [width]
		//[width]

		// 0 = zero padding
		// number = right justified padding
		// negative number = left justified padding

		System.out.println("//[width]");
		int id1 = 1;
		int id2 = 23;
		int id3 = 456;
		int id4 = 7890;
		System.out.println("//0 = zero padding");
		
		System.out.printf("value of id1 is equal to %04d\n",id1);
		System.out.printf("value of id2 is equal to %04d\n",id2);
		System.out.printf("value of id3 is equal to %04d\n",id3);
		System.out.printf("value of id4 is equal to %04d\n",id4);
		
		System.out.println("//number = right justified padding");
	
		System.out.printf("value of id1 is equal to %4d\n",id1);
		System.out.printf("value of id2 is equal to %4d\n",id2);
		System.out.printf("value of id3 is equal to %4d\n",id3);
		System.out.printf("value of id4 is equal to %4d\n",id4);
		
		System.out.println("// negative number = left justified padding");
		
		System.out.printf("value of id1 is equal to %-4d\n",id1);
		System.out.printf("value of id2 is equal to %-4d\n",id2);
		System.out.printf("value of id3 is equal to %-4d\n",id3);
		System.out.printf("value of id4 is equal to %-4d\n",id4);
		

	}

}
