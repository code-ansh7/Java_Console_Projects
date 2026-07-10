public class Validtion {
    boolean checkAnswer(String answer){
        if(answer.length() == 1){
            answer = answer.toUpperCase();
            char ch = answer.charAt(0);
            if(ch == 'A' || ch == 'B' || ch == 'C' || ch == 'D'){
                return true;
            }
        }
        return false;
    }
}
