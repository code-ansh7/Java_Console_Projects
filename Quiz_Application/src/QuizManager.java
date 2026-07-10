import java.util.ArrayList;
import java.util.Scanner;

public class QuizManager {
    Scanner sc = new Scanner(System.in);
    FileManager fm = new FileManager();
    ArrayList<Question> questions = fm.loadQuestions();

    void startQuiz(){
        Question q1 = questions.get(0);
        q1.displayQuestion();
        System.out.print("Enter Your Answer (A/B/C/D): ");
        String answer = sc.nextLine();
        answer = answer.toUpperCase();
        if(answer.charAt(0) == q1.correctAnswer){
            System.out.println();
            System.out.println("Correct Answer...");
            System.out.println();
        } else {
            System.out.println();
            System.out.println("Wrong Answer!");
            System.out.println("Correct Answer: " + q1.correctAnswer);
            System.out.println();
        }
    }
}
