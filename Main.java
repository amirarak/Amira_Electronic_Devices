// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] companies = {
                "Apple", "Samsung", "Lenovo", "Dell", "HP (Hewlett-Packard)",
                "Microsoft", "Sony", "ASUS", "Acer", "Huawei",
                "LG", "Toshiba", "MSI", "Razer", "Google (Pixel)",
                "OnePlus", "Xiaomi", "JBL", "Bose", "Sennheiser"
        };

        int[] memories = { 16, 32, 64, 128, 256, 512, 1024, 2048, 8, 4 };

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of devices you want to create (between 1 and 20): ");
        int numberOfDevices = scanner.nextInt();

        if (numberOfDevices < 1 || numberOfDevices > 20) {
            System.out.println("Please enter a valid number between 1 and 20.");
            return;
        }

        ArrayList<Device> devices = new ArrayList<>();
        ArrayList<String> distinctTypes = new ArrayList<>();

        Random rand = new Random();

        for (int i = 0; i < numberOfDevices; i++) {
            String[] possibleTypes = { "Smartphone", "Laptop", "Tablet" };
            String randomType = possibleTypes[rand.nextInt(possibleTypes.length)];
            double randomStorage = Math.round(rand.nextDouble() * 1000.0);
            double randomWeight = rand.nextDouble() * 5.0;

            if (randomType.equals("Smartphone")) {
                devices.add(new Smartphone(randomType, randomStorage, randomWeight, companies[rand.nextInt(20)] + " " + rand.nextInt(10, 20) + "S", memories[rand.nextInt(11)]));
            } else if (randomType.equals("Laptop")) {
                devices.add(new Laptop(randomType, randomStorage, randomWeight, companies[rand.nextInt(20)] + " " + rand.nextInt(10, 20) + "X", rand.nextInt(5, 15)));
            } else if (randomType.equals("Tablet")) {
                devices.add(new Tablet(randomType, randomStorage, randomWeight, companies[rand.nextInt(20)] + " " + rand.nextInt(7, 12) + "T", rand.nextBoolean()));
            }

            if (!distinctTypes.contains(randomType)) {
                distinctTypes.add(randomType);
            }
        }

        double totalStorage = 0;
        double totalWeight = 0;

        for (Device device : devices) {
            totalStorage += device.getStorage();
            totalWeight += device.getWeight();
        }

        System.out.println("Number of distinct device types created: " + distinctTypes.size());
        System.out.println("Total storage of all devices: " + totalStorage + " GB");
        System.out.println("Total weight of all devices: " + totalWeight + " kg");

        for (Device device : devices) {
            System.out.println("Device Type: " + device.getType());
            System.out.println("Device Model: " + device.getModel());
            System.out.println("Device Storage: " + device.getStorage() + " GB");
            System.out.println("Device Weight: " + device.getWeight() + " kg");
            System.out.println();
        }

        scanner.close();
    }
}