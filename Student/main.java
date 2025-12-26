import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of students");
        int s = sc.nextInt();

        System.out.println("Enter number of courses");
        int c = sc.nextInt();
        sc.nextLine();

        String[] name = new String[s];
        String[] co = new String[s];

        for (int i = 0; i < s; i++) {
            System.out.println("Enter name" + (i + 1));
            name[i] = sc.nextLine();

            for (int j = 1; j <= c; j++) {
                System.out.println("Enter name of course" + ( j ) + " " + "of" + " " + name[i]);
                co[j] = sc.nextLine();
            }
        }
        double[][] t = new double[s][c];

        for (int i = 0; i < s; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println("Enter grade for" +" "+ name[i] +""+ "course" + (j + 1));

                t[i][j] = sc.nextDouble();
            }
        }

        System.out.println("ave");
        double[] ave = new double[s];
        double[] sum = new double[s];
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < c; j++) {
                sum[i] += t[i][j];
            }
            ave[i] = sum[i] / c;
            System.out.println(name[i] +"  "+ ave[i]);
        }

        String nam = "";

        System.out.println("ave > 15");
        for (int i = 0; i < s; i++) {
            if (ave[i] > 15) {
                nam = name[i];
                System.out.println(nam);
            }
        }

        System.out.println("max");
        double max = ave[0];
        nam = name[0];
        for (int i = 0; i < s; i++) {
            if (ave[i] > max ) {
                max = ave[i];
                nam = name[i];
            }
        }
        System.out.println(nam);
    }
}
