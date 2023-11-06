package JavaConcepts;
import java.util.Scanner;

public class Lists {
    


    public static void listMenu(){

        System.out.println("You'd like to learn more about lists in Java! Let's begin. Please make a selection from the menu: ");
        System.out.println("1. General Purpose of Lists \n2. Different Types of Lists in Java \n3. Examples of Lists in Java \n4. Test Your Knowledge \n\nEnter 3 to exit the Lists Menu\n");

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
            JavaLearning.displayMenu();
            break;

            
            default:
            System.out.println("Your selection is invalid. Try again: \n");
            listMenu();

        }

        input.close();

    }


    public static void listInfo(){

        

        System.out.println("Lists are a type of data structure that can store a collection of elements! \nLists are part of the Java Collections Framework, which provides to the user a set of classes and interfaces working with collections of objects. \nThe most common types of lists used in Java are ArrayLists, followed by LinkedLists. \nSelect 2 in the Lists Menu to learn more about the different types of lists in Java! \n");
        
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

        
    }

    public static void typesOfLists(){

        System.out.println("Types of Lists in  Java: \n\nThe most popular lists in Java are ArrayLists and LinkedLists.\n");
        System.out.println("An ArrayList is a good choice when you need a dynamic, resizable list of elements. It's also good if " + 
        "you're often performing random access operations (accessing these elements by index).\nIt's also a good choice when you don't " +
        "know the size of the array you will need, or you know that you're going to be adding and removing items.\n");
        System.out.println("Another property of an ArrayList is that it is mutable, meaning that it can change during runtime by adding " +
        "and removing objects from it!");

        System.out.println("A LinkedList is another type of list in Java.\nUnlike an ArrayList, which is using Arrays to store information, " +
        "a LinkedList is storing each piece of information as a node. Each element of a LinkedList is stored on its own, meaning each node will" +
        " have its own memory address and location." +
        "\nThis is different from an ArrayList, which stores all of the elements together contiguously.\nA LinkedList uses more memory overall," +
        " but offers faster deletion of elements, as memory does not need to be shuffled around as it does in an ArrayLists.\n");

        System.out.println("Would you like to return to the Java Lists menu? Enter 1 for yes, 2 for Main Menu: \n");

        Scanner input = new Scanner(System.in);
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

    }

}
