public class Question {
    String question;
    String optionA;
    String optionB;
    String optionC;
    String optionD;
    char correctAnswer;

    public Question(String question, String optionA, String optionB, String optionC, String optionD, char correctAnswer) {

        this.question = question;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
        this.correctAnswer = correctAnswer;

    }

    void displayQuestion(){
        System.out.println("=============== Question ===============");
        System.out.println();
        System.out.println(question);
        System.out.println();
        System.out.println("A. " + optionA);
        System.out.println();
        System.out.println("B. " + optionB);
        System.out.println();
        System.out.println("C. " + optionC);
        System.out.println();
        System.out.println("D. " + optionD);
        System.out.println();
    }

}