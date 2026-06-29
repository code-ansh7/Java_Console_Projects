import java.io.BufferedWriter;
import java.io.FileWriter;

public class FileManager {

    boolean saveAccount(String name, long accNumber, int pin, int balance){
       try {
            BufferedWriter br = new BufferedWriter(new FileWriter("../database/accounts.txt" , true));
            br.write("==============================\n");
            br.write("Name           : " + name + "\nAccount Number : " + accNumber + "\nBalance        : " + balance + "\n");
            br.write("==============================\n\n");
            br.close();
            return true;
       } catch (Exception e) {
        System.out.println("Unable to Save Account!");
        return false;
       }
    }
}
