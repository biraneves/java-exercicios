import java.util.Scanner;

class HeartRates {

    private String firstName;
    private String lastName;
    private int birthDay;
    private int birthMonth;
    private int birthYear;

    public HeartRates(String firstName, String lastName, int birthDay, int birthMonth, int birthYear) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;

    }

    public String getFirstName() {

        return firstName;

    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;

    }

    public String getLastName() {

        return lastName;

    }

    public void setLastName(String lastName) {

        this.lastName = lastName;

    }

    public int getBirthDay() {

        return birthDay;

    }

    public void setBirthDay(int birthDay) {

        this.birthDay = birthDay;

    }

    public int getBirthMonth() {

        return birthMonth;

    }

    public void setBirthMonth(int birthMonth) {

        this.birthMonth = birthMonth;

    }

    public int getBirthYear() {

        return birthYear;

    }

    public void setBirthYear(int birthYear) {

        this.birthYear = birthYear;

    }

    public String getBirthDate() {

        String birthDate = String.format("%d/%d/%d", birthDay, birthMonth, birthYear);

        return birthDate;

    }

    public int getAge(int currentYear) {

        return currentYear - birthYear;

    }

    public int getMaxHeartRate(int currentYear) {

        return 220 - getAge(currentYear);

    }

    public String getTargetHeartRate(int currentYear) {

        int minHeartRate = (int)(0.50 * (double) getMaxHeartRate(currentYear));
        int maxHeartRate = (int)(0.85 * (double) getMaxHeartRate(currentYear));

        String targetHeartRate = String.format("%d - %d", minHeartRate, maxHeartRate);

        return targetHeartRate;

    }

}

class HeartRatesTest {

    public static void printLine(String character, int length) {

        String line = "";

        for (int i = 0; i < length; i++) {

            line += character;

        }

        System.out.println(line);

    }

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("First name: ");
        String firstName = input.nextLine();

        System.out.print("Last name: ");
        String lastName = input.nextLine();

        System.out.print("Day of birth (1 - 31): ");
        int birthDay = input.nextInt();

        System.out.print("Month of birth (1 - 12): ");
        int birthMonth = input.nextInt();

        System.out.print("Year of birth (4 digits): ");
        int birthYear = input.nextInt();

        input.close();

        HeartRates hr = new HeartRates(firstName, lastName, birthDay, birthMonth, birthYear);
        int currentYear = 2022;

        printLine("-", 64);

        System.out.println("Name: " + hr.getFirstName() + " " + hr.getLastName());
        System.out.println("Birth date: " + hr.getBirthDate());
        System.out.println("Age (approx.): " + hr.getAge(currentYear) + " years old");

        printLine("-", 64);

        System.out.println("Max heart rate: " + hr.getMaxHeartRate(currentYear) + " bpm");
        System.out.println("Target heart rate (min - max): (" + hr.getTargetHeartRate(currentYear) + ") bpm");

        printLine("-", 64);

    }

}