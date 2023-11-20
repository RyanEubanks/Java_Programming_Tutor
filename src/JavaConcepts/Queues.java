package JavaConcepts;
import java.util.Scanner;

public class Queues {
    
    public static void queueMenu(){

        System.out.println("You'd like to learn more about queues in Java! Let's begin! Select from the menu");
        System.out.println("1. General Purpose of Queues\n2. Example of a Queue in Java\n3. Code Templates\n4. Troubleshooting\n5. Advanced Applications\n6. Exercises\n7. Resources\n8. Return to the Main Menu\n");

        Scanner input = new Scanner(System.in);
        int menuChoice = input.nextInt();

        switch (menuChoice) {
            case 1:
                queueInfo();
                break;

            case 2:
                queueExample();
                break;

            case 3:
                codeTemplatesQueue();
                break;

            case 4:
                troubleshootingQueue();
                break;

            case 5:
                advancedApplicationsQueue();
                break;

            case 6:
                exercisesQueue();
                break;

            case 7:

                resourcesQueue();
                break;

            case 8:
                JavaLearning.displayMenu();
                break;

            default:
                System.out.println("Invalid selection. Please try again.\n");
                queueMenu();
        }

        input.close();
    }

    public static void returnQueueMenu() {

        Scanner input = new Scanner(System.in);

        System.out.println("Would you like to return to the Queue Menu? Enter 1 for yes, 2 for Main Menu: \n");

        int userInput = input.nextInt();

        switch (userInput) {

            case 1:
                queueMenu();
                break;

            case 2:
                JavaLearning.displayMenu();
                break;

            default:
                break;
        }

        input.close();
    }

    public static void queueInfo() {

        System.out.println("\n\nA Queue is a data structure that follows the First-In-First-Out (FIFO) principle. " +
                "For queues, the element that is added first is the first one to be removed.\n");
        System.out.println("Queues are sometimes used in scenarios where elements are processed in the order they arrive. " +
                "For example, in task scheduling, printing queue, etc.\n");
        System.out.println("In Java, the Queue interface is part of the Java Collections Framework. " +
                "Common types of queues include LinkedList and PriorityQueue.\n");
    
        returnQueueMenu();
    }

    public static void queueExample() {

        System.out.println("This is an example of using a Queue to manage a print job queue:\n\n");
        System.out.println("Queue Example:\n\n" +
                "import java.util.LinkedList;\n" +
                "import java.util.Queue;\n\n" +
                "public class PrintJobQueue {\n" +
                "   public static void main(String[] args) {\n\n" +
                "       Queue<String> printQueue = new LinkedList<>();\n\n" +
                "       // Add print jobs to the queue\n" +
                "       printQueue.add(''Document1'');\n" +
                "       printQueue.add(''Document2'');\n" +
                "       printQueue.add(''Document3'');\n\n" +
                "       // Process print jobs in the order they arrive\n" +
                "       while (!printQueue.isEmpty()) {\n" +
                "           String currentJob = printQueue.poll();\n" +
                "           System.out.println(''Printing: '' + currentJob);\n" +
                "       }\n\n" +
                "   }\n}");

        returnQueueMenu();
    }

    public static void codeTemplatesQueue() {

        System.out.println("Queue Template:\n\n" +
                "import java.util.LinkedList;\n" +
                "import java.util.Queue;\n\n" +
                "public class MyQueueExample {\n" +
                "   public static void main(String[] args) {\n\n" +
                "       Queue<String> myQueue = new LinkedList<>();\n" +
                "       // Add elements to the queue\n" +
                "       myQueue.add(''Element1'');\n" +
                "       myQueue.add(''Element2'');\n" +
                "       myQueue.add(''Element3'');\n" +
                "       // Remove the front element from the queue\n" +
                "       String frontElement = myQueue.poll();\n" +
                "       // Print the front element\n" +
                "       System.out.println(''Front Element: '' + frontElement);\n" +
                "       // Peek at the front element without removing\n" +
                "        String peekedElement = myQueue.peek();\n" +
                "       System.out.println(''Peeked Element: '' + peekedElement);\n\n" +
                "   }\n}");

        returnQueueMenu();
    }

    public static void troubleshootingQueue() {

        System.out.println("Queue:\n- Ensure you have imported the correct Queue class.\n" +
                "- Check for any misspelled method names.\n" +
                "- Verify that the elements you are working with actually exist in the queue.\n");

        returnQueueMenu();
    }

    public static void advancedApplicationsQueue() {

        System.out.println("Advanced applications of queues include:\n" +
                "- Task Scheduling Systems\n- Print Job Queues\n- Message Queues in Distributed Systems\n");

        returnQueueMenu();
    }

    public static void exercisesQueue() {

        System.out.println("Exercise 1: Print Job Queue\n" +
                "Create a Queue named printJobQueue to manage a print job queue.\n" +
                "Add several print jobs (documents) to the queue.\n" +
                "Print the initial print job queue.\n" +
                "Process print jobs in the order they arrive (remove and print each job).\n" +
                "Print the final print job queue.\n");

        System.out.println("Exercise 2: Task Scheduler\n" +
                "Create a Queue named taskQueue to create a task scheduler.\n" +
                "Add a few tasks to the queue with different priorities (some are more important than others).\n" +
                "Print the initial task queue.\n" +
                "Process tasks based on priority (remove and execute each task).\n" +
                "Print the final task queue.\n");

        returnQueueMenu();
    }

    public static void resourcesQueue() {

        System.out.println("Here are some resources to learn more about Queues in Java:\n");
        System.out.println("1. Java Queue Interface Documentation: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Queue.html");
        System.out.println("2. GeeksforGeeks - Queue in Java: https://www.geeksforgeeks.org/queue-interface-java/");
        System.out.println("3. Baeldung - Introduction to Queues in Java: https://www.baeldung.com/java-queue");
        System.out.println("4. JavaTpoint - Java Queue: https://www.javatpoint.com/java-queue");

        returnQueueMenu();

    }

}




