public class Expense {

    int expenseId;
    String category;
    String reason;
    int amount;
    String date;

    void createExpense(int expenseId,String category,String reason,int amount,String date){
        this.expenseId = expenseId;
        this.category = category;
        this.reason = reason;
        this.amount = amount;
        this.date = date;
        System.out.println();
        System.out.println("Expense Created Successfully...");

    }

    void displayExpense() {

        System.out.println("Expense ID : " + expenseId);
        System.out.println("Category   : " + category);
        System.out.println("Reason     : " + reason);
        System.out.println("Amount     : " + amount);
        System.out.println("Date       : " + date);

    }

    
}

   
