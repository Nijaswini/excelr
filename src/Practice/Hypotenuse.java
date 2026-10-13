package Practice;
import java.util.Scanner;

public class Hypotenuse {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
	    Scanner scanner=new Scanner(System.in);
	    System.out.print("enter valve of a");
	    a=scanner.nextDouble();
	    System.out.print("enter valve of b");
	    b=scanner.nextDouble();
	    //double s1=Math.sqrt(a);
	    //double s2=Math.sqrt(b);
	    //double s3=Math.sqrt(s1+s2);
	   
	    c=Math.sqrt(Math.pow(a,2)+Math.pow(2,2));//java.langpackage is used
	    System.out.print("HYPOTENUSE C= " +c);
	    scanner.close();
	    		

	}

}
