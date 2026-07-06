
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

        String description;
        while (true) { 
            System.out.print("Enter Description: ");
            description = sc.nextLine();
            if(valid.checkDescription(description)){
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


        FileManager fm = new FileManager();
        Expense exp = new Expense();
        exp.createExpense(category, description, amount, date);
       
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
 
    void searchExpense(){
        
    }
}
