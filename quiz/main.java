import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of kala");
        int n = sc.nextInt();
        sc.nextLine();

        Kala[] kala = new Kala[n];

        for(int i = 0; i < n; i++){
            System.out.println("Enter name of kala" + (i + 1));
            String name = sc.nextLine();

            System.out.println("Enter gheymat kala" + (i + 1));
            int gheymat = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter mojodi kala" + (i + 1));
            int mojodi = sc.nextInt();
            sc.nextLine();

            kala[i] = new Kala(name, gheymat, mojodi);
        }
        int max = kala[0].gheymat;
        String name = kala[0].name;
        for(int i = 0; i < n; i++){
            if(kala[i].gheymat > max){
                max = kala[i].gheymat;
                name = kala[i].name;
            }
        }
        System.out.println("max");
        System.out.println(name + " " + max);

        int min = kala[0].gheymat;
        name = kala[0].name;
        for(int i = 0; i < n; i++){
            if(kala[i].gheymat < min){
                min = kala[i].gheymat;
                name= kala[i].name;
            }
        }
        System.out.println("min");
        System.out.println(name + " " + min);

        int arzesh = 0;
        for(int i = 0; i < n; i++){
            arzesh += kala[i].arzesh();
        }
        System.out.println("result");
        System.out.println(arzesh);
    }
}
