package Practice;

public class Bakecake {

	public static void main(String[] args) {
		System.out.println(bakecake("vanila"));
		System.out.println(bakecake("vanila","eggless"));
		System.out.println(bakecake("vanila","eggless",1));
		
	}
	static String bakecake(String flavour) {
		return flavour + " " + "Cake";
		
		
	}
	static String bakecake(String flavour,String type) {
		return type + " " +flavour + " "+ "cake";
		
		
	}
	static String bakecake(String flovour,String type,int num) {
		return num + " " + type + " " +flovour + " "+ "cake";
	}



}
