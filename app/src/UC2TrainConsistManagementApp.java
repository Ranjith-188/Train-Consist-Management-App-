import java.util.ArrayList;
import java.util.List;

public class UC2TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("==============================================");
        System.out.println("   UC2 - Add Passenger Bogies to Train ");
        System.out.println("==============================================\n");

        List<String> passengerBogies = new ArrayList<>();

        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("Bogies after addition: " + passengerBogies);

        passengerBogies.remove("AC Chair");

        System.out.println("Bogies after removal: " + passengerBogies);

        String checkBogie = "Sleeper";
        if (passengerBogies.contains(checkBogie)) {
            System.out.println(checkBogie + " bogie is present in the train.");
        } else {
            System.out.println(checkBogie + " bogie is NOT present in the train.");
        }

        System.out.println("\nFinal Train Consist: " + passengerBogies);
        System.out.println("\nUC2 completed successfully...");
    }
}