package ke.co.safaricom;

import java.util.Scanner;

public class CaesarCipherApp {
    public static void main(String[] args) {

        UserInput userInput = new UserInput();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Welcome to the Caesar Cipher App: ");
        System.out.print("Enter your option: 1 to encode, 2 to decode, 3 to exit ");
        int option = scanner.nextInt();

        System.out.print("Enter message: ");
        String message = scanner.next();

        System.out.print("Enter key: ");
        int key = scanner.nextInt();

        userInput.setOption(option);
        userInput.setMessage(message);
        userInput.setKey(key);


        Process.run(userInput);
    }
}