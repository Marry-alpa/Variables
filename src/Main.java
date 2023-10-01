import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int age = 37;
        int workingMonths = 12;
        double salary = 29000.5;
        char key = 'A';
        boolean isWorking = true;
        String fullName = "Petro Petrovich";

        // Number operations
        System.out.printf("%s started working at age: %d%n", fullName, age-workingMonths/12);
        System.out.printf("Salary per month: %7.02f%n", salary/12);
        workingMonths++;
        System.out.printf("Full years %d Full months %d%n", workingMonths/12, workingMonths % 12);

        /*
        String operations
        Concatenation, getting index
        */
        System.out.printf("%s%n", "Hello ".concat("World"));
        System.out.println(fullName.indexOf("f"));
        System.out.println(fullName.indexOf("t"));
        System.out.println(fullName.indexOf("t", 3));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Correct working months: ");
        workingMonths = scanner.nextInt();
        System.out.println("Working months: " + workingMonths);
    }
}