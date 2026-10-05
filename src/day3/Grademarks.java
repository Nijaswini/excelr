package day3;
import java.util.Scanner;

public class Grademarks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks");
        }
        else if (marks >= 90) {
            System.out.println("congratulations you got Grade A");
        }
        else if (marks >= 80) {
            System.out.println("Good you got Grade B");
        }
        else if (marks >= 70) {
            System.out.println("you got Grade C");
        }
        else if (marks >= 60) {
            System.out.println("Better luck next time you got Grade D");
        }
        else {
            System.out.println("sorry you got Grade F");
        }
    }
}

