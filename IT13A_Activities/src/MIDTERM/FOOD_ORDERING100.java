package MIDTERM;

import java.io.*;
import java.util.*;

public class FOODORDERING100 {

    // Caesar Cipher encrypt
    public static String encryptMessage(String message, int key) {
        char[] chars = message.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] += key;

        }
        return new String(chars);
    }

    // Caesar Cipher decrypt
    public static String decryptMessage(String message, int key) {
        char[] chars = message.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] -= key;

        }
        return new String(chars);
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int key = 3;
        String filePath = "C:\\Users\\Admin\\Documents\\project.txt";

        while (true) {
            System.out.println("=== M A S A T U M A Resto ===");
            System.out.println("1 - Login and Order");
            System.out.println("2 - View Past Orders (Decrypted)");
            System.out.println("3 - Exit");
            System.out.print("Choose an option: ");
            int mainChoice;
            try {
                mainChoice = scanner.nextInt();
                scanner.nextLine(); // clear newline
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid number.");
                scanner.nextLine(); // clear invalid input
                continue;
}


            if (mainChoice == 1) {
                // Login
                System.out.print("Enter username: ");
                String username = scanner.nextLine();
                System.out.print("Enter password: ");
                String password = scanner.nextLine();

                String validUser = "resto";
                String validPass = "bsit";

                if (!username.equals(validUser) || !password.equals(validPass)) {
                    System.out.println("Invalid credentials. Exiting login.\n");
                    continue;
                }

                System.out.println("\nLogin successful!\n");

                // Ordering
                double totalPrice = 0;
                int choice;

                do {
                    System.out.println("=== Menu ===");
                    System.out.println("1 - Icecream ($20)");
                    System.out.println("2 - Milktea ($45)");
                    System.out.println("3 - Fries ($25)");
                    System.out.println("4 - Checkout");
                    System.out.print("Enter your choice: ");
                    choice = scanner.nextInt();

                    switch (choice) {
                        case 1:
                            totalPrice += 20;
                            System.out.println("Added Icecream. Subtotal: $" + totalPrice);
                            break;
                        case 2:
                            totalPrice += 45;
                            System.out.println("Added Milktea. Subtotal: $" + totalPrice);
                            break;
                        case 3:
                            totalPrice += 25;
                            System.out.println("Added Fries. Subtotal: $" + totalPrice);
                            break;
                        case 4:
                            System.out.println("Checking out...");
                            break;
                        default:
                            System.out.println("Invalid choice.");
                    }
                } while (choice != 4);

                if (totalPrice > 0) {
                    String summary = "Customer ordered. Total bill: $" + totalPrice;
                    String encrypted = encryptMessage(summary, key);

                    FileWriter writer = new FileWriter(filePath, true);
                    writer.write(encrypted + "\n");
                    writer.close();

                    System.out.println("Order saved (encrypted).");
                    System.out.println("Encrypted: " + encrypted);
                } else {
                    System.out.println("No items ordered.");
                }

            } else if (mainChoice == 2) {
                // Decrypt and view orders
                File file = new File(filePath);
                if (!file.exists()) {
                    System.out.println("No order history found.");
                    continue;
                }

                System.out.println("\n--- Decrypted Order History ---");
                BufferedReader reader = new BufferedReader(new FileReader(filePath));
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(decryptMessage(line, key));
                }
                reader.close();
                System.out.println("-------------------------------\n");

            } else if (mainChoice == 3) {
                System.out.println("Thank you for Purchasing in M A S A T U M A Resto!");
                break;
            } else {
                System.out.println("Invalid option.");
            }
        }

        scanner.close();
    }
}