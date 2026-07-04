import java.util.Scanner;

public class ExpenseManager {
    Scanner sc = new Scanner(System.in);

    void addExpense() {
        System.out.println("========== ADD EXPENSE ==========");
        System.out.print("Enter Category: ");
        String category = sc.nextLine();
        System.out.print("Enter Reason: ");
        String reason = sc.nextLine();
        System.out.print("Enter Amount: ");
        int amount = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Date: ");
        String date = sc.nextLine();

        int expenseId = 1;
        Expense exp = new Expense();
        exp.createExpense(expenseId, category, reason, amount, date);
        exp.displayExpense();
        FileManager fm = new FileManager();
        fm.saveExpense(exp);
    }

}
