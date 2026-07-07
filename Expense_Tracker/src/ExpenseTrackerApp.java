
import java.util.Scanner;

public class ExpenseTrackerApp {
    
    Scanner sc = new Scanner(System.in);

    void start() {

        boolean isRunning = true;
        while (isRunning) {

            Dashboard db = new Dashboard();
            db.showDashboard();// Print Dashboard.
            int choice = db.dashboardChoice(); // Input Choice from the User.
            System.out.println();

            ExpenseManager em = new ExpenseManager();
            switch (choice) {
                case 1:
                    em.addExpense();
                    break;

                case 2:
                    em.viewExpense();
                    break;

                case 3:
                    em.searchExpense();
                    break;
                case 4:
                    em.deleteExpense();
                    break;
                case 5:
                    em.totalExpense();
                    break;
                case 6:
                    System.out.println("Thankyou for using my Application...\n");
                    isRunning = false;
                    break;
                default: System.out.println("Invalid Choice!");
            }
        }
    }
}
