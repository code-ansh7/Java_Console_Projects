public class TransactionManager {
    void depositMoney(BankAccount currentUser, int amount){
        currentUser.balance += amount;
        System.out.println(amount + "/- Deposited.");
        System.out.println("Current Balance : " + currentUser.balance);
    }

    void withdrawMoney(BankAccount currentUser, int amount){
        if(currentUser.balance >= amount){
            currentUser.balance -= amount;
            System.out.println(amount + "/- Credited.");
            System.out.println("Current Balance : " + currentUser.balance);
        }
        else{
            System.out.print("Insufficient Balance! ,");
            System.out.println("Current Balance : " + currentUser.balance);
        }
    }
}

