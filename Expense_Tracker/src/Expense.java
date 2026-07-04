public class Expense {

    String category;
    String description;
    int amount;
    String date;

    void createExpense(String category,String description,int amount,String date){
        this.category = category;
        this.description = description;
        this.amount = amount;
        this.date = date;
        System.out.println();
        System.out.println("Expense Created Successfully...");

    }

    void displayExpense() {

        System.out.println("Category   : " + category);
        System.out.println("Description: " + description);
        System.out.println("Amount     : " + amount);
        System.out.println("Date       : " + date);

    }


}

   
