import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {

    boolean saveExpense(Expense exp) {
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("../database/expenses.csv",true));
        System.out.println("Saving Expense...");

        bw.write(exp.expenseId + ", " + exp.category + ", " + exp.reason + ", " + exp.amount + ", " + exp.date);
        bw.newLine();
        bw.close();
        return true;

        } catch(IOException e){
            e.printStackTrace();
            return false;
        }
    }

    
}