
import java.util.Scanner;

public class ExpenseManager {

    Scanner sc = new Scanner(System.in);

    void addExpense() {
        Validation valid = new Validation();
        System.out.println("========== ADD EXPENSE ==========");

        String category;
        while (true) {
            System.out.print("Enter Category : ");
            category = sc.nextLine();
            if (valid.checkCategory(category)) {
                break;
            }
        }

        String reason;
        while (true) { 
            System.out.print("Enter Reason: ");
            reason = sc.nextLine();
            if(valid.checkReason(reason)){
                break;
            }
        }

        int amount;
        while (true) { 
            System.out.print("Enter Amount: ");
            amount = sc.nextInt();
            if(valid.checkAmount(amount)){
                break;
            }
        }
        sc.nextLine();

        String date;
        while (true) { 
            System.out.print("Enter Date: ");
            date = sc.nextLine();  
            if(valid.checkDate(date)){
                break;
            }      
        }

        int expenseId = 1;
        Expense exp = new Expense();
        exp.createExpense(expenseId, category, reason, amount, date);
        FileManager fm = new FileManager();
        if (fm.saveExpense(exp)) {
            exp.displayExpense();
            System.out.println("Expense Added Successfully...");
        } else {
            System.out.println("Expense not Saved! please try Again...");
        }
    }

    void viewExpense(){
        FileManager fm = new FileManager();
        fm.viewExpense();
    }
}
