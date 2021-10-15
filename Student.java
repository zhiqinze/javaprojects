import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String courses = "";
    private String studentID;
    private int tuitionBalance;
    private int costpercourse = 600;
    private static int id = 1001;

    public Student(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student first name: ");
        this.firstName = in.nextLine();

        System.out.print("Enter student last name: ");
        this.lastName = in.nextLine();

        System.out.print("What year?\n1. Freshmen\n2. Sophomore\n3. Junior\n4. Senior"+"\nEnter year: ");
        this.gradeYear = in.nextInt();

        this.studentID = setStudentID();
        System.out.println("Your student ID is: " + studentID);

        // print out student information
        System.out.println(firstName.toUpperCase() + " " + lastName.toUpperCase() + " " + gradeYear + " " + studentID);

        // each time we created a student profile, the id will +1 so make sure we don't repeat id.
        id++;

    }

    private String setStudentID(){
        return gradeYear + "" + id;
    }

    public void enrollCourse(){
        do {
            System.out.print("Enter course to enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n  " + course;
                tuitionBalance = tuitionBalance + costpercourse;
            } else {
                break;
            }
        } while (1 != 0);

        System.out.println("You enrolled in courses: " + courses);
        System.out.println("Your tuition balance is: " + tuitionBalance);
    }

    public void payTuition(){
        System.out.println("How much would you like to pay now? ");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        this.tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $" + payment);
        System.out.println("Your remaining balance is: $" + this.tuitionBalance);
        System.out.println();
    }
}
