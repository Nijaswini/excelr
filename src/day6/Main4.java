package day6;

class Processor {
    void execute() {
        System.out.println("Processor is executing instructions.");
    }
}

class Technician {
    private String technicianName;

    Technician(String technicianName) {
        this.technicianName = technicianName;
    }

    void serviceComputer() {
        System.out.println(technicianName + " is servicing the computer.");
    }
}

class Computer {
    private final Processor processor;  // Composition
    private final Technician technician; // Aggregation

    Computer(Technician technician) {
        processor = new Processor();
        this.technician = technician;
    }

    void operate() {
        processor.execute();
        technician.serviceComputer();
    }
}

public class Main4 {
    public static void main(String[] args) {
        Technician person = new Technician("Kiran");

        Computer computer = new Computer(person);
        computer.operate();

        System.out.println("Technician remains an independent object.");
    }
}
