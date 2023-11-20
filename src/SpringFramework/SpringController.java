package SpringFramework;

import java.util.Scanner;

public class SpringController {
    
    public static void main(String[] args) {
        // declare variables
        int inputs;
        Scanner in = new Scanner(System.in);

        do {
            System.out.println("Welcome to the Spring Guide:\n");
            System.out.println("Enter a number to start:");
            System.out.println("[1] Introduction to Spring Framework");
            System.out.println("[2] Spring's key concepts");
            System.out.println("[3] Simple Hello world program in Spring");
            System.out.println("[4] Trouble Shooting");
            System.out.println("[5] Resources");
            System.out.println("[6] exit\n");

            inputs = in.nextInt();

            switch(inputs) {
                case 1: 
                    IntroductionToSpring.Introduction();
                    break;
                case 2:
                    SpringKeyConcepts.keyConcepts();
                    break;
                case 3:
                    codeExamples.helloWorld();
                    break;
                case 4:
                    SpringTroubleShooting.displayTroubleShootingGuide();
                    break;
                case 5:
                    SpringResources.displayResources();
                    break;
                case 6:
                    continue;
                default:
                    System.out.println("invalid input");
            }
        
        } while(!(inputs == 6));
        
    }
}
