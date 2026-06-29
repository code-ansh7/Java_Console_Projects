
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===================================");
        System.out.println("   BANK MANAGEMENT SYSTEM v1.0     ");
        System.out.println("===================================");
        System.out.println();
        System.out.print("1.Create Account.\n2.Login.\n3.Exit.");
        System.out.println();
        System.out.print("\nEnter Your Choice : ");
        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            case 1:
                System.out.println("=========== CREATE ACCOUNT ===========");
                System.out.println();
                Validation valid = new Validation();
                FileManager fm = new FileManager();
                //Inputs + Validations
                String name;
                while (true) {
                    System.out.print("Enter Account Holder Name : ");
                    name = sc.nextLine();
                    if (valid.checkName(name)) {
                        break; // Name valid hai, loop se bahar niklo
                    }
                }

                long accNumber;
                while (true) {
                    System.out.print("Enter Account Number : ");
                    accNumber = sc.nextLong();
                    if (valid.checkAccountNumber(accNumber)) {
                        break;
                    }
                }

                int pin;
                while (true) {
                    System.out.print("Enter Your PIN : ");
                    pin = sc.nextInt();
                    if (valid.checkPin(pin)) {
                        break;
                    }
                }

                int balance;
                while (true) {
                    System.out.print("Enter Initial Balance : ");
                    balance = sc.nextInt();
                    if (valid.checkBalance(balance)) {
                        break;// Balance valid hai, loop se bahar niklo
                    }
                }

                BankAccount acc = new BankAccount();

                acc.createAccount(name, accNumber, pin, balance);
                if(fm.saveAccount(name, accNumber, pin, balance)){
                    acc.displayAccount();
                    System.out.println("\nAccount Saved Successfully...");
                }
                else {
                    System.out.println("\nAccount Not Saved, Please try again!");
                }
         
                break;//case 1 break

            case 2:
                System.out.println("Login Selected.");
                break;
            case 3:
                System.out.println("Thank You For Using My Bank Management System.");
                break;
            default:
                System.out.println("Invalid Choice.");

        }
        sc.close();
    }
}
