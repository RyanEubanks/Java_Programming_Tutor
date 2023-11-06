package JavaConcepts;
import java.util.Scanner;

public class JavaLearning {
    
   public static void main(String[] args){

      displayMenu();

   }
   
public static void displayMenu(){

System.out.println("Let's learn about Java! \n View the menu below and make a selection using the corresponding number: \n");
System.out.println("1. Lists \n 2. Sets \n 3. Queues");

Scanner input = new Scanner(System.in);
int menuChoice = input.nextInt();

   switch(menuChoice) {
      case 1:

      listsJava();

      break;

      case 2:

      setsJava();

      break;

      case 3:

      queuesJava();

      break;

      case 4: 

      hashMaps();

      default:
      System.out.println("Your selection is invalid. Try again:");
      displayMenu();

   }

input.close();
}


public static void listsJava(){

   System.out.println("You'd like to learn more about lists in Java! Let's begin. Please make a selection from the menu: ");
   System.out.println("1. General Purpose of Lists \n 2. Different Types of Lists in Java \n 3. Examples of Lists in Java \n 4. Test Your Knowledge");

   Scanner input = new Scanner(System.in);
   int menuChoice = input.nextInt();

      switch(menuChoice) {
         case 1: 

         


      }

      input.close();

}


public static void setsJava(){

   System.out.println("You'd like to learn more about sets in Java! Let's begin: ");
   System.out.println("1. General Purpose of Sets \n 2. Different Types of Sets in Java \n 3. Examples of Sets in Java \n 4. Test Your Knowledge");

}


public static void queuesJava(){

   System.out.println("You'd like to learn more about queues in Java! Let's begin: ");

}  

public static void hashMaps(){

   System.out.println("You'd like to learn more about Hashmaps in Java! Let's begin: ");

}

   
}


