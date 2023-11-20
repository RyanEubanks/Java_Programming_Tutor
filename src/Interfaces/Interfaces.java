package Interfaces;

import java.util.Scanner;
public class Interfaces {
    public static void interfacesMenu(){
        System.out.println("You would like learn about interfaces in Java! Let's start: ");
        System.out.println("1. Introduction, 2.Key concepts, 3. Code templates, 4. Troubleshooting Guide, 5.Advanced Applications, 6. Hands-on Exercises, 7.Resoruces");

        Scanner input = new Scanner(System.in);
        int menuChoice = input.nextInt();

        switch(menuChoice){
            case 1:
                introductionOfInterfaces();
                break;
            case 2:
                keyConceptsOfInterfaces();
                break;
            case 3:
                codeTemplatesOfInterfaces();
                break;
            case 4:
                troubleshootingOfInterfaces();
                break;
            case 5:
                advancedApplicationsOfInterfaces();
                break;
            case 6:
                handsOnExercisesOfInterfaces();
                break;
            case 7:
                resourcesOfInterfaces();
                break;
            default:
                System.out.println("Invalid input. Please try again!");
        }
        input.close();
    }
    public static void returnSetsMenuOfInterfaces(){
        Scanner input = new Scanner(System.in);
     
    }
    public static void introductionOfInterfaces(){
        System.out.println("An interface is a completly abstract class that is used to group related methods with empty bodies");
        System.out.println("In order to use interface methods, the keyword extends");
        System.out.println("Interfaces can extend other interfaces by using the extends keyword.");
        System.out.println("Interface methods do not have bodies.");
        System.out.println("Interfaces can not use constructors");
        System.out.println("Java interfaces contain static constants and abstract methods");
        System.out.println("Interfaces can use to achieve multiple inheritance in Java.");
        System.out.println("Lastly, when using interfaces, using private methods can be done.");
    }
    public static void keyConceptsOfInterfaces(){
        System.out.println("Here is an example of using multiple inheritance:");
    System.out.println("For a refresher, multiple inheritance is when a class can inherit properties of more than one parent class.");
    System.out.println("System.out.println( Interface for an action\n\n"+
        "interface Action {\n\n" +
        "    void performAction();\n\n"+
        "}\n\n" +

        "// Interface for a description\n\n"+
        "interface Description {\n\n" +
        "    String getDescription();\n\n" +
        "}\n\n" +

        "// Concrete class implementing both Action and Description interfaces\n\n"+
        "class ActionDescription implements Action, Description {\n\n"+
        "    @Override\n\n"+
        "    public void performAction() {\n\n"+
        "        System.out.println(\"Performing an action\");\n\n"+
        "    }\n\n"+
        "    @Override\n\n"+
        "    public String getDescription() {\n\n" +
        "        return \"This is an object with an action and a description.\";\n\n"+
        "    }\n\n"+
        "}\n\n"+

        "// Main class\n\n"+
        "public class ShortBasicExample {\n\n"+
        "    public static void main(String[] args) {\n\n"+
        "        ActionDescription obj = new ActionDescription();\n\n"+
        "        obj.performAction();\n\n"+
        "        System.out.println(obj.getDescription());\n\n"+
        "    }\n\n"+
        "}\n\n");

    }
    public static void codeTemplatesOfInterfaces(){
        System.out.println("Example 1 of a coding template using interfaces deals with shapes");
        System.out.println("Example 1: Calculate the area and perimeter of a rectangle using an interface");
        System.out.println("interface Shape {\n\n"+
            "    double calculateArea();\n\n"+
            "    double calculatePerimeter();\n\n"+
            "}\n\n"+
            "// Implement the interface for a Rectangle\n\n"+
            "class Rectangle implements Shape {\n\n"+
            "    private double length;\n\n" +
            "    private double width;\n\n"+
            "    public Rectangle(double length, double width) {\n\n"+
            "        this.length = length;\n\n"+
            "        this.width = width;\n\n" +
            "    }\n\n"+
            "    @Override\n\n"+
            "    public double calculateArea() {\n\n"+
            "        return length * width;\n\n"+
            "    }\n\n"+
            "    @Override\n\n"+
            "    public double calculatePerimeter() {\n\n"+
            "        return 2 * (length + width);\n\n"+
            "    }\n\n"+
            "}\n\n"+
            "// Usage in the main class\n\n"+
            "public class RectangleExample {\n\n"+
            "    public static void main(String[] args) {\n\n"+
            "        Shape rectangle = new Rectangle(5, 3);\n\n"+
            "        System.out.println(\"Rectangle Area: \" + rectangle.calculateArea());\n\n"+
            "        System.out.println(\"Rectangle Perimeter: \" + rectangle.calculatePerimeter());\n\n"+
            "    }\n\n"+
            "}\n\n");
        
        System.out.println("Example 2: Using more than 1 interface in Java:");
        System.out.println("interface Interface1 {\n\n"+
            "    void method1();\n\n"+
            "}\n\n"+
            "interface Interface2 {\n\n"+
            "    void method2();\n\n"+
            "}\n\n"+
            "class MyImplementation implements Interface1, Interface2 {\n\n"+
            "    @Override\n\n"+
            "    public void method1() {\n\n"+
            "        System.out.println(\"Implementation of method1\");\n\n"+
            "    }\n\n"+
            "    @Override\n\n"+
            "    public void method2() {\n\n"+
            "        System.out.println(\"Implementation of method2\");\n\n"+
            "    }\n\n"+
            "}\n\n"+
            "// Create an object and call the methods\n\n"+
            "public class Main {\n\n"+
            "    public static void main(String[] args) {\n\n"+
            "        MyImplementation myObject = new MyImplementation();\n\n"+
            "        myObject.method1();\n\n"+
            "        myObject.method2();\n\n"+
            "    }\n\n"+
            "}\n\n"); 
    }
    public static void troubleshootingOfInterfaces(){
        System.out.println("Some of the most common errors when using interfaces can include:");
        System.out.println("1. Using extends instead of implements");
        System.out.println("2.Mixing up default and static. Remember, default should have a body while static will not have a body");
        System.out.println("3. Incorrectly using public and private. To be more specific, if the interface method is declared private, then the implementing class method must also be private. The same will go for public.");

    }

    public static void advancedApplicationsOfInterfaces(){
        System.out.println("1.Java Plug-ins: Software extensions that can be loaded on a program to improve its functionality. Plugins allow you to customize website content, as well as computer programmes, web browsers, and apps ");
        System.out.println("2.Dependency Injection: A programming technique that makes a class independent of its dependencies. Software dependancies are relationships between software components where one component relies on the other to work properly. It achieves that by decoupling the usage of an object from its creation.");
        System.out.println("3. The collections framework: a unified architecture for representing and manipulating collections, enabling collections to be manipulated independently of implementation details. It's main goals are to reduece programming difficulty and increase the overall effieincy of different programs. One of the main parts of the collections framework is the collection of interfaces. ");

    }


    public static void handsOnExercisesOfInterfaces(){
        System.out.println("Problem Statement 1: Create a set of classes that will be three different shapes; ex, sphere, square, triangle, as well as calculate the area");
        System.out.println("Problem 1 Programming Hints:\n Step 1: Create the shape interface.\n Step 2: Create 3 classes for the different shapes\n Step 3: Instantiate the three shape classes\n Step 4: Create area formulas");
        System.out.println("Problem Statement 2: Create a online shopping platform that takes multiple payment options");
        System.out.println("Problem 2 Programming Hints:\n Step 1: Define the (PaymentMethod) interface\n Step 2: Create three classes for credit card payments, debit card payments, and PayPal payments\n Step 3: Make an option where the user chooses what type of payment method to choose ");
        System.out.println("Problem Statement 3: Develop a movie choosing system where the user chooses between watching a comedy, horror, or syfy film");
        System.out.println("Problem 3 Hints: Define MovieChoosing Interface\n Step 2: Create 3 different classes for the comedy, horror, and syfy films\n Step 3: Create a MovieChoice class that interacts with the MovieChoosing interface\n Step 4: Create an option where the user enters in the type of movie they would like to watch");
        System.out.println("Problem Statement 4: Create a website where employees of a random company can choose if they would like to be on the IT Team or the Financial Team");
        System.out.println("Problem 4 Hints: Step 1: Create the Employee Interface\n Step 2: Create classes for the IT Team and the Financial Team\n Step 3: Create the TeamChoosing class\n Step 4: Create a statement that allows the user to choose whether they go to the IT Team or the Financial Team");

    }

    public static void resourcesOfInterfaces(){
        System.out.println("https://www.w3schools.com/java/java_interface.asp");
        System.out.println("https://www.geeksforgeeks.org/interfaces-in-java/");
        System.out.println("https://www.geeksforgeeks.org/java-and-multiple-inheritance/");
        System.out.println("https://www.developer.com/java/java-private-interface-methods/#:~:text=Beginning%20with%20Java%209%2C%20you,by%20any%20class%20or%20interface.");
        System.out.println("https://www.javatpoint.com/what-are-plugins");
        System.out.println("https://stackify.com/dependency-injection/#:~:text=Dependency%20injection%20is%20a%20programming,inversion%20and%20single%20responsibility%20principles.");
        System.out.println("https://www.sonatype.com/launchpad/what-are-software-dependencies#:~:text=A%20software%20dependency%20is%20a,application%20depends%20on%20that%20library.");
        System.out.println("https://docs.oracle.com/javase/8/docs/technotes/guides/collections/overview.html");

    }
}
    
