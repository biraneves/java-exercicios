import java.util.Scanner;

class HealthProfile {

    private String firstName;
    private String lastName;
    private String sex;
    private int birthDay;
    private int birthMonth;
    private int birthYear;
    private double height;
    private double weight;

    public HealthProfile(String firstName, String lastName, String sex, int birthDay,
        int birthMonth, int birthYear, double height, double weight) {
        
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.height = height;
        this.weight = weight;
        
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

    public String getSex() {

        return sex;

    }

    public void setSex(String sex) {

        this.sex = sex;

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

        return birthDay + "/" + birthMonth + "/" + birthYear;

    }
    
    public double getHeight() {

        return height;

    }

    public void setHeight(double height) {

        this.height = height;

    }

    public double getWeight() {

        return weight;

    }

    public void setWeight(double weight) {

        this.weight = weight;

    }

    public String getFullName() {

        return firstName + " " + lastName;

    }

    public int getAge(int currentYear) {

        return currentYear - birthYear;

    }

    public int getMaxHeartRate(int currentYear) {

        return 220 - getAge(currentYear);

    }

    public int getMinTargetHeartRate(int currentYear) {

        return (int)(0.50 * (double)getMaxHeartRate(currentYear));

    }

    public int getMaxTargetHeartRate(int currentYear) {

        return (int)(0.85 * (double)getMaxHeartRate(currentYear));

    }

    public double getBMI() {

        return weight / (height * height);

    }

    public String getBMITable() {

        String bmiTable = "===========================================\n";
        bmiTable += "BMI (kg/m^2)     Status\n";
        bmiTable += "-------------------------------------------\n";
        bmiTable += "< 16.0           Severe thinness\n";
        bmiTable += "16.0 - 17.0      Moderate thinness\n";
        bmiTable += "17 - 18.5        Mild thinness\n";
        bmiTable += "18.5 - 25.0      Normal\n";
        bmiTable += "25.0 - 30.0      Overweight\n";
        bmiTable += "30.0 - 35.0      Obese class I\n";
        bmiTable += "35.0 - 40.0      Obese class II\n";
        bmiTable += ">40.0            Obese class III\n";
        bmiTable += "===========================================";

        return bmiTable;

    }

}

class HealthProfileTest {

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

        System.out.print("Sex (F/M): ");
        String sex = input.nextLine();

        System.out.print("Birth day (1 - 31): ");
        int birthDay = input.nextInt();

        System.out.print("Birth month (1 - 12): ");
        int birthMonth = input.nextInt();

        System.out.print("Birth year (4 digits): ");
        int birthYear = input.nextInt();

        System.out.print("Height (m): ");
        double height = input.nextDouble();

        System.out.print("Weight (kg): ");
        double weight = input.nextDouble();

        HealthProfile hp = new HealthProfile(firstName, lastName, sex, birthDay, birthMonth, birthYear, height, weight);
        int currentYear = 2022;

        printLine("=", 64);
        System.out.println("Name: " + hp.getFullName());
        System.out.println("Sex: " + hp.getSex());
        System.out.println("Birth date: " + hp.getBirthDate());
        System.out.println("Age (approx.): " + hp.getAge(currentYear));
        System.out.println("Height: " + hp.getHeight() + "m");
        System.out.println("Weight: " + hp.getWeight() + "kg");

        printLine("-", 64);
        System.out.println("Max heart rate: " + hp.getMaxHeartRate(currentYear) + " bpm");
        System.out.println("Target heart rate: (" +
            hp.getMinTargetHeartRate(currentYear) + " - " + 
            hp.getMaxTargetHeartRate(currentYear) + ") bpm");
        System.out.printf("BMI: %.1f kg/m^2\n", hp.getBMI());
        printLine("=", 64);

        System.out.println();
        System.out.println(hp.getBMITable());;

    }

}