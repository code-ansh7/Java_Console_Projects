import java.util.*;
public class Dashboard {
    
    void showDashboard(){
        System.out.println("===================================");
        System.out.println("          Expense Tracker          ");
        System.out.println("===================================");
        System.out.println();
        System.out.println("1.Add Expense.");
        System.out.println("2.View Expense.");
        System.out.println("3.Search Expense by Description.");
        System.out.println("4.Delete Expense by Description.");
        System.out.println("5.Total Expense.");
        System.out.println("6.Exit.");
        System.out.println();
        System.out.println("Rule : Description Must be Unique...");
        System.out.println();
    }

    int dashboardChoice(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Choice: ");
        int choice = sc.nextInt();
        return choice;
    }
}
 