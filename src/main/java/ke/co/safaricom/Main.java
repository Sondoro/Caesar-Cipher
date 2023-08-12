package ke.co.safaricom;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        UserInput userInput = new UserInput();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter process: ");
        int process = scanner.nextInt();

        System.out.print("Enter message: ");
        String message = scanner.next();

        System.out.print("Enter key: ");
        int key = scanner.nextInt();

        userInput.setMessage(message);
        userInput.setKey(key);
        userInput.setProcess(process);

        Process.run(userInput);
    }
}