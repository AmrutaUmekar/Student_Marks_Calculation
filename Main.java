import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentManager manager = new StudentManager();

        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] subjectName = new String[n];
        double[] marks = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter subject " + (i + 1) + " name: ");
            subjectName[i] = sc.nextLine();

            System.out.print("Enter marks for " + subjectName[i] + ": ");
            marks[i] = sc.nextDouble();
            sc.nextLine();
        }

        Student student = new Student(id, name, subjectName, marks);

        manager.addStudent(student);

        System.out.println("\n--- Student Marksheet ---");

        for (Student s : manager.students) {
            s.display();
        }

        sc.close();
    }
}