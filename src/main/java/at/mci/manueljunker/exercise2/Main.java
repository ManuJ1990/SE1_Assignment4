package at.mci.manueljunker.exercise2;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        // Eingabe vom Benutzer
        System.out.print("Text eingeben: ");
        String input = scanner.nextLine();

        // Eingabe in einen InputStream umwandeln
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());

        try (FilterStream filterStream = new FilterStream(inputStream)) {
            int character;
            System.out.println("Maskierte Ausgabe: ");
            while ((character = filterStream.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (IOException e) {
            System.out.println("Fehler: " + e.getMessage());
        }
    }
}