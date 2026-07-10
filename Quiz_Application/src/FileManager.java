import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileManager{
    ArrayList<Question> loadQuestions(){

        ArrayList<Question> questions = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(
                new FileReader("../database/questions.csv"));

            String line;
            while((line = br.readLine()) != null){
                if(line.startsWith("Question")){
                    continue;
                }
                String data[] = line.split(", ");
                
                String question = data[0];
                String optionA  = data[1];
                String optionB  = data[2];
                String optionC  = data[3];
                String optionD  = data[4];
                char correctAnswer = data[5].charAt(0);

                Question q = new Question(// Object Creation With Constructor.
                    question, optionA, optionB, optionC, optionD, correctAnswer
                );

                questions.add(q);
            }
            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return questions;
    }
}