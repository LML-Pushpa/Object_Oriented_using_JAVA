package Senario;

import java.util.ArrayList;
import java.util.Scanner;

public class ClientSuperMarketBillingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SuperMarketBillingSystem> list = new ArrayList<>();

        int choice;
        do {
            System.out.println("\nSelect one Option");
            System.out.println("1. Add Product in list");
            System.out.println("2. Remove product from list");
            System.out.println("3. Show Bill & List of Products");
            System.out.println("4. Exit");
            System.out.print("Enter Your Choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter the Product Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter the Product Price: ");
                    double price = sc.nextDouble();
                    list.add(new SuperMarketBillingSystem(name, price));
                    System.out.println("Product added!");
                    break;

                case 2:
                    if (list.isEmpty()) {
                        System.out.println("No products to remove!");
                        break;
                    }
                    System.out.print("Enter the product name to remove: ");
                    String pname = sc.nextLine();
                    boolean found = false;
                    for (SuperMarketBillingSystem p : list) {
                        if (p.getPname().equalsIgnoreCase(pname)) {
                            list.remove(p);
                            System.out.println("Product removed successfully from your list.");
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Product not found!");
                    }
                    break;

                case 3:
                    if (list.isEmpty()) {
                        System.out.println("No products in your list!");
                        break;
                    }
                    double sum = 0;
                    System.out.println("List of Products:");
                    for (SuperMarketBillingSystem x : list) {
                        System.out.println(x.getPname()+ " : " + x.getPPrice());
                        sum += x.getPPrice();
                    }
                    System.out.println("Total Bill: " + sum);
                    break;

                case 4:
                    System.out.println("Exiting... Thank you!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }
        } while (choice != 4);
    }
}
