
public class TransactionManager {

    void depositMoney(BankAccount currentUser, int amount) {
        currentUser.balance += amount;
        System.out.println(amount + "/- Deposited.");
        System.out.println("Current Balance : " + currentUser.balance);
    }

    void withdrawMoney(BankAccount currentUser, int amount) {
        if (currentUser.balance >= amount) {
            currentUser.balance -= amount;
            System.out.println(amount + "/- Debited.");
            System.out.println("Current Balance : " + currentUser.balance);
        } else {
            System.out.print("Insufficient Balance! ,");
            System.out.println("Current Balance : " + currentUser.balance);
        }
    }

    void checkBalance(BankAccount currentUser) {
        System.out.println("\nCurrent Balance : " + currentUser.balance);
    }

    void accountDetails(BankAccount currentUser){
        System.out.println("\nAccount Holder : " + currentUser.name);
        System.out.println("Account Number : " + currentUser.accNumber);
        System.out.println("Account Balance : " + currentUser.balance);
     }
}
