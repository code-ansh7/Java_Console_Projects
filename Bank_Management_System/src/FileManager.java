
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class FileManager {

    boolean saveAccount(String name, long accNumber, int pin, int balance) {
        try {
            BufferedWriter br = new BufferedWriter(new FileWriter("../database/accounts.txt", true));
            br.write("==============================\n");
            br.write("Name           : " + name);
            br.write("\nAccount Number : " + accNumber);
            br.write("\nPIN            : " + pin);
            br.write("\nBalance        : " + balance);
            br.write("\n==============================\n\n");
            br.close();
            return true;
        } catch (Exception e) {
            System.out.println("Unable to Save Account!");
            return false;
        }
    }

    boolean loginAccount(long accNumber, int pin) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("../database/accounts.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                // Account Number wali line mili?
                if (line.startsWith("Account Number")) {
                    // User ka account number match hua?
                    if (line.contains(String.valueOf(accNumber))) {
                        // Agli line read karo
                        line = br.readLine();
                        // PIN match hua?
                        if (line.contains(String.valueOf(pin))) {
                            br.close();
                            return true;
                        } else {
                            br.close();
                            return false;
                        }
                    }
                }
            }
            br.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        return false;
    }
}
