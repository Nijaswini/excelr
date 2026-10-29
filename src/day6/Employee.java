package day6;

public abstract class Employee {
	abstract void performDuty();

    void attendMeeting() {
        System.out.println("Employee attends a meeting.");
    }

}


class Developer extends Employee {
    @Override
    void performDuty() {
        System.out.println("Developer writes and tests code.");
    }
}