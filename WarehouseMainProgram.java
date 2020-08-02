import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class WarehouseMainProgram {
    public static void main(String[] args) {
        ProductWarehouseWithHistory juice = new ProductWarehouseWithHistory("Juice", 1000.0, 1000.0);
        juice.takeFromWarehouse(11.3);
        juice.addToWarehouse(1.0);
        // System.out.println(juice.history()); // [1000.0, 988.7, 989.7]

        juice.printAnalysis();

        ArrayList<String> names = new ArrayList<>();
        names.add("Phil");
        names.add("Bobby");
        names.add("Sky");

        System.out.println(names);

        List<String> names2 = names.stream().map(person -> person.toUpperCase()).collect(Collectors.toList());

        System.out.println(names2);
        System.out.println(names);

    }
}