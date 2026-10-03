import java.util.*;
public class SolarMoniter {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter energy generated in Kwh");
        Double energyGenerated = obj.nextDouble();
        if(energyGenerated >= 10.0) {
            System.out.println("Good Energy Generation");
        } else {
            System.out.println("Low Energy Generation");

        }
        obj.close();
    }
}


