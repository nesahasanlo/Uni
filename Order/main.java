import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of appointments");
        int n = sc.nextInt();
        sc.nextLine();

        Order[] order = new Order[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Information about order" + (i + 1));

            System.out.println("Enter food name");
            String foodName = sc.nextLine();

            System.out.println("Enter quantity");
            int quantity = sc.nextInt();

            System.out.println("Enter price");
            double price = sc.nextDouble();
            sc.nextLine();

            order[i] = new Order(foodName, quantity, price);
        }
        double sum;
        double total = 0;

        System.out.println("Bill");
        for (Order p : order) {
            sum = p.quantity * p.price;
            System.out.println("\nFood name: " + p.foodName + " Quantity: " + p.quantity + " Unit price: " + p.price + " Total price: " + sum);
            total += sum;
        }
        System.out.println("\nTotal price: " + total);

        Order max = order[0];
        for (int i = 0; i < n; i++) {
            if (order[i].quantity > max.quantity) {
                max = order[i];
            }
        }
        System.out.println("\nmax quantity: name: " + max.foodName + " quantity: " + max.quantity);
    }
}

