package Practice;

public class Car {

String model;
String colour;

	Car(String model,String colour){
		this.model=model;
		this.colour=colour;
		
	}
	void drive() { 
		System.out.println(this.model +" " +this.colour+" is driving");
		
		
	}
	
}
	
	
	/*
	String car = "bww";
	char[] carno={'A','p','2','0','q','5','6','4','1'};
	boolean isRunning= true;
	 
	void start(){
		isRunning = true;
		System.out.println("start the car");
		
	}
	void stop() {
		isRunning = false;
		System.out.println("stop the car");
		
	
	}
	void drive() {
		System.out.println("drive the car   "+ car);
		
	
	}
	
	}




/*
class Printer {
    // void means it just performs an action (printing) but returns nothing
    public void printMessage() {
        System.out.println("Hello from an instance void method!");
    }
}

public class Main {
    public static void main(String[] args) {
        Printer myPrinter = new Printer(); // Must create an object
        myPrinter.printMessage();          // Called via object
    }
}

*/

/*
 * class Calculator {
    // static means no object needed; int means it returns a number
    public static int add(int a, int b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        // Called directly using the class name. It returns 15.
        int result = Calculator.add(5, 10); 
        System.out.println(result);
    }
}

 */

/*
 * class Logger {
    public static void logWarning(String message) {
        System.out.println("WARN: " + message);
        // No return statement allowed here
    }
}

public class Main {
    public static void main(String[] args) {
        Logger.logWarning("Low battery."); // Called directly, returns nothing
    }
}

 */
