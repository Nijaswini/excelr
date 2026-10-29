package Practice;

public class User {
	String username;
	String email;
	int age;
	
	User(String username){
		this.username= username;
		this.email="not provided";
		this.age=10;}
	
	User(String username,String email){
		this.username= username;
		this.email="email";
		this.age=20;
	}
	
	User(String username,String email,int age){
		this.username= username;
		this.email="email";
		this.age=age;
		
	}
	User(){
		this.username= "Guest";
		this.email="Guest";
		this.age=0;
		
	}

}
