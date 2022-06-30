class Invoice {

    private String number;
    private String description;
    private int quantity;
    private double price;

    // Constructor
    public Invoice(String number, String description, int quantity, double price) {

        this.number = number;
        this.description = description;

        if (quantity > 0)
            this.quantity = quantity;
        else
            this.quantity = 0;
        
        if (price > 0.0)
            this.price = price;
        else
            this.price = 0.0;

    }

    // Returns the invoice number
    public String getNumber() {

        return number;

    }

    // Sets a new description
    public void setDescription(String description) {

        this.description = description;

    }

    // Returns the invoice description
    public String getDescription() {

        return description;

    }

    // Sets a new quantity
    public void setQuantity(int quantity) {

        if (quantity > 0)
            this.quantity = quantity;

    }

    // Returns the invoice quantity
    public int getQuantity() {

        return quantity;

    }

    // Sets a new price
    public void setPrice(double price) {

        if (price > 0.0)
            this.price = price;

    }

    // Returns the invoice price
    public double getPrice() {

        return price;

    }

    // Returns the invoice amount
    public double getInvoiceAmount() {

        return price * (double) quantity;

    }

}

class InvoiceTest {

    public static void main(String [] args) {

        Invoice invoice1 = new Invoice("001", "Laptop", 2, 1450.00);
        Invoice invoice2 = new Invoice("002", "Mouse", 15, 28.80);

        System.out.println("----------------------------------------------------------------------------------");
        System.out.printf("Number\t\tDescription\t\tQuantity\tPrice\t\tTotal%n");
        System.out.println("----------------------------------------------------------------------------------");
        System.out.printf("%s\t\t%s\t\t\t%d\t\t$%.2f\t$%.2f%n",
            invoice1.getNumber(), invoice1.getDescription(), invoice1.getQuantity(),
            invoice1.getPrice(), invoice1.getInvoiceAmount());
        System.out.printf("%s\t\t%s\t\t\t%d\t\t$%.2f\t\t$%.2f%n",
            invoice2.getNumber(), invoice2.getDescription(), invoice2.getQuantity(),
            invoice2.getPrice(), invoice2.getInvoiceAmount());
        System.out.println("----------------------------------------------------------------------------------");

    }

}