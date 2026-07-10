
import java.util.ArrayList;
import java.util.Scanner;

public class QuizManager {

    Scanner sc = new Scanner(System.in);
    FileManager fm = new FileManager();
    ArrayList<Question> questions = fm.loadQuestions();

    void startQuiz() {
        int score = 0;
        int wrong = 0;
        for (int i = 0; i < questions.size(); i++) {
            Question q = questions.get(i);
            System.out.println("========================================");
            System.out.println("              Question " + (i + 1) + "/" + questions.size());
            q.displayQuestion();
            Validtion valid = new Validtion();
            String answer;
            while (true) { 
                System.out.print("Enter Your Answer (A,B,C,D): ");
                answer = sc.nextLine();
                if(valid.checkAnswer(answer)) break;
                System.out.println();
                System.out.println("Please Enter only (A, B, C or D)");
                System.out.println();
            }
            
            answer = answer.toUpperCase();
            if (answer.charAt(0) == q.correctAnswer) {
                System.out.println();
                System.out.println("Correct Answer...");
                score++;
                System.out.println();
            } else {
                System.out.println();
                wrong++;
                System.out.println("Wrong Answer!");
                System.out.println("Correct Answer: " + q.correctAnswer);
                System.out.println();
            }
        }
        System.out.println("========================================");
        System.out.println("             Quiz Completed             ");
        System.out.println("----------------------------------------");
        System.out.println("                Correct : " + score        );
        System.out.println("                Wrong   : " + wrong        );
        System.out.println("----------------------------------------");
        System.out.println("          Total Score   : " + score    );
        System.out.println("========================================");
        System.out.println();
        System.out.println("Press ENTER to return to Dashboard...");
        sc.nextLine();


    }
}
