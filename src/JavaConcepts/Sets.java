package JavaConcepts;
import java.util.Scanner;

public class Sets {
    public static void setsMenu(){

        System.out.println("You'd like to learn more about sets in Java! Let's begin: ");
        System.out.println("1. General Purpose of Sets\n2. Example of a Set in Java\n3. Code Templates\n4. Troubleshooting\n5. Advanced Applications\n6. Hands-On Exercises\n7. Resources\n8. Return to the Main Menu\n");

        Scanner input = new Scanner(System.in);
        int menuChoice = input.nextInt();

        switch (menuChoice) {
            case 1:
                setsInfo();
                break;

            case 2:
                setsExample();
                break;

            case 3:
                codeTemplatesSets();
                break;

            case 4:
                troubleshootingSets();
                break;

            case 5:
                advancedApplicationsSets();
                break;

            case 6:
                exercisesSets();
                break;

            case 7:
                resourcesSets();
                break;

            case 8:
                JavaLearning.displayMenu();
                break;

            default:
                System.out.println("Invalid selection. Please try again.\n");
                setsMenu();
        }

        input.close();
    }

    public static void returnSetsMenu() {

        Scanner input = new Scanner(System.in);

        System.out.println("Would you like to return to the Sets Menu? Enter 1 for yes, 2 for Main Menu: \n");

        int userInput = input.nextInt();

        switch (userInput) {

            case 1:
                setsMenu();
                break;

            case 2:
                JavaLearning.displayMenu();
                break;

            default:
                break;
        }

        input.close();
    }

    public static void setsInfo() {

        System.out.println("\n\nA Set is a collection of distinct elements. It does not allow duplicate elements.\n");
        System.out.println("Sets are useful when you want to store multiple items without duplicates, " +
                "and you don't need to maintain the order of elements.\n");
        System.out.println("In Java, the Set interface is part of the Java Collections Framework. Common implementations include HashSet, " +
                "LinkedHashSet, and TreeSet.\n");
        System.out.println("To create a Set in Java, you can use:\n\nSet<String> mySet = new HashSet<>();\n");

        returnSetsMenu();
    }

    public static void setsExample() {

        System.out.println("Here's a simple example of using a HashSet to manage a set of unique names:\n\n");
        System.out.println("Set Example:\n\n" +
                "import java.util.HashSet;\n" +
                "import java.util.Set;\n\n" +
                "public class UniqueNamesSet {\n" +
                "   public static void main(String[] args) {\n\n" +
                "       Set<String> uniqueNames = new HashSet<>();\n\n" +
                "       // Add names to the set\n" +
                "       uniqueNames.add(''Alice'');\n" +
                "       uniqueNames.add(''Bob'');\n" +
                "       uniqueNames.add(''Charlie'');\n" +
                "       uniqueNames.add(''Alice''); // Duplicate, won't be added\n\n" +
                "       // Iterate through the unique names\n" +
                "       for (String name : uniqueNames) {\n" +
                "           System.out.println(name);\n" +
                "       }\n\n" +
                "   }\n}");

        returnSetsMenu();
    }

    public static void codeTemplatesSets() {

        System.out.println("HashSet Template:\n\n" +
                "import java.util.HashSet;\n" +
                "import java.util.Set;\n\n" +
                "public class MyHashSetExample {\n" +
                "   public static void main(String[] args) {\n\n" +
                "       Set<String> mySet = new HashSet<>();\n" +
                "       // Add elements to the set\n" +
                "       mySet.add(''Element1'');\n" +
                "       mySet.add(''Element2'');\n" +
                "       mySet.add(''Element3'');\n" +
                "       // Remove an element from the set\n" +
                "       mySet.remove(''Element2'');\n" +
                "       // Iterate through the set\n" +
                "       for (String element : mySet) {\n" +
                "           System.out.println(element);\n" +
                "       }\n\n" +
                "   }\n}");

        returnSetsMenu();
    }

    public static void troubleshootingSets() {

        System.out.println("Sets:\n- Ensure you have imported the correct Set class.\n" +
                "- Check for any misspelled method names.\n" +
                "- Remember that Sets do not allow duplicate elements, so adding the same element twice won't change the set.\n");

                returnSetsMenu();
            }

            public static void advancedApplicationsSets() {

                System.out.println("Some advanced applications of sets are as follows:\n" +
                        "- Checking for duplicate elements in a collection.\n" +
                        "- Finding the intersection, union, or difference between two sets.\n" +
                        "- Implementing mathematical set operations in algorithms.\n");
        
                returnSetsMenu();
            }
        
            public static void exercisesSets() {
        
                System.out.println("Create a HashSet named uniqueNumbers to store unique integers." +
                        "\nAdd several integers to the set (e.g., 5, 10, 15)." +
                        "\nPrint the initial set of numbers." +
                        "\nTry adding a duplicate number (e.g., add 10 again)." +
                        "\nPrint the final set of numbers.");
        
                System.out.println("\n\nCreate a Set named programmingLanguages." +
                        "\nAdd several programming languages to the set (Java, Python, C++)." +
                        "\nPrint the initial set of programming languages." +
                        "\nRemove a programming language from the set (remove Java)." +
                        "\nAdd a new programming language to the set (add JavaScript)." +
                        "\nPrint the final set of programming languages.");
        
                returnSetsMenu();;
            }
        
            public static void resourcesSets() {
        
                System.out.println("Here are some resources to learn more about Sets in Java:\n");
                System.out.println("1. Java Set Interface Documentation: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Set.html");
                System.out.println("2. GeeksforGeeks - Set in Java: https://www.geeksforgeeks.org/set-in-java/");
                System.out.println("3. Baeldung - Introduction to Sets in Java: https://www.baeldung.com/java-set");
                System.out.println("4. JavaTpoint - Java Set: https://www.javatpoint.com/java-set");
        
                returnSetsMenu();
            }

    }


