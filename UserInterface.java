import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private TodoList todoList;

    public UserInterface(Scanner scanner, TodoList todoList) {
        this.scanner = scanner;
        this.todoList = todoList;
    }

    public void start() {
        System.out.println("Enter a command");
        System.out.print("Command: ");
        String command = this.scanner.nextLine();

        while (true) {
            if (command.equals("add")) {
                System.out.print("To add: ");
                String task = this.scanner.nextLine();
                this.todoList.add(task);

            } else if (command.equals("remove")) {
                System.out.print("Which one is removed : ");
                String taskNumber = this.scanner.nextLine();
                this.todoList.remove(Integer.valueOf(taskNumber));
                System.out.println("");

            } else if (command.equals("list")) {
                this.todoList.print();
            } else if (command.equals("stop")) {
                break;
            } else {
                System.out.println("Unknown command");
            }

            System.out.print("Command: ");
            command = this.scanner.nextLine();
        }
    }
}