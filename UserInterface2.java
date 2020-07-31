import java.util.Scanner;

public class UserInterface2 {
    private Scanner scanner;
    private JokeManager jokeManager;

    public UserInterface2(Scanner scanner, JokeManager jokeManager) {
        this.scanner = scanner;
        this.jokeManager = jokeManager;
    }

    public void start() {
        System.out.println("Commands");
        System.out.println("1 - add a joke");
        System.out.println("2 - draw a joke");
        System.out.println("3 - list jokes");
        System.out.println("x - stop");
        String command = this.scanner.nextLine();

        while (true) {
            if (command.equals("1")) {
                System.out.println("Write the joke to be added ");
                String joke = this.scanner.nextLine();
                this.jokeManager.addJoke(joke);
            } else if (command.equals("2")) {
                System.out.println("Here's a joke for you: ");
                System.out.println(this.jokeManager.drawJokes());
                System.out.println("");
            } else if (command.equals("3")) {
                this.jokeManager.printJokes();
            } else if (command.equals("x")) {
                break;
            } else {
                System.out.println("Unknown command");
            }

            System.out.println("Commands: ");
            System.out.println("1 - add a joke");
            System.out.println("2 - draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("x - stop");
            command = this.scanner.nextLine();
        }
    }
}