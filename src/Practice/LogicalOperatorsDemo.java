package Practice;

public class LogicalOperatorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// && = AND
// || = OR
// !  = NOT
		double temp = -10;
		boolean isSunny = true;

		if(temp <= 30 && temp >= 0 && isSunny){
		System.out.println("The weather is GOOD ");
		System.out.println("It is SUNNY outside");
		}

		else if(temp <= 30 && temp >= 0 && !isSunny){
		System.out.println("The weather is GOOD ");
		System.out.println("It is CLOUDY outside ");
		}
		

		else if(temp>30||temp<0) {
			System.out.println(" The weather is BAD");
			
		}
	}

}
