package ex2;

import java.util.Scanner;

class Product {
    int pid;
    double price;
    int quantity;

    // Parameterized constructor
    public Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }
}

class XYZ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product[] products = new Product[5];

        // Accept five products from the user
        for (int i = 0; i < products.length; i++) {
            System.out.println("Enter details for product " + (i + 1) + ":");
            System.out.print("Enter Product ID: ");
            int pid = scanner.nextInt();
            System.out.print("Enter Price: ");
            double price = scanner.nextDouble();
            System.out.print("Enter Quantity: ");
            int quantity = scanner.nextInt();
            products[i] = new Product(pid, price, quantity);
        }

        // Find the pid of the product with the highest price
        int highestPricePid = findHighestPricePid(products);
        System.out.println("Product with highest price has PID: " + highestPricePid);

        // Calculate and display the total amount spent on all products
        double totalAmount = calculateTotalAmount(products);
        System.out.println("Total amount spent on all products: " + totalAmount);
    }

    // Method to find the product ID of the product with the highest price
    public static int findHighestPricePid(Product[] products) {
        double maxPrice = products[0].price;
        int pid = products[0].pid;

        for (int i = 1; i < products.length; i++) {
            if (products[i].price > maxPrice) {
                maxPrice = products[i].price;
                pid = products[i].pid;
            }
        }

        return pid;
    }

    // Method to calculate the total amount spent on all products
    public static double calculateTotalAmount(Product[] products) {
        double total = 0;
        for (Product product : products) {
            total += product.price * product.quantity;
        }
        return total;
    }
}