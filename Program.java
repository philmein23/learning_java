
// import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.nio.file.Paths;
import java.util.Scanner;

class Program {

    public static void main(String[] args) {
        JokeManager manager = new JokeManager();
        Scanner scanner = new Scanner(System.in);

        UserInterface2 i = new UserInterface2(scanner, manager);
        i.start();

    };

    public static void runTimer() {

        Timer timer = new Timer();

        while (true) {
            System.out.println(timer);
            timer.advance();

            try {
                Thread.sleep(10);
            } catch (Exception e) {

            }
        }

    }

    public static void parseCSV() {

        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();

        ArrayList<Person> records = StoringRecords.readRecordsFromFile(fileName);

        for (Person person : records) {
            System.out.println(person);
        }
    }

    public static void addAccount() {

        Account artosAccount = new Account("Arto's account", 100.00);
        Account artosSwissAcount = new Account("Arto's account in Switzerland", 1000000.00);

        System.out.println("Initial state:");
        System.out.println(artosSwissAcount);

        artosAccount.withdraw(20);
        System.out.println("The balance of Arto's account is now: " + artosAccount.balance());
        artosSwissAcount.deposit(200.00);
        System.out.println("The balance of Arto's other account is now: " + artosSwissAcount.balance());

        System.out.print("End state");
        System.out.println(artosAccount);
        System.out.println(artosSwissAcount);

    }

    public static void calcStatistics() {

        Statistics statistics = new Statistics();
        Statistics statistics_odd = new Statistics();
        Statistics statistics_even = new Statistics();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers");

        int num = Integer.valueOf(scanner.nextLine());

        while (num > 0) {
            if (num % 2 == 0) {
                statistics_even.addNumber(num);
            } else {
                statistics_odd.addNumber(num);
            }
            statistics.addNumber(num);
            scanner = new Scanner(System.in);
            num = Integer.valueOf(scanner.nextLine());

        }

        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum even numbers: " + statistics_even.sum());
        System.out.println("Sum odd numbers: " + statistics_odd.sum());

    }

    public static void readAndPrintFileContent() {
        try (Scanner scanner = new Scanner(Paths.get("file.txt"))) {

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println(("Error: " + e.getMessage()));
        }
    }

    // public static void addItems() {
    // Scanner scanner = new Scanner(System.in);
    // ArrayList<Item> itemList = new ArrayList<>();

    // while (true) {
    // System.out.print("Name: ");
    // String itemName = scanner.nextLine();

    // if (itemName.isEmpty()) {
    // break;
    // }

    // itemList.add(new Item(itemName));
    // }

    // for (Item item : itemList) {
    // System.out.println(item);
    // }
    // }

    public static void addTelevisionPrograms() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<TelevisionProgram> televisionsPrograms = new ArrayList<>();
        int maxDuration;

        while (true) {
            System.out.print("Name: ");
            String programName = scanner.nextLine();

            if (programName.isEmpty())
                break;

            System.out.print("Duration: ");
            int duration = Integer.valueOf(scanner.nextLine());

            televisionsPrograms.add(new TelevisionProgram(programName, duration));
        }

        System.out.print("Program's maximum duration: ");
        maxDuration = Integer.valueOf(scanner.nextLine());

        for (TelevisionProgram tp : televisionsPrograms) {
            if (tp.getDuration() <= maxDuration) {
                System.out.println(tp);
            }
        }

    }
}
