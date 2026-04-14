import java.util.Scanner;

class Account {
    private double balance;

    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) throws Exception {
        if (amount <= 0) {
            throw new Exception("Error: Invalid amount. Please enter a positive value.");
        }
        if (amount > balance) {
            throw new Exception("Error: Insufficient balance.");
        }
        balance -= amount;
        System.out.println("Transaction successful");
    }
}

public class ATM {
    private static final int PIN = 1234;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account userAccount = new Account(2000.0);

        try {
            System.out.print("Enter PIN: ");
            int enteredPin = Integer.parseInt(scanner.nextLine());

            if (enteredPin != PIN) {
                System.out.println("Access Denied: Incorrect PIN.");
                return;
            }

            boolean running = true;
            while (running) {
                System.out.println("\n1. Withdraw\n2. Check Balance\n3. Exit");
                System.out.print("\nEnter choice: ");
                
                try {
                    int choice = Integer.parseInt(scanner.nextLine());

                    switch (choice) {
                        case 1:
                            System.out.print("Enter amount: ");
                            double amount = Double.parseDouble(scanner.nextLine());
                            userAccount.withdraw(amount);
                            break;
                        case 2:
                            System.out.println("Balance: " + userAccount.getBalance());
                            break;
                        case 3:
                            System.out.println("Thank you for using ATM");
                            running = false;
                            break;
                        default:
                            System.out.println("Invalid choice. Please try again.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Error: Please enter a valid numeric value.");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: PIN must be a number.");
        } finally {
            scanner.close();
        }
    }
}
