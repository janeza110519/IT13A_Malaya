package MIDTERM;

import java.io.FileWriter;
import java.io.IOException;

public class ENCRYPTION_FILEHANDLING {

    public static void main(String[] args) throws IOException {
        String encryptedMessage;
        try (FileWriter myWriter = new FileWriter("C:\\Users\\Admin\\Documents\\MALAYA.txt")) {
            int key = 6;
            String message = "I love you! \n Gwapa ko!\n Buotan si Ma'am.";
            encryptedMessage = encryptMessage(message, key);
            myWriter.write(encryptedMessage);
        }
        System.out.println("Successfully wrote to the file. ");
        System.out.println(encryptedMessage);
    }

    public static String encryptMessage(String message, int key) {
        char[] chars = message.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '\n') {
                chars[i] += key;
            }

        }
        return new String(chars);
    }
}

