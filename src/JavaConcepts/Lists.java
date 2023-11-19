package JavaConcepts;
import java.util.Scanner;

public class Lists {
    


    public static void listMenu(){

        System.out.println("You'd like to learn more about lists in Java! Let's begin. Please make a selection from the menu: ");
        System.out.println("1. General Purpose of Lists \n2. Different Types of Lists in Java & Examples \n3. Code Templates \n4. Troubleshooting\n5. Advanced Applications" +
        "\n6. Hands-On Exercises\n7. Additional Resources and Links  \n\nEnter 8 to exit the Lists Menu\n");

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
            exercisesLists();
            break;

            case 7: 
            resourcesLists();
            break;

            case 8:
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
        "followed by LinkedLists, but there are more, like Vector Lists, and Stacks. Wrapper classes can also be used to create more specialized types of lists in Java!\n " +
        "For example, if you wanted to create a list containing only boolean values, you could do something like this: \n\nList<Boolean> booleanList = new ArrayList<>();\n\n" +
        "Select 2 in the Lists Menu to learn more about the different types of lists in Java! \n");
        
        returnListMenu();

        }

    public static void typesOfLists(){

        Scanner input = new Scanner(System.in);

        System.out.println("You indicated that you'd like to learn more about types of lists in Java. What kind of lists are you interested in? Enter a number from the menu: \n"+
        "1. ArrayLists\n2. LinkedLists\n3. VectorLists\n4. Stacks\n\nEnter 5 to return to the Lists Menu\n\nEnter 6 to return to the collections menu\n");

        int menuChoice = input.nextInt();

        switch(menuChoice) {

            case 1:
            arrayLists();
            break;

            case 2:
            linkedLists();
            break;

            case 3:
            vectorLists();
            break;

            case 4:
            stacks();
            break;

            case 5:
            returnListMenu();
            break;

            case 6:
            JavaLearning.displayMenu();
            break;

            default: 
            System.out.println("Your selection was invalid. Please try again: \n");
            typesOfLists();


        }
            input.close();

    }

    public static void arrayLists(){

        System.out.println("\n\nAn ArrayList is a good choice when you need a dynamic, resizable list of elements. It's also good if " + 
        "you're often performing random access operations (accessing these elements by index).\nIt's also a good choice when you don't " +
        "know the size of the array you will need, or you know that you're going to be adding and removing items.\n");
        System.out.println("Another property of an ArrayList is that it is mutable, meaning that it can change during runtime by adding " +
        "and removing objects from it!\n We could use an ArrayList for something like managing Usernames, as shown in the example below: \n\n\n");

        System.out.println("ArrayList Example:\n\n\n" +
        "import java.util.ArrayList;\n" +
        "public class UserManagementSystem {\n" +
        "   public static void main(String[] args) {\n\n" +
        "     ArrayList<String> userNames = new ArrayList<>();\n\n" +
        "     userNames.add(''John'');\n" +
        "     userNames.add(''Jane'');\n" +
        "     userNames.add(''Jackie'');\n" +
        "     userNames.add(''Joslyn'');\n" +
        "     userNames.remove(''John'');\n\n" +
        "}\n}");

        returnListMenu();

    }

    public static void linkedLists(){

        System.out.println("\n\nA LinkedList is another type of list in Java.\nUnlike an ArrayList, which is using Arrays to store information, " +
        "a LinkedList is storing each piece of information as a node. \nEach element of a LinkedList is stored on its own, meaning each node will" +
        " have its own memory address and location." +
        "\nThis is different from an ArrayList, which stores all of the elements together contiguously (meaning that it's connected in an unbroken sequence).\nA LinkedList uses more memory overall," +
        " but offers faster deletion of elements, as memory does not need to be shuffled around as it does in an ArrayLists.\n");
        System.out.println("\n\nA LinkedList is a type of list that organizes elements in a linear order. Unlike ArrayList, " +
        "it uses a chain of elements, where each element points to the next one. This makes insertion and removal operations efficient.\n");
        System.out.println("Think of a LinkedList like a chain of connected elements, where each element knows about the next one. " +
                "This structure makes it easy to add or remove elements anywhere in the chain.\n");
        System.out.println("Here's a simple example of using a LinkedList to manage a list of fruits:\n\n\n");
        System.out.println("LinkedList Example:\n\n\n" +
                "import java.util.LinkedList;\npublic class FruitBasket{\n   public static void main(String[] args) {\n\n" +
                "     LinkedList<String> fruitBasket = new LinkedList<>();\n\n" +
                "     fruitBasket.add(''Apple'');\n     fruitBasket.add(''Banana'');\n     fruitBasket.add(''Orange'');\n" +
                "     fruitBasket.add(''Grapes'');\n     fruitBasket.remove(''Banana'');\n\n" +
                "     // Print all fruits in the basket\n" +
                "     for (String fruit : fruitBasket) {\n         System.out.println(fruit);\n     }\n\n\n");

        returnListMenu();

    }

    public static void vectorLists(){

        System.out.println("\n\nA Vector is similar to an ArrayList but is synchronized, making it thread-safe. " +
            "It extends the Vector class with five operations that allow a vector to be treated as a stack.\n" +
            "Due to its synchronization overhead, it's generally not recommended unless thread safety is a specific requirement.\n");

        System.out.println("Thread-safe means that the operations on the Vector can be safely used in a multithreaded environment. " +
                "It ensures that multiple threads can access and modify the Vector without causing data corruption or inconsistencies.\n");
        System.out.println("Synchronization overhead refers to the performance cost associated with ensuring thread safety. " +
                "In the case of Vector, synchronization is achieved by adding locks to methods, which can introduce some performance overhead. " +
                "If thread safety is not a critical requirement, using ArrayList might be more efficient in terms of performance.\n");

        System.out.println("Another property of a Vector is that it is resizable, meaning that it can dynamically grow or shrink in size.\n" +
                "Here's an example of using a Vector for managing a list of products:\n\n\n");

        System.out.println("Vector Example:\n\n\n" +
                "import java.util.Vector;\npublic class ProductInventory{\n   public static void main(String[] args) {\n\n" +
                "     Vector<String> productList = new Vector<>();\n\n" +
                "     productList.add(''T-Shirt'');\n     productList.add(''Blue Jeans'');\n     productList.add(''Bandana'');\n" +
                "     productList.add(''Loafers'');\n     productList.remove(''Blue Jeans'');\n\n\n");

        returnListMenu();

    }

    public static void stacks(){
        System.out.println("\n\nA Stack is a Last-In-First-Out (LIFO) data structure, like a stack of plates. " +
            "The last plate added is the first one to be removed. It has operations like push (to add an element) and pop (to remove the top element).\n");
        System.out.println("Think of a Stack like a stack of plates. You add a plate on top, and the last plate you added is the first one you take off. " +
                "This structure is useful for tasks that involve keeping track of the last item added.\n");
        System.out.println("Here's a simple example of using a Stack to manage a history of web pages visited:\n\n\n");
        System.out.println("Stack Example:\n\n\n" +
                "import java.util.Stack;\npublic class WebBrowser{\n   public static void main(String[] args) {\n\n" +
                "     Stack<String> webHistory = new Stack<>();\n\n" +
                "     // User visits web pages\n" +
                "     webHistory.push(''Homepage'');\n     webHistory.push(''SearchResults'');\n" +
                "     webHistory.push(''ArticlePage'');\n\n" +
                "     // User goes back to the previous page\n" +
                "     String currentPage = webHistory.pop();\n\n" +
                "     // Print the current page\n" +
                "     System.out.println(''Current Page: '' + currentPage);\n\n" +
                "     // Peek at the top page without removing it\n" +
                "     String topPage = webHistory.peek();\n" +
                "     System.out.println(''Top Page: '' + topPage);\n\n\n");

        returnListMenu();

    }

    public static void codeTemplatesLists(){

        // ArrayList template
        System.out.println("ArrayList Template:\n\n" +
        "import java.util.ArrayList;\n" +
        "public class MyArrayListExample {\n" +
        "   public static void main(String[] args) {\n\n" +
        "       ArrayList<String> list = new ArrayList<>();\n" +
        "       // Add elements\n" +
        "       list.add(''Element1'');\n" +
        "       list.add(''Element2'');\n" +
        "       list.add(''Element3'');\n" +
        "       // Remove an element\n" +
        "       list.remove(''Element2'');\n" +
        "       // Iterate through the list\n" +
        "       for (String element : list) {\n" +
        "           System.out.println(element);\n" +
        "       }\n\n" +
        "   }\n}\n\n");


        // Stack template
        System.out.println("Stack Template:\n\n" +
            "import java.util.Stack;\n" +
            "public class MyStackExample {\n" +
            "   public static void main(String[] args) {\n\n" +
            "       Stack<String> stack = new Stack<>();\n" +
            "       // Push elements\n" +
            "       stack.push(''Element1'');\n" +
            "       stack.push(''Element2'');\n" +
            "       stack.push(''Element3'');\n" +
            "       // Pop the top element\n" +
            "       String poppedElement = stack.pop();\n" +
            "       // Print the popped element\n" +
            "       System.out.println(''Popped Element: '' + poppedElement);\n" +
            "       // Peek at the top element without removing\n" +
            "       String topElement = stack.peek();\n" +
            "       System.out.println(''Top Element: '' + topElement);\n\n" +
            "   }\n}\n\n");

        // LinkedList template
        System.out.println("LinkedList Template:\n\n" +
            "import java.util.LinkedList;\n" +
            "public class MyLinkedListExample {\n" +
            "   public static void main(String[] args) {\n\n" +
            "       LinkedList<String> linkedList = new LinkedList<>();\n" +
            "       // Add elements\n" +
            "       linkedList.add(''Element1'');\n" +
            "       linkedList.add(''Element2'');\n" +
            "       linkedList.add(''Element3'');\n" +
            "       // Remove an element\n" +
            "       linkedList.remove(''Element2'');\n" +
            "       // Iterate through the list\n" +
            "       for (String element : linkedList) {\n" +
            "           System.out.println(element);\n" +
            "       }\n\n" +
            "   }\n}\n\n");

        // Vector template
        System.out.println("Vector Template:\n\n" +
            "import java.util.Vector;\n" +
            "public class MyVectorExample {\n" +
            "   public static void main(String[] args) {\n\n" +
            "       Vector<String> vector = new Vector<>();\n" +
            "       // Add elements\n" +
            "       vector.add(''Element1'');\n" +
            "       vector.add(''Element2'');\n" +
            "       vector.add(''Element3'');\n" +
            "       // Remove an element\n" +
            "       vector.remove(''Element2'');\n" +
            "       // Iterate through the vector\n" +
            "       for (String element : vector) {\n" +
            "           System.out.println(element);\n" +
            "       }\n\n" +
            "   }\n}\n\n");

        returnListMenu();
    }

    public static void troubleshootingLists(){

        System.out.println("ArrayList:\nDid you import the proper class?"+
        "\n\nDid you misspell any method names>\n\nIs the item you're working"+
        "with actually exist?");
    

        returnListMenu();
    }

    public static void advancedApplicationsLists(){

        System.out.println("Some advanced applications of lists are as follows:"+
        "\n-Library Management Systems\nMusic Playlist Management\nExpression Evaluation\nShopping Cart System\n");
        returnListMenu();
    }

    public static void exercisesLists(){

        System.out.println("Create an ArrayList named shoppingList to store grocery items." +
        "\nAdd milk, eggs, and bread to the list.\nPrint the list of items."+
        "Remove bread from the list.\nAdd bananas to the list.\nPrint the list.");

        System.out.println("\n\nCreate a LinkedList named toDoList\n"+
        "Add ''Read a book'', ''walk dog'', ''wash fruit''"+
        "to your list.\nNow, remove ''Read a book''\nAdd ''practice Java''" +
        "\nFinally, print your list. ");

        System.out.println("Create a Vector named movieRatings to store ratings of movies."+
        "\nAdd ratings for several movies (5, 4, 3, etc.)."+
        "\nPrint the initial list of movie ratings."+
        "\nRemove a rating from the list (remove the rating for the second movie)."+
        "\nAdd a new rating to the list (add a rating for a new movie)."+
        "\nPrint the final list of movie ratings.");

        System.out.println("Vector List Exercise: Book Inventory\n" +
        "Create a Vector named bookInventory to store information about books.\n" +
        "Add details for several books, including title and author.\n" +
        "Print the initial list of books in the inventory.\n" +
        "Remove a book from the list (remove the second book).\n" +
        "Add a new book to the inventory (add a book with a new title and author).\n" +
        "Print the final list of books in the inventory.\n");

        System.out.println("Stack Exercise: Browser History\n" +
        "Create a Stack named browserHistory to simulate a browser's page navigation.\n" +
        "Simulate navigating through web pages by pushing URLs onto the stack.\n" +
        "Print the initial browser history.\n" +
        "Navigate back (pop) to the previous page (remove the last URL).\n" +
        "Navigate forward (push) to a new page (e.g., add a new URL).\n" +
        "Print the final browser history.\n");

        System.out.println("ArrayList Exercise: Movie Queue\n" +
        "Create an ArrayList named movieQueue to represent a queue of movies to watch.\n" +
        "Add several movies to the queue ( 'Inception', 'The Shawshank Redemption', 'The Matrix').\n" +
        "Print the initial movie queue.\n" +
        "Remove the first movie from the queue (watch the first movie).\n" +
        "Add a new movie to the end of the queue (add 'The Dark Knight').\n" +
        "Print the final movie queue.\n");

        returnListMenu();
    }

    public static void resourcesLists(){

        System.out.println("Visit javatpoint.com/javalists for more information on lists in Java! :)");

        returnListMenu();

    }

}
