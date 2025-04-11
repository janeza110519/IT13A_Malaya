package PRACTICE;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Base64;

public class FOOD_ORDERING_SYSTEM {
    
    // Caesar Cipher encryption
    public static String encrypt(String input, int key) {
        StringBuilder encryptedMessage = new StringBuilder();
        
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            
            if (Character.isLetter(c)) {
                char encryptedChar = (char) (c + key);
                
                if ((Character.isLowerCase(c) && encryptedChar > 'z') ||
                        (Character.isUpperCase(c) && encryptedChar > 'Z')) {
                    encryptedChar -= 26; // Wrap around if it exceeds 'z' or 'Z'
                }
                encryptedMessage.append(encryptedChar);
            } else {
                encryptedMessage.append(c); // Append non-letter characters as is
            }
        }
        
        // After Caesar Cipher, Base64 encode the result
        return Base64.getEncoder().encodeToString(encryptedMessage.toString().getBytes());
    }

    // Decrypt method (Base64 decoding)
    public static String decrypt(String input) {
        byte[] decodedBytes = Base64.getDecoder().decode(input);
        return new String(decodedBytes);
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        FileWriter myWriter = new FileWriter ("C:\\Users\\user\\Documents\\masatuma.txt");
        String username, password;
        int key = 3; // Caesar cipher shift key (you can change this to any value)
        String validUsernameEncrypted = encrypt ("resto", key);
        String validPasswordEncrypted = encrypt ("bsit", key);
       // myWriter.write(encryptedMessage);
        
        // Login system (using encrypted username and password)
        

        System.out.println("=== Java Diner Login ===");
        System.out.print("Enter username: ");
        username = scanner.nextLine();
        System.out.print("Enter password: ");
        password = scanner.nextLine();

        String encryptedUsername = encrypt(username, key);
        String encryptedPassword = encrypt(password, key);

        if (!encryptedUsername.equals(validUsernameEncrypted) || 
            !encryptedPassword.equals(validPasswordEncrypted)) {
            System.out.println("Login failed. Exiting program.");
            scanner.close();
            return;
        }

        System.out.println("Login successful!\n");

        int choice;
        double totalPrice = 0;

        do {
            // Display menu
            System.out.println("=== Welcome to M A S A T U M A Resto ===");
            System.out.println("1 - Icecream ($20)");
            System.out.println("2 - Milktea ($45)");
            System.out.println("3 - Fries ($25)");
            System.out.println("4 - Exit");
            System.out.print("Enter your choice: ");
            
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("You ordered an Icecream!");
                    totalPrice += 20;
                    System.out.println("Subtotal: $" + totalPrice);
                    break;
                case 2:
                    System.out.println("You ordered a Milktea!");
                    totalPrice += 45;
                    System.out.println("Subtotal: $" + totalPrice);
                    break;
                case 3:
                    System.out.println("You ordered Fries!");
                    totalPrice += 25;
                    System.out.println("Subtotal: $" + totalPrice);
                    break;
                case 4:
                    System.out.println("\n=============================================");
                    System.out.println("Thank you for purchasing! Liko-Liko kaw ra!");
                    break;
                default:
                    System.out.println("Invalid choice! Please select a valid option.");
            }
        } while (choice != 4);

        // Display total bill if any items were ordered
        if (totalPrice > 0) {
            System.out.println("-----------------------------");
            System.out.println("Your total bill is: $" + totalPrice);
            System.out.println("-----------------------------");
            System.out.println("=============================================");
        }

        scanner.close();
    }
}
