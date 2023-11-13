package JavaConcepts;
import java.util.Scanner;

public class Lists {
    


    public static void listMenu(){

        System.out.println("You'd like to learn more about lists in Java! Let's begin. Please make a selection from the menu: ");
        System.out.println("1. General Purpose of Lists \n2. Different Types of Lists in Java & Examples \n3. Code Templates \n4. Troubleshooting\n5. Advanced Applications" +
        "\n6. Lists Quiz\n7. Hands-On Exercises\n8. Additional Resources and Links  \n\nEnter 9 to exit the Lists Menu\n");

        Scanner input = new Scanner(System.in);
        int menuChoice = input.nextInt();

        switch(menuChoice) {
            case 1: 
            listInfo();
            break;

            case 2:
            typesOfLists();
            break;

            case 3:
            codeTemplatesLists();
            break;

            case 4:
            troubleshootingLists();
            break;

            case 5: 
            advancedApplicationsLists();
            break;

            case 6:
            quizLists();
            break;

            case 7: 
            exercisesLists();
            break;

            case 8: 
            resourcesLists();
            break;

            case 9:
            JavaLearning.displayMenu();
            break;

            
            default:
            System.out.println("Your selection is invalid. Try again: \n");
            listMenu();

        }

        input.close();

    }

    public static void returnListMenu(){

        Scanner input = new Scanner(System.in);

        System.out.println("Would you like to return to the Java Lists menu? Enter 1 for yes, 2 for Main Menu: \n");

        int userInput = input.nextInt();

        switch(userInput) { 

            case 1:
                listMenu();
                break;

            case 2:
            JavaLearning.displayMenu();
            break;

            default:
                break; 
        }
        input.close();
    }


    public static void listInfo(){

        System.out.println("\n\nLists are a type of data structure that can store a collection of elements! \nLists are part of the Java Collections Framework, " +
        "which provides to the user a set of classes and interfaces working with collections of objects. \nThe most common types of lists used in Java are ArrayLists, " +
        "followed by LinkedLists, but there are more, like Vector Lists, Boolean Lists, and Stacks. \nSelect 2 in the Lists Menu to learn more about the different types of lists in Java! \n");
        
        returnListMenu();

        }

    public static void typesOfLists(){

        System.out.println("\n\nTypes of Lists in  Java: \n\nThe most popular lists in Java are ArrayLists and LinkedLists.\n");
        System.out.println("\n\nAn ArrayList is a good choice when you need a dynamic, resizable list of elements. It's also good if " + 
        "you're often performing random access operations (accessing these elements by index).\nIt's also a good choice when you don't " +
        "know the size of the array you will need, or you know that you're going to be adding and removing items.\n");
        System.out.println("Another property of an ArrayList is that it is mutable, meaning that it can change during runtime by adding " +
        "and removing objects from it!\n We could use an ArrayList for something like managing Usernames, as shown in the example below: \n\n\n");

        System.out.println("ArrayList Example:\n\n\n" +
        "import java.util.ArrayList;\npublic class UserManagementSystem{\n   public static void main(String[] args) {\n\n     ArrayList<String> userNames = new ArrayList<>();"
        + "\n\n     userNames.add(''John'');\n     userNames.add(''Jane'');\n     userNames.add(''Jackie'');\n     userNames.add(''Joslyn'');\n     userNames.remove(''John'');\n\n\n");




        

        System.out.println("\n\nA LinkedList is another type of list in Java.\nUnlike an ArrayList, which is using Arrays to store information, " +
        "a LinkedList is storing each piece of information as a node. \nEach element of a LinkedList is stored on its own, meaning each node will" +
        " have its own memory address and location." +
        "\nThis is different from an ArrayList, which stores all of the elements together contiguously (meaning that it's connected in an unbroken sequence).\nA LinkedList uses more memory overall," +
        " but offers faster deletion of elements, as memory does not need to be shuffled around as it does in an ArrayLists.\n");

        returnListMenu();

    }

    public static void codeTemplatesLists(){


        returnListMenu();
    }

    public static void troubleshootingLists(){

        returnListMenu();
    }

    public static void advancedApplicationsLists(){

        returnListMenu();
    }

    public static void quizLists(){

        quizLists();

    }

    public static void exercisesLists(){

        exercisesLists();
    }

    public static void resourcesLists(){

        resourcesLists();

    }

}
