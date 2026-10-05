package day3;

import java.util.Scanner;

public class LargerNumberUsingTernaryOperator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int large = (a > b) ? a : b;

        System.out.println("Larger number = " + large);
    }
}