
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

    void searchExpense(String description){
        try{
            BufferedReader br = new BufferedReader(new FileReader("../database/expenses.csv"));
            String line;
            boolean found = false;
            while((line = br.readLine()) != null){
                if(line.startsWith("Category")){
                    continue;
                }
                String data[] = line.split(", ");
                if(data[1].trim().equalsIgnoreCase(description)){
                    found = true;
                    System.out.println();
                    System.out.println("Expense Found...");
                    System.out.println();
                    System.out.println("Category    : " + data[0]);
                    System.out.println("Description : " + data[1]);
                    System.out.println("Amount      : " + data[2]);
                    System.out.println("Date        : " + data[3]);
                    System.out.println();
                    break;
                } 
            }
            if(!found){
                System.out.println(description + " Not Found!");
            }
            br.close();
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
