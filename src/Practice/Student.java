package Practice;

public class Student {
	String name;
	int age;
	double gpa;
	boolean isEntrolled;
	
	Student(
		String name,int age,double gpa,boolean isEntrolled){
		this.name=name;
		this.age=age;
		this.gpa=gpa;
		this.isEntrolled=isEntrolled;//---=true
		
		
	}
	void study() {
		System.out.println(this.name +" " +this.age+ " is studying" );;
	}
	

}
