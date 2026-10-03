import java.util.Scanner;

public class RoofTopSolar {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int panelId;
        double energyGenerated;
        int numberOfPanels;
        char systemStatus;
        System.out.print("Enter Panel ID: ");
        panelId = obj.nextInt();
        System.out.print("Enter Energy Generated (kWh): ");
        energyGenerated = obj.nextDouble();
        System.out.print("Enter Number of Solar Panels: ");
        numberOfPanels = obj.nextInt();
        System.out.print("Enter System Status (A/I): ");
        systemStatus = obj.next().charAt(0);
        System.out.println("Panel ID: " + panelId);
        System.out.println("Energy Generated: " + energyGenerated + " kWh");
        System.out.println("Number of Solar Panels: " + numberOfPanels);
        System.out.println("System Status: " + systemStatus);
    }
}
