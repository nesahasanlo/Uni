import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of students");
        int s = sc.nextInt();

        System.out.println("Enter number of courses");
        int c = sc.nextInt();

        sc.nextLine();

        Student[] p = new Student[s];

        for(int i = 0; i < s; i++) {
            p[i] = new Student();
            p[i].lesson = new String[c];
            p[i].grade = new double[c];

            System.out.println("Enter name" + (i + 1));
            p[i].name = sc.nextLine();


            for (int j = 0; j < c; j++) {
                System.out.println("Enter name of course" + (j + 1));
                p[i].lesson[j] = sc.nextLine();

                System.out.println("Enter grade for course" + (j + 1));
                p[i].grade[j]= sc.nextDouble();
                sc.nextLine();
            }
        }

        System.out.println("ave");
        for(int i = 0; i < s; i++){
            double ave = p[i].average();
            System.out.println(p[i].name + "  " + ave);
        }

        System.out.println("ave > 15");
        for (int i = 0; i < s; i++) {
            if (p[i].average() > (double)15) {
                System.out.println(p[i].name);
            }
        }

        System.out.println("max");
        double max = p[0].average();
        String nam = "";
        nam = p[0].name;
        for (int i = 0; i < s; i++) {
            if (p[i].average() > max ) {
                max = p[i].average();
                nam = p[i].name;
            }
        }
        System.out.println(nam);
    }
}
