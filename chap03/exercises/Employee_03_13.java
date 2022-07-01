class Employee {

    private String firstName;
    private String lastName;
    private double paymentPerMonth;

    public Employee(String firstname, String lastName, double paymentPerMonth) {

        this.firstName = firstname;
        this.lastName = lastName;

        if (paymentPerMonth > 0.0) {

            this.paymentPerMonth = paymentPerMonth;

        }

    }

    public String getFirstName() {

        return firstName;

    }

    public String getLastName() {

        return lastName;

    }

    public double getPaymentPerMonth() {

        return paymentPerMonth;

    }

    public void setPaymentPerMonth(double paymentPerMonth) {

        if (paymentPerMonth > 0.0) {

            this.paymentPerMonth = paymentPerMonth;

        }

    }

}

class EmployeeTest {

    public static void printLine(String character, int length) {

        String line = "";

        for (int i = 0; i < length; i++) {

            line += character;

        }

        System.out.println(line);

    }

    public static void main(String[] args) {
        
        Employee employee1 = new Employee("Jane", "Green", 2000.00);
        Employee employee2 = new Employee("John", "Blue", -1800.00);

        printLine("-", 64);

        System.out.printf("%s's initial payment per month: $%.2f%n", 
            employee1.getFirstName(), employee1.getPaymentPerMonth());
        System.out.printf("%s's initial payment per month: $%.2f%n",
            employee2.getFirstName(), employee2.getPaymentPerMonth());
        employee2.setPaymentPerMonth(1800.00);
        System.out.printf("Adjusting %s's payment per month...%n", employee2.getFirstName());
        System.out.printf("%s's initial payment per month: $%.2f%n", 
            employee1.getFirstName(), employee1.getPaymentPerMonth());
        System.out.printf("%s's initial payment per month: $%.2f%n",
            employee2.getFirstName(), employee2.getPaymentPerMonth());
        
        printLine("-", 64);

        System.out.printf("Raising %s's payment per month in 10%%%n", employee1.getFirstName());
        employee1.setPaymentPerMonth(employee1.getPaymentPerMonth() * 1.1);
        System.out.printf("Raising %s's payment per month in 10%%%n", employee2.getFirstName());
        employee2.setPaymentPerMonth(employee2.getPaymentPerMonth() * 1.1);
        System.out.printf("%s's new payment per month: $%.2f%n", 
            employee1.getFirstName(), employee1.getPaymentPerMonth());
        System.out.printf("%s's new payment per month: $%.2f%n",
            employee2.getFirstName(), employee2.getPaymentPerMonth());
        
        printLine("-", 64);

        System.out.printf("%s's annual payment: $%.2f%n", 
            employee1.getFirstName(), employee1.getPaymentPerMonth() * 12.0);
        System.out.printf("%s's annual payment: $%.2f%n", 
            employee2.getFirstName(), employee2.getPaymentPerMonth() * 12.0);

    }

}