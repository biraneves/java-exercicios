import java.util.Scanner;

class Trip {

    // Instance variables
    private int distance;
    private int fuelVolume;

    // Class attributes
    private static int totalDistance = 0;
    private static int totalFuelVolume = 0;

    // Constructor
    public Trip(int distance, int fuelVolume) {

        if (distance > 0) {
            this.distance = distance;
            totalDistance += distance;
        }

        if (fuelVolume > 0) {
            this.fuelVolume += fuelVolume;
            totalFuelVolume += fuelVolume;
        }

    }

    // Returns the distance associated to a particular trip
    public int getDistance() {

        return distance;

    }

    // Returns the fuel volume associated to a particular trip
    public int getFuelVolume() {

        return fuelVolume;

    }

    // Returns the total distance of all trips
    public static int getTotalDistance() {

        return totalDistance;

    }

    // Returns the total fuel volume of all trips
    public static int getTotalFuelVolume() {

        return totalFuelVolume;

    }

    // Returns the average fuel consumption of a particular trip
    public double getAverageTripConsumption() {

        if (fuelVolume > 0) {

            return (double) distance / (double) fuelVolume;

        }

        return -1.0;

    }

    // Returns the average fuel consumption of all trips
    public static double getAverageConsumption() {

        if (totalFuelVolume > 0) {

            return (double) totalDistance / (double) totalFuelVolume;

        }

        return -1.0;

    }
}

class TripTest {

    public static String drawLine(String character, int length) {

        String s = "";

        for (int i = 0; i < length; i++) {

            s += character;

        }

        return s;

    }

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int distance = 0;
        int fuelVolume = 0;
        int enterData = 0;

        System.out.println(drawLine("-", 80));

        System.out.print("Enter new trip data? (0 = no, 1 = yes) ");
        enterData = input.nextInt();

        while (enterData != 0) {

            System.out.print("Enter trip distance (km): ");
            distance = input.nextInt();

            System.out.print("Enter trip fuel consumption (L): ");
            fuelVolume = input.nextInt();

            if (distance > 0 && fuelVolume > 0) {

                Trip trip = new Trip(distance, fuelVolume);
                System.out.printf("Distance: %dkm - consumption: %dL - average consumption: %.1fkm/L\n",
                    trip.getDistance(), trip.getFuelVolume(), trip.getAverageTripConsumption());
                trip = null;

            }

            System.out.println(drawLine("-", 80));

            System.out.print("Enter new trip data? (0 = no, 1 = yes) ");
            enterData = input.nextInt();

        }

        input.close();

        System.out.println(drawLine("-", 80));

        System.out.printf("Total distance: %dkm - total fuel consumption: %dL - average consumption: %.1fkm/L\n",
            Trip.getTotalDistance(), Trip.getTotalFuelVolume(), Trip.getAverageConsumption());

    }

}