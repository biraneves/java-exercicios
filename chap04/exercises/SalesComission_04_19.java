import java.util.Scanner;

class Employee {

    private String name;
    private double payment;

    public Employee(String name) {

        this.name = name;

    }

    public String getName() {

        return name;

    }

    public void setPayment(double payment) {

        if (payment > 0.0)
            this.payment = payment;

    }

    public double getPayment() {

        return payment;

    }

    public String toString() {

        return "Employee: " + name;

    }

}

class Sale {

    private Person salesperson;
    private double totalWeekSales = 0.0;

    public Sale(Person salesperson) {

        this.salesperson = salesperson;

    }

    public String getSalesperson() {

        return salesperson;

    }

    public double getWeekSales() {

        return totalWeekSales;

    }

    public void addSaleValue(double saleValue) {

        if (saleValue > 0.0)
            totalWeekSales += saleValue;

    }

}

