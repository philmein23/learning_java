
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;


public class StoringRecords {
    private static ArrayList<Person> personRecords = new ArrayList<>();

    public static ArrayList<Person> readRecordsFromFile(String file) {
        try (Scanner scanner = new Scanner(Paths.get(file))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                String name = parts[0];
                int age = Integer.valueOf(parts[1]);

                Person person = new Person(name, age);
                
                StoringRecords.personRecords.add(person);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return StoringRecords.personRecords;
    }
}