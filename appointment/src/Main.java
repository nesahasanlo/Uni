import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the number of appointments");
        int n = sc.nextInt();
        sc.nextLine();

        Appointment[] a = new Appointment[n];

        for(int i = 0 ; i < n ; i++) {
            System.out.println("Information about appointment" + (i + 1));

            System.out.println("Enter patient name");
            String name = sc.nextLine();

            System.out.println("Enter doctor name");
            String doctorname = sc.nextLine();

            System.out.println("Enter appointment time(ex : 15:00)");
            String time = sc.nextLine();

            a[i] = new Appointment(name, doctorname, time);
        }
        System.out.println("Infotmation about all appointments");
        for(Appointment s : a){
            System.out.println("\nPatient's name: " + s.name + " doctor's name: " + s.doctorname + " time: " + s.time);
        }

        System.out.println("\nEnter the patient's name to search");
        String search = sc.nextLine();

        boolean found = false;

        for(int i = 0; i < n ; i++) {
            if (search.equalsIgnoreCase(a[i].name)) {
                System.out.println("\nPatient information found: ");
                System.out.println(a[i].name + " meets Dr " + a[i].doctorname + " at " + a[i].time);
                found = true;
                break;
            }
        }
            if(!found) {
                System.out.println("Patient information not found");
            }
    }
}