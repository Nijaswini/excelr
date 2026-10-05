package day3;

import java.util.Scanner;

public class VotingAndDrivingEligibility {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Has license (true/false): ");
        boolean hasLicense = sc.nextBoolean();

        if (age >= 18 && hasLicense) {
            System.out.println("Eligible to vote and drive");
        } else {
            System.out.println("Not eligible");
        }
    }
}