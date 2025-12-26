import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter tedad");
        int n = sc.nextInt();

        Kala[] kala = new Kala[n];

        for (int i = 0; i < kala.length; i++) {
            Kala k = new Kala();

            System.out.println("Enter name" + (i + 1));

            String name = sc.next();

            k.name = name;

            System.out.println("Enter price" + (i + 1));
            int price = sc.nextInt();
            k.setPrice(price);

            System.out.println("Enter existence" + (i + 1));
            int existence = sc.nextInt();
            k.setExistence(existence);

            kala[i] = k;
        }
        String name = kala[0].name;
        int max_price = kala[0].getPrice();

        for (int i = 0; i < kala.length; i++)
        {
            if (kala[i].getPrice() > max_price)
            {
                max_price = kala[i].getPrice();
                name = kala[i].name;
            }
        }
        System.out.println("max");
        System.out.println(name + " " + max_price);

        int min_existence = kala[0].getExistence();
        int price = kala[0].getPrice();
        for (int i = 0; i < kala.length; i++)
        {
            if (kala[i].getExistence() < min_existence) {
                min_existence = kala[i].getExistence();
                name = kala[i].name;
                price = kala[i].getPrice();
            }
        }
        System.out.println("min");
        System.out.println(name + " " + price);

        int arzesh = 0;
        for (int i = 0; i < kala.length; i++) {
            arzesh += kala[i].arzesh();
        }
        System.out.println("result");
        System.out.println(arzesh);

    }
}
