/*
1. Create a class called Invoice that a hardware store might use to represent an invoice for an item sold at the store. An
Invoice should include four pieces of information as instance variables— a part number (type String), a part description
(type String), a quantity of the item being purchased (type int) and a price per item (double). Your class should have a
constructor that initializes the four instance variables. Provide a set and a get method for each instance variable. In
addition, provide a method named getInvoiceAmount that calculates the invoice amount (i.e., multiplies the quantity by
the price per item), then returns the amount as a double value. If the quantity is not positive, it should be set to 0. If the
price per item is not positive, it should be set to 0.0. Write a test application named InvoiceTest that demonstrates class
Invoice’s capabilities.

Sample Output:
Original invoice information

Part number: 1234
Description: Hammer
Quantity: 2

Price: 14.95

Invoice amount: 29.90

Updated invoice information
Part number: 001234
Description: Yellow Hammer
Quantity: 3

Price: 19.49

Invoice amount: 58.47

Original invoice information
Part numbe

5678
Paint Brush

Price: 0.00
Invoice amount: 0.00

Updated invoice information
Part number: 5678
Description: Paint Brush
Quantity: 3

Price: 9.49

Invoice amount: 28.47
*/

import java.io.*;

class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        setQuantity(quantity);
        setPricePerItem(pricePerItem);
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            this.quantity = 0;
        }
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        if (pricePerItem > 0) {
            this.pricePerItem = pricePerItem;
        } else {
            this.pricePerItem = 0.0;
        }
    }

    public double getInvoiceAmount() {
        return quantity * pricePerItem;
    }
}

public class InvoiceTest {
    public static void main(String[] args) throws IOException {
        BufferedReader ad = new BufferedReader(new InputStreamReader(System.in));

        boolean continueBilling = true;

        while (continueBilling) {
            System.out.println("Enter part number:");
            String partNumber = ad.readLine();

            System.out.println("Enter part description:");
            String partDescription = ad.readLine();

            System.out.println("Enter quantity:");
            int quantity = Integer.parseInt(ad.readLine());

            System.out.println("Enter price per item:");
            double pricePerItem = Double.parseDouble(ad.readLine());

            Invoice invoice = new Invoice(partNumber, partDescription, quantity, pricePerItem);
            displayInvoice(invoice);

            // Option to update data
            System.out.println("Do you want to update this invoice? (yes/no)");
            String updateChoice = ad.readLine();

            if (updateChoice.equalsIgnoreCase("yes")) {
                System.out.println("Enter new part number:");
                partNumber = ad.readLine();
                invoice.setPartNumber(partNumber);

                System.out.println("Enter new part description:");
                partDescription = ad.readLine();
                invoice.setPartDescription(partDescription);

                System.out.println("Enter new quantity:");
                quantity = Integer.parseInt(ad.readLine());
                invoice.setQuantity(quantity);

                System.out.println("Enter new price per item:");
                pricePerItem = Double.parseDouble(ad.readLine());
                invoice.setPricePerItem(pricePerItem);

                displayInvoice(invoice);
            }

            // Continue or exit
            System.out.println("Do you want to create another invoice? (yes/no)");
            String continueChoice = ad.readLine();
            continueBilling = continueChoice.equalsIgnoreCase("yes");
        }

        System.out.println("Exiting the billing program.");
        ad.close();
    }

    public static void displayInvoice(Invoice invoice) {
        System.out.println("Part number: " + invoice.getPartNumber());
        System.out.println("Description: " + invoice.getPartDescription());
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price: " + invoice.getPricePerItem());
        System.out.println("Invoice amount: " + invoice.getInvoiceAmount());
        System.out.println();
    }
}
