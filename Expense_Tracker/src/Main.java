import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dashboard db = new Dashboard();
        db.showDashboard();// Print Dashboard.
        int choice = db.dashboardChoice(); // Input Choice from the User.
        System.out.println();
        sc.nextLine();// Buffer Cleanup.
        ExpenseManager em = new ExpenseManager();
        switch(choice){
            case 1: em.addExpense();
                    break;

            case 2: em.viewExpense();
                    break;

            case 3: em.searchExpense();
                    break;
            case 4: System.out.println("Coming Soon...");
                    break;
            case 5: System.out.println("Coming Soon...");
                    break;
            case 6: System.out.println("Coming Soon...");
                    break;
        }

    }
}
