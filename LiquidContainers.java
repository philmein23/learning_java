import java.util.Scanner;

public class LiquidContainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Container firstContainer = new Container();
        Container secondContainer = new Container();

        while (true) {
            System.out.println(String.format("First: %s", firstContainer));
            System.out.println(String.format("Second: %s", secondContainer));
            String[] parts = scanner.nextLine().split(" ");
            String command = parts[0];
            int amount = 0;
            if (parts.length == 2) {
                amount = Integer.valueOf(parts[1]);
            }

            if (command.equals("add")) {
                firstContainer.add(amount);
            }

            if (command.equals("move")) {
                firstContainer.remove(amount);
                secondContainer.add(amount);
            }

            if (command.equals("remove")) {
                secondContainer.remove(amount);
            }

            if (command.equals("quit"))
                break;

        }

    };

}