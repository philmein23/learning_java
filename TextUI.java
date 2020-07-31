import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dict;

    public TextUI(Scanner scanner, SimpleDictionary dict) {
        this.scanner = scanner;
        this.dict = dict;
    }

    public void start() {
        System.out.println("Enter a command");
        System.out.print("Command: ");
        String command = this.scanner.nextLine();

        while (true) {
            if (command.equals("add")) {
                System.out.print("Word: ");
                String word = this.scanner.nextLine();
                System.out.print("Translation: ");
                String translation = this.scanner.nextLine();

                this.dict.add(word, translation);
            } else if (command.equals("search")) {
                System.out.print("To be translated: ");
                String word = this.scanner.nextLine();
                System.out.print("Translation: ");
                System.out.print(this.dict.translate(word));
                System.out.println("");

            } else if (command.equals("end")) {
                System.out.println("Bye Bye");
                break;
            } else {
                System.out.println("Unknown command");
            }

            System.out.print("Command: ");
            command = this.scanner.nextLine();
        }
    }
}