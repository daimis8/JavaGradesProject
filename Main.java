import java.util.InputMismatchException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String name = "";
        int mathGrade = 0;
        int englishGrade = 0;
        int biologyGrade = 0;
        double avg;
        int numberOfStudents;
        ArrayList<Students> studentsList = new ArrayList<>();

        System.out.println("How many students there are in a class");
        try(Scanner scanner = new Scanner(System.in)) {
            while(true){
                try {
                    numberOfStudents = scanner.nextInt();
                    break;
                } 
                catch (InputMismatchException e) {
                    System.out.println("Please enter a number");
                    scanner.next();
                }
            }
            for(int i = 0; i<numberOfStudents; i++){
                scanner.nextLine();
                System.out.println("What is the students name?");
                name = scanner.nextLine();

                System.out.println("What is students math grade?");
                while(true){
                    try {
                        mathGrade = scanner.nextInt();
                        if(mathGrade>0 && mathGrade <= 10){
                            break;
                        }
                        else{
                            System.out.println("Please enter a number in an interval 1-10");
                            scanner.next();
                        }
                    }
                    catch (InputMismatchException e) {
                        System.out.println("Enter a number! ");
                        scanner.next();
                    }
                }

                System.out.println("What is students english grade?");
                while(true){
                    try {
                        englishGrade = scanner.nextInt();
                        if(englishGrade>0 && englishGrade <= 10){
                            break;
                        }
                        else{
                            System.out.println("Please enter a number in an interval 1-10");
                        }
                    }
                    catch (InputMismatchException e) {
                        System.out.println("Enter a number! ");
                        scanner.next();
                    }
                }
                
                System.out.println("What is students biology grade?");
                while(true){
                    try {
                        biologyGrade = scanner.nextInt();
                        if(biologyGrade>0 && biologyGrade <= 10){
                            break;
                        }
                        else{
                            System.out.println("Please enter a number in an interval 1-10");
                        }
                    }
                    catch (InputMismatchException e) {
                        System.out.println("Enter a number! ");
                        scanner.next();
                    }
                }
                avg = (double)(mathGrade+englishGrade+biologyGrade)/3;
                studentsList.add(new Students(name, mathGrade, englishGrade, biologyGrade, avg));
            }

        }
        catch(Exception e){
            System.out.println("Error!");
        }
        for(int i = 0; i < studentsList.size(); i++) {
            System.out.println(studentsList.get(i));
        }
    }

}
