import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name;
        int mathGrade;
        int englishGrade;
        int biologyGrade;
        double avg;
        Students student1;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("What is the students name?");
            name = scanner.nextLine();

            System.out.println("What is students math grade?");
            mathGrade = scanner.nextInt();

            System.out.println("What is students english grade?");
            englishGrade = scanner.nextInt();

            System.out.println("What is students biology grade?");
            biologyGrade = scanner.nextInt();
        }
        catch(InputMismatchException e) {
            System.out.println("Enter a number!");
        }
        
    }
}
