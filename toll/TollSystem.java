import java.util.Scanner;

public class TollSystem {
    public static double calculateTollFee(String type, boolean hasRFID) {
        double fee = type.equalsIgnoreCase("Car") ? 100 : type.equalsIgnoreCase("Truck") ? 200 : -1;
        return fee == -1 ? -1 : hasRFID ? fee * 0.9 : fee;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of vehicles: ");
        int numVehicles = scanner.nextInt();

        for (int i = 0; i < numVehicles; i++) {
            scanner.nextLine();
            System.out.printf("\nVehicle %d:\nEnter type (Car/Truck): ", i + 1);
            String type = scanner.nextLine();
            System.out.print("RFID pass? (yes/no): ");
            boolean hasRFID = scanner.nextLine().equalsIgnoreCase("yes");
            double fee = calculateTollFee(type, hasRFID);

            if (fee != -1) System.out.printf("Toll fee: ₹%.2f%n", fee);
            else System.out.println("Invalid vehicle type.");
        }
        scanner.close();
    }
}
