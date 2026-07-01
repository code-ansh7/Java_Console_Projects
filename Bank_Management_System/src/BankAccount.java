public class BankAccount {
    String name;
    long accNumber;
    int pin;
    int balance;
    // Default Constructor
    BankAccount() {

    }
    // Parameterized Constructor
    BankAccount(String name, long accNumber, int pin, int balance) {
        this.name = name;
        this.accNumber = accNumber;
        this.pin = pin;
        this.balance = balance;
    }

    void createAccount(String name, long accNumber, int pin, int balance){
        this.name = name;
        this.accNumber = accNumber;
        this.pin = pin;
        this.balance = balance;
        System.out.println();
        System.out.println("Account Created Sucessfully...\n");
    }
    void displayAccount(){
        System.out.println("============ Account Details ============\n");
        System.out.println("Account Holder : " + name);
        System.out.println("Account Number : " + accNumber);
        System.out.println("Account Balance : " + balance);
    }
}
