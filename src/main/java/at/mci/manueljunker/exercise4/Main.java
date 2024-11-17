package at.mci.manueljunker.exercise4;

import java.util.Scanner;

/**
 * Main class that serves as the entry point of the application.
 */
public class Main {
    public static void main(String[] args) {
        // Create a connection object using the proxy to control access
        Connection connection = new ConnectionProxy();
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a URL to connect
        System.out.println("Enter URL to connect: ");
        String url = scanner.nextLine();

        try {
            // Attempt to connect to the provided URL
            connection.connect(url);
        } catch (Exception e) {
            // Print the exception message if access is denied
            System.out.println(e.getMessage());
        } finally {
            // Close the scanner resource to avoid resource leaks
            scanner.close();
        }
    }
}