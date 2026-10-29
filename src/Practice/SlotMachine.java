package Practice;
import java.util.Scanner;
import java.util.Random;
public class SlotMachine {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 100;
        int bet;
        String[] row;
        
        System.out.println("Welcome to Slot Machine!");
        System.out.println("Symbols: 🍔 🍿 🧂 🥞 🧇");
        
        while (balance > 0) {
            System.out.println("\nCurrent balance: $" + balance);
            System.out.print("Enter your bet: ");
            bet = scanner.nextInt();
            
            if (bet > balance) {
                System.out.println("Insufficient funds!");
                continue;
            }
            else if (bet <= 0) {
                System.out.println("Bet must be more than zero rupees!");
                continue;
            }
            
            // Deduct the bet since it is valid
            else{balance -= bet;
            System.out.println("Remaining balance: $" + balance);
            }
            System.out.println("Spinning...");
            row = spinRow();
            
            // Display the results neatly side by side
            System.out.println("[ " + row[0] + " | " + row[1] + " | " + row[2] + " ]");
            
            // Basic Payout Logic
            if (row[0].equals(row[1]) && row[1].equals(row[2])) {
                int payout = bet * 5; // 5x payout for a win
                balance += payout;
                System.out.println("🎉 JACKPOT! You won $" + payout);
            } else {
                System.out.println("❌ No match. Try again!");
            }
        }
        
        System.out.println("\nGame over! You ran out of money.");
        scanner.close();
    }
    
    // Corrected to lowercase "static"
    static String[] spinRow() {
        String[] symbols = {"🍔", "🍿", "🧂", "🥞", "🧇"};
        String[] row = new String[3];
        Random random = new Random();
        
        // Populate all 3 slots of the row randomly
        for (int i = 0; i < row.length; i++) {
            row[i] = symbols[random.nextInt(5)]; // Generates a number from 0 to 4
        }
        
        return row; // Returns the generated 3-symbol array
    }
}
	