public class TransactionManager {
    void depositMoney(BankAccount currentUser, int amount){
        currentUser.balance += amount;
        System.out.println(amount + "/- Deposited.");
        System.out.println("Current Balance : " + currentUser.balance);
    }
}

