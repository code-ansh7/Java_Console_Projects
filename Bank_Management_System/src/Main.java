import java.util.Scanner;

public class Main{
    public static void main(String args[]){
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
 
        switch(choice){
            case 1:  
                    System.out.println("=========== CREATE ACCOUNT ===========");
                        System.out.println(); 
                    System.out.print("Enter Account Holder Name : ");
                    String name = sc.nextLine();
                    System.out.print("Enter Account Number : ");
                    long accNumber = sc.nextLong();
                    System.out.print("Enter Your PIN : ");
                    int pin = sc.nextInt();
                    System.out.print("Enter Initial Balance : ");
                    int balance = sc.nextInt();
    
                    BankAccount acc = new BankAccount();
                    acc.createAccount(name, accNumber, pin, balance);
                    acc.displayAccount();
                    break;

            case 2: System.out.println("Login Selected.");
                    break;
            case 3: System.out.println("Thank You For Using My Bank Management System.");
                    break;
            default: System.out.println("Invalid Choice.");

        }
        sc.close();
    }
}