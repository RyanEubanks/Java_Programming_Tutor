package SpringFramework;
import java.util.Scanner;

public class SpringKeyConcepts {
    public static void keyConcepts() {
        int input;
        Scanner in = new Scanner(System.in);

        do {
            System.out.println("Enter a number to learn about a concept: ");
            System.out.println("[1] Aspect-Oriented-Programming");
            System.out.println("[2] Dependency Injection");
            System.out.println("[3] Beans");
            System.out.println("[4] Model-View-Controller");
            System.out.println("[5] exit");

            input = in.nextInt();

            switch(input) {
                case 1:
                    AOP();
                    break;
                case 2:
                    DI();
                    break;
                case 3:
                    Beans();
                    break;
                case 4:
                    MVC();
                    break;
                case 5:
                    continue;
                default:
                    System.out.println("Invalid choice");
            }
        } while(input != 5);
        
    }

    // Aspect-Oriented-Programming
    public static void AOP() {
        System.out.println("Aspect-Oriented-Programming increases code modularity by separting cross-cutting concerns from your main logic");
        System.out.println("it can to this by adding behaviors to already existing code without changing the existing code");
    }

    // Dependency Injection
    public static void DI() {
        System.out.println("Dependency Injection (DI) is a core concept in the Spring Framework.");
        System.out.println("It allows you to achieve Inversion of Control (IoC), where the control of " +
                             "object creation and lifecycle is shifted from your application code to the Spring container.");
        System.out.println("Beans are generally created in XML and not in java itself");
        
    }

    public static void Beans() {
        System.out.println("A bean is an object that is instantiated, assembled, and managed by the Spring IoC (Inversion of Control) container, which is just a glorified controller for the beans.");
        System.out.println("Beans can also have different scopes such as: singleton, prototype, request, session, etc. The scope defines the lifecycle and visibility of a bean. " + 
                           " For example, a singleton bean is created once and shared, while a prototype bean is created every time it is requested.");
    }
    
    // Model-View-Controller
    public static void MVC() {
        System.out.println("The Spring MVC is a web module within the Spring Framework that adopts the Model-View-Controller architectural pattern.\n" +
                           " This pattern divides an application into three main components:\n" +
                           "1) Model: responsible for encapsulating data and business logic\n" +
                           "2) View: handling the presentation layer and rendering data\n" +
                           "3) Controller: managing the flow and interactions between the Model and View.\n\n" +
                           "At the core of Spring MVC is the DispatcherServlet, serving as the entry point for handling incoming HTTP requests by dispatching them to the appropriate controllers.");
    }



}
