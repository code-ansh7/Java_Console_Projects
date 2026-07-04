
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {

    boolean saveExpense(Expense exp) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("../database/expenses.csv", true));
            System.out.println("Saving Expense...");

            bw.write(exp.category + ", " + exp.description + ", " + exp.amount + ", " + exp.date);
            bw.newLine();
            bw.close();
            return true;

        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    void viewExpense() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("../database/expenses.csv"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
