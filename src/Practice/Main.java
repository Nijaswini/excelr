package Practice;


public class Main {
	public static void main(String[] args) {
	
		Car car1 = new Car("BWW","Black");

		Car car2 = new Car("Audi","red");
		
		//Car[] cars = {car1,car2};
		Car[] cars= {car1 ,car2};
	//Car[] cars= {new Car("BWW","Black"); ,new Car("Audi","red")};
		
		
      for(Car car: cars){
    	  car.drive();
    	  }
		//for(int i=0; i<cars.length;i++) {
	      //  cars[i].drive();
	        
	    
		}
}
		
		
		
		
		
	/*	
		
	User user1= new User("nijaswini");
	User user2= new User("nijaswini","nijas@2106@gmail.com");
	User user3= new User("nijaswini","nijas@2106@gmail.com",21);
	User user4=new User();
	
	System.out.println(user1.username);
	System.out.println(user2.username);
	System.out.println(user3.username);
	System.out.println(user1.email);
	System.out.println(user2.email);
	System.out.println(user3.email);
	System.out.println(user1.age);
	System.out.println(user2.age);
	System.out.println(user3.age);
	System.out.println(user4.age);


	//	
	Student student1 = new Student("nijaswini",20,93.5,true);
	Student student2 = new Student("nijas",21,93.8,false);
	
	System.out.println(student1.name);
	System.out.println(student2.name);
	System.out.println(student1.name);
	System.out.println(student2.name);
	System.out.println(student1.gpa);
	System.out.println(student2.gpa);
    
	student1.study();	
	//
	Car car=new Car();
	System.out.println(car.car);
	System.out.println(car.carno);
	System.out.println(car.isRunning);
	car.stop();
	car.start();
	car.drive();
	}*/
    