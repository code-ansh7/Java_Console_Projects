
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

    BankAccount loginAccount(long accNumber, int pin) {
        try {
            BufferedReader br = new BufferedReader(new FileReader     ("../database/accounts.txt"));
             String name = "";
            int balance = 0;

            String line;
            while ((line = br.readLine()) != null) {

                if (line.startsWith("Name")) {
                    name = line.substring(line.indexOf(":") + 2);
                }
                if (line.startsWith("Account Number")) {
                    if (line.contains(String.valueOf(accNumber))) {
                        line = br.readLine(); // PIN line
                        if (line.contains(String.valueOf(pin))) {
                            line = br.readLine(); // Balance line
                            balance = Integer.parseInt(//to convert string to int 
                                    line.substring(line.indexOf(":") + 2));
                            br.close();
                            return new BankAccount(
                                    name,
                                    accNumber,
                                    pin,
                                    balance);

                        }
                    }
                }
            }

            br.close();

        } catch (Exception e) {

            System.out.println(e);

        }

        return null;

    }
}
