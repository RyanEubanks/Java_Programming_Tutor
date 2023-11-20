package Quiz;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Quiz {
    public static void quiz() {
        ArrayList<String> questions = new ArrayList<>();
        ArrayList<String> answers = new ArrayList<>();
        int randQ, correct = 0;
        Random rand = new Random();
        Scanner ans = new Scanner(System.in);

        try {
            Scanner sc = new Scanner(new File("src\\Quiz\\questions.txt"));

            for(int j = 0; j < 40; j++) {
                questions.add(sc.nextLine());
                answers.add(sc.nextLine());
            }
            sc.close();
        } catch(FileNotFoundException e) {
            System.out.println("Error found: " + e);
        }

        for(int i = 0; i < 5; i++) {
            randQ = rand.nextInt(0, 40-i);
            System.out.println(questions.get(randQ));
            System.out.println("Please select the correct answer. ");
            if(ans.nextLine().equalsIgnoreCase(answers.get(randQ))) {
                System.out.println("Correct!");
                correct++;
            } else {
                System.out.println("Incorrect!");
            }

            questions.remove(randQ);
            answers.remove(randQ);
        }

        System.out.println("You got " + correct + "/5 questions correct.");

        ans.close();
    }
}