package day6;

class Calculator {
    int add(int x, int y) {
        return x + y;
    }

    double add(double x, double y) {
        return x + y;
    }

    int add(int[] values) {
        int total = 0;

        for (int value : values) {
            total += value;
        }

        return total;
    }
}

public class Main3 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Integer addition: "
                + calculator.add(15, 25));

        System.out.println("Decimal addition: "
                + calculator.add(4.25, 2.75));

        int[] marks = {12, 18, 20, 25};

        System.out.println("Array addition: "
                + calculator.add(marks));
    }
}