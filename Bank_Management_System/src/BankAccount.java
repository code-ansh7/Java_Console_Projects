public class BankAccount {
    String name;
    long accNumber;
    int pin;
    int balance;
    void createAccount(String name, long accNumber, int pin, int balance){
        this.name = name;
        this.accNumber = accNumber;
        this.pin = pin;
        this.balance = balance;
        System.out.println();
        System.out.println("Account Created Sucessfully...\n");
    }
    void displayAccount(){
        System.err.println("============ Account Details ============\n");
        System.out.println("Account Holder : " + name);
        System.err.println("Account Number : " + accNumber);
        System.err.println("Account Balance : " + balance);
    }
}
