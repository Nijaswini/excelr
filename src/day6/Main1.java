package day6;
class University {
    void displayInfo() {
        System.out.println("This is a university.");
    }
}

class EngineeringCollege extends University {
    @Override
    void displayInfo() {
        System.out.println("This is an engineering college.");
    }
}

public class Main1{
    public static void main(String[] args) {
        University institution = new EngineeringCollege();
        institution.displayInfo();
    }
}


