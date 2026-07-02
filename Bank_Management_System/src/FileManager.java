
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;

public class FileManager {

    boolean saveAccount(String name, long accNumber, int pin, int balance) {

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("../database/accounts.txt", true));
            bw.write(accNumber + "," + name + "," + pin + "," + balance);
            bw.newLine();
            bw.close();
            return true;
        } catch (Exception e) {
            System.out.println("Unable to Save Account!");
            return false;
        }
    }

    BankAccount loginAccount(long accNumber, int pin) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("../database/accounts.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                String data[] = line.split(",");

                long fileAccNumber = Long.parseLong(data[0]);
                String name = data[1];
                int filePin = Integer.parseInt(data[2]);
                int balance = Integer.parseInt(data[3]);

                if (fileAccNumber == accNumber && filePin == pin) {
                    br.close();
                    return new BankAccount(name, fileAccNumber, filePin, balance);
                }
            }
            br.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    void updateBalance(BankAccount currentUser) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("../database/accounts.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("../database/temp.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                String data[] = line.split(",");
                long fileAccNumber = Long.parseLong(data[0]);
                if (fileAccNumber == currentUser.accNumber) {
                    bw.write(currentUser.accNumber + ","+ currentUser.name + ","+ currentUser.pin + ","
                    +currentUser.balance);
                } else {
                    bw.write(line);
                }
                bw.newLine();
            }
            br.close();
            bw.close();
            File oldFile = new File("../database/accounts.txt");
            File newFile = new File("../database/temp.txt");
            oldFile.delete();
            newFile.renameTo(oldFile);
            System.out.println("Balance Updated Successfully.");
        } catch (Exception e) {
            System.out.println("Unable to Update Balance!");
        }
    }
}
