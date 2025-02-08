import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name = "";
        int mathGrade = 0;
        int englishGrade = 0;
        int biologyGrade = 0;
        double avg;
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

        avg = (double)(mathGrade+englishGrade+biologyGrade)/3;

        Students student1 = new Students(name, mathGrade, englishGrade, biologyGrade, avg);
        System.out.println("Name: "+student1.getName()+"\nMath grade: "+student1.getMathGrade()+"\nEnglish grade: "+student1.englishGrade+"\nBiology grade:"+student1.getBiologyGrade()+"\nThe avarage of "+student1.getName()+" is "+student1.getAvg());
    }

}
