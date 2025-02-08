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
        }

        avg = (double)(mathGrade+englishGrade+biologyGrade)/3;

        Students student1 = new Students(name, mathGrade, englishGrade, biologyGrade, avg);
        System.out.println("Name: "+student1.getName()+"\nMath grade: "+student1.getMathGrade()+"\nEnglish grade: "+student1.englishGrade+"\nBiology grade:"+student1.getBiologyGrade()+"\nThe avarage of "+student1.getName()+" is "+student1.getAvg());
    }

}
