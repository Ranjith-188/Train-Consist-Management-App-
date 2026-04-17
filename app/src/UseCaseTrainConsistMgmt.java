import java.util.*;

public class UseCaseTrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("===================================");
        System.out.println(" UC4 - Maintain Ordered Bogie Consist ");
        System.out.println("===================================\n");

        // Step 1: Create LinkedList
        LinkedList<String> trainConsist = new LinkedList<>();

        // Step 2: Add bogies
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("Initial Train Consist:");
        System.out.println(trainConsist);

        // Step 3: Insert Pantry Car at position 2
        trainConsist.add(2, "Pantry Car");

        System.out.println("\nAfter Adding Pantry Car at Position 2:");
        System.out.println(trainConsist);

        // Step 4: Remove first and last bogie
        trainConsist.removeFirst();
        trainConsist.removeLast();

        // Step 5: Display final consist
        System.out.println("\nFinal Train Consist:");
        System.out.println(trainConsist);
    }
}