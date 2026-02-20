import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n;
        while(true) {
            System.out.println("Enter num of students");
            n = sc.nextInt();

            if(n < 0){
                System.out.println("The number you entered is invalid, enter new number");
                continue;
            }
            else{
                break;
            }
        }
        Student[] student = new Student[n];
        for(int i = 0; i < n; i++){
            System.out.println("Enter grade of student " + (i + 1));
            double grade = sc.nextDouble();

            if(grade < 0 || grade > 20){
                System.out.println("invalid grade, enter again");
                i--;
                continue;
            }
            student[i] = new Student(grade);
        }
        while(true){
            System.out.println("\nChoose a number of menu: ");
            System.out.println("1.Calculate the average");
            System.out.println("2.Find maximum and minimum score");
            System.out.println("3.Count passed and failed Students");
            System.out.println("4.Show grades above average");
            System.out.println("5.Exit");

            int choice = sc.nextInt();

            if(choice == 1){
                System.out.println(student[0].average(student));
            }
            if(choice == 2){
                student[0].maxmin(student);
            }
            if(choice == 3){
                student[0].passedFailed(student);
            }
            if(choice == 4){
                student[0].showAboveAverage(student);
            }
            if(choice == 5){
                System.out.println("Good bye");
                break;
            }
        }

    }
}
