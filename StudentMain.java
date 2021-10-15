import java.util.Scanner;

public class StudentMain {

    public static void main(String[] args) {

        Student stu1 = new Student();
        stu1.enrollCourse();
        stu1.payTuition();

        System.out.println("Enter number of new students to enroll: ");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        Student[] students = new Student[numOfStudents];

        for(int i = 0; i < numOfStudents; i++){
            students[i] = new Student();
            students[i].enrollCourse();
            students[i].payTuition();
        }

    }
}
