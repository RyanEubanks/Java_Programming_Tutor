package JavaConcepts;
import java.util.Scanner;

public class JavaLearning {
    
   public static void main(String[] args){

      displayMenu();
     
   }

   public static void displayMenu(){

      System.out.println("Let's learn about Java! \nView the menu below and make a selection using the corresponding number: \n");
      System.out.println("1. Lists \n2. Sets \n3. Queues\n\nEnter 4 to exit the menu\n");

      Scanner input = new Scanner(System.in);
      int menuChoice = input.nextInt();



      switch(menuChoice) {
         case 1:

         Lists.listMenu();

         displayMenu();

         break;

         case 2:

         Sets.setsMenu();

         displayMenu();

         break;

         case 3:

         Queues.queueMenu();

         displayMenu();

         break;

         case 4:

         break;

   
         default:
         System.out.println("Your selection is invalid. Try again:");
         displayMenu();

         input.close();
      }  

      
      
   
   }

}





