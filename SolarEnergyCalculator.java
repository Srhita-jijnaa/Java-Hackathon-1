
import java.util.Scanner;

public class SolarEnergyCalculator {

    // Method to calculate total energy generated
    public static double calculateTotalEnergy(double morningEnergy, double eveningEnergy) {
        return morningEnergy + eveningEnergy;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading morning energy value from user
        System.out.print("Enter morning energy generated (in kWh): ");
        double morningEnergy = scanner.nextDouble();

        // Reading evening energy value from user
        System.out.print("Enter evening energy generated (in kWh): ");
        double eveningEnergy = scanner.nextDouble();

        // Calling the method
        double totalEnergy = calculateTotalEnergy(morningEnergy, eveningEnergy);

        // Displaying the total energy generated
        System.out.println("Total Energy Generated: " + totalEnergy + " kWh");

        scanner.close();
    }
}

