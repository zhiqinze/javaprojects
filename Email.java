import java.util.Scanner;

public class Email {
    private String companySuffix = "AppleTech.com";
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCap = 4000;
    private int defaultPasswordLength = 10;
    private String alternateEmail;

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email Created: " + this.firstName + " " + this.lastName);

        // call the method asking for department - return department
        this.department = setDepartment();
        System.out.println("Department: " + this.department);

        // generate a complete email address
        this.email = emailAddress();
        System.out.println("Here is your company email address: " + email);
        System.out.println("Your email capacity is: " + mailboxCap + " emails");
        System.out.println("Make sure you check and clean up your mailbox everyday.");

        // generate a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your temporary email password is: " + this.password);

        // store a alternate email address
        this.alternateEmail = getAlternateEmail();
        System.out.println("Your alternate email address is: " + alternateEmail);

        // welcome message
        System.out.println("Welcome to Apple Tech!");

    }

    private String setDepartment() {
        System.out.print("Department codes\n1. Sales\n2. Development\n3. Accounting" +
                "\n0. None\nEnter department codes: ");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();

        if(choice == 1){
            return "sales";
        } else if (choice ==2) {
            return "development";
        } else if (choice == 3) {
            return "accounting";
        }
        return " ";
    }

    private String emailAddress(){
        String email = firstName.toLowerCase() + "." + lastName.toUpperCase() +
                "@" + department +"." + companySuffix;
        return email;
    }

    private String randomPassword(int length){
        String passwordPool = "ABCDEFGHIJKLMNOPQRSTUVWSYZ"+"abcdefghijklmnopqrstuvwxyz"+
                "0123456789!@#$%^&*?";
        char[] password = new char[length];
        for(int i = 0; i<length;i++){
           int rand = (int) (Math.random() * passwordPool.length());
           password[i] = passwordPool.charAt(rand);
        }
        return new String(password);
    }

    private String getAlternateEmail(){
        System.out.println("If you like to add an alternate email, please type now: ");
        Scanner inputEmail = new Scanner(System.in);
        String secondEmail = inputEmail.next();
        return secondEmail;
    }

}
