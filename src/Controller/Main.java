package Controller;
import JavaConcepts.*;
import Quiz.*;
import SpringFramework.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input;

        do {
            System.out.println("Enter a number to choose a topic to learn about:");
            System.out.println("[1] Collections");
            System.out.println("[2] Interfaces");
            System.out.println("[3] Spring Framework");
            System.out.println("[4] Quiz");
            System.out.println("[5] Exit ");

            input = in.nextInt();

            switch(input) {
                case 1:
                    JavaLearning.main(args);
                    break;
                case 2:

                    break;
                case 3:
                    SpringController.main(args);
                    break;
                case 4:
                    Quiz.quiz();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid Input");
            }
            
        } while(input != 5);
        in.close();
    }
}
